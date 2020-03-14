package oebbWeb.StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import oebbWeb.StepDefinition.BaseSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestTicketMobileSteps extends BaseSteps {
	AppiumDriver<MobileElement> driver;

	@Given("The OEBB Ticket was started on an Android device and navigates to book a ticket")
	public void the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Initiating client!");
		File app = new File("./jar/oebbMobileApp.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 29");
		capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability("autoGrantPermissions","true");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
		//you are free to set additional capabilities

		try {
			driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			//driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"OK\"])[1]").click();
			///driver.findElementByName("OK").click();
			driver.findElementById("at.oebb.ts:id/header_addticket").click();
			driver.findElementById("at.oebb.ts:id/header_addticket").click();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		//System.out.println(driver.getStatus());
    }		

    @When("^Chooses ([^\"]*) ticket\\(s\\) from ([^\"]*) nach ([^\"]*) on the ([^\"]*) at ([^\"]*)$")
    public void choosesOneTicket(int ticketAnzahl, String depatureStation, String arrivalStation, String travelDate, String travelTime) throws InterruptedException {
		String[] hoursAndMinutes;
		int hours;
		int minutes;

		PointOption depatureStationPoint = new PointOption();
		depatureStationPoint.withCoordinates(996,378);

		/*PointOption timeHours09Point = new PointOption();
		timeHours09Point.withCoordinates(279,1164);
		PointOption timeMinutes00Point = new PointOption();
		timeMinutes00Point.withCoordinates(534,832);*/
		PointOption timeHoursPoint = new PointOption();
		PointOption timeMinutesPoint = new PointOption();

		//Enter Depature Station
		MobileElement depatureStationElement = driver.findElementByAccessibilityId("departure city or station");
		depatureStationElement.sendKeys(depatureStation);

		//Confirm tick to save depature city
		new TouchAction(driver).tap(depatureStationPoint).perform();

		//Enter Arrival Station
		MobileElement arrivalStationElement = driver.findElementByAccessibilityId("arrival city or station");
		arrivalStationElement.sendKeys(arrivalStation);

		//Confirm Arrival Station and return to previous menu
		MobileElement confirmArrivalStation = driver.findElementByAccessibilityId(arrivalStation);
		confirmArrivalStation.click();

		//Select the depature time
		MobileElement depatureTime = (MobileElement) driver.findElementByAccessibilityId("Departure");
		depatureTime.click();

		hoursAndMinutes = travelTime.split(":",2);
		if(hoursAndMinutes.length == 2) {
			hours = Integer.parseInt(hoursAndMinutes[0]);
			timeHoursPoint = this.getPointOptionFromHours(hours);
			minutes = Integer.parseInt(hoursAndMinutes[1]);
			timeMinutesPoint = this.getPointOptionFromMinutes(minutes);
		}else{
			System.out.println("Ungueltige Zeit eingegeben!");
		}
		//Select 09 on the hour wheel
		new TouchAction(driver).tap(timeHoursPoint).perform();
		Thread.sleep(1000);
		//Select 00 on the minutes wheel
		new TouchAction(driver).tap(timeMinutesPoint).perform();
		Thread.sleep(1000);
		//Select Date
		MobileElement selectDate = (MobileElement) driver.findElementById("at.oebb.ts:id/dateButton");
		selectDate.click();
		Thread.sleep(1000);
		//Select the required Date
		MobileElement chooseDate = (MobileElement) driver.findElementByAccessibilityId(travelDate);
		chooseDate.click();

		//Confirm Date and Time Selection
		MobileElement confirmDateSelection = (MobileElement) driver.findElementById("at.oebb.ts:id/ok_button");
		confirmDateSelection.click();
		Thread.sleep(2000);
		//Search Tickets
		MobileElement searchTickets = driver.findElementByAccessibilityId("Single Tickets and Day Tickets");
		searchTickets.click();
		Thread.sleep(10000);

		if(ticketAnzahl >= 1){
			for (int i = 1; i < ticketAnzahl; i++) {
				MobileElement changePassengerElement = (MobileElement) driver.findElementByAccessibilityId("CHANGE");
				changePassengerElement.click();
				MobileElement addAdultElement = (MobileElement) driver.findElementByAccessibilityId("Add adult");
				addAdultElement.click();
			}
			MobileElement confirmChangeElement = (MobileElement) driver.findElementByAccessibilityId("CONFIRM");
			confirmChangeElement.click();
			Thread.sleep(10000);
		}

    }		

    @Then("^The ticket costs ([^\"]*) Euros")
    public void ergebnislisteenthaelt(String ticketCost){
		String prize = driver.findElementByAccessibilityId("€ "+ticketCost).getText();
		System.out.println(prize);
		Assert.assertEquals("€ "+ticketCost,prize);
    }
    
    private PointOption getPointOptionFromHours(int hours){
		PointOption convertedHoursToPoint = new PointOption();
		switch(hours){
			case 0:
				convertedHoursToPoint.withCoordinates(542, 805); //00
				break;
			case 1:
				convertedHoursToPoint.withCoordinates(659, 941); //1
				break;
			case 2:
				convertedHoursToPoint.withCoordinates(742, 1034); //2
				break;
			case 3:
				convertedHoursToPoint.withCoordinates(788, 1172); //3
				break;
			case 4:
				convertedHoursToPoint.withCoordinates(756, 1292); //4
				break;
			case 5:
				convertedHoursToPoint.withCoordinates(666, 1391); //5
				break;
			case 6:
				convertedHoursToPoint.withCoordinates(538, 1411); //6
				break;
			case 7:
				convertedHoursToPoint.withCoordinates(418, 1372); //7
				break;
			case 8:
				convertedHoursToPoint.withCoordinates(319, 1289); //8
				break;
			case 9:
				convertedHoursToPoint.withCoordinates(294, 1163); //9
				break;
			case 10:
				convertedHoursToPoint.withCoordinates(341, 1046); //10
				break;
			case 11:
				convertedHoursToPoint.withCoordinates(418, 954); //11
				break;
			case 12:
				convertedHoursToPoint.withCoordinates(535,917); //12
				break;
			case 13:
				convertedHoursToPoint.withCoordinates(725, 849); //13
				break;
			case 14:
				convertedHoursToPoint.withCoordinates(837, 983); //14
				break;
			case 15:
				convertedHoursToPoint.withCoordinates(898, 1170); //15
				break;
			case 16:
				convertedHoursToPoint.withCoordinates(839, 1335); //16
				break;
			case 17:
				convertedHoursToPoint.withCoordinates(720, 1462); //17
				break;
			case 18:
				convertedHoursToPoint.withCoordinates(538, 1503); //18
				break;
			case 19:
				convertedHoursToPoint.withCoordinates(360, 1459); //19
				break;
			case 20:
				convertedHoursToPoint.withCoordinates(226, 1323); //20
				break;
			case 21:
				convertedHoursToPoint.withCoordinates(190, 1158); //21
				break;
			case 22:
				convertedHoursToPoint.withCoordinates(243, 995); //22
				break;
			case 23:
				convertedHoursToPoint.withCoordinates(370, 871); //23
				break;
		}

		return convertedHoursToPoint;
	}

	private PointOption getPointOptionFromMinutes(int minutes){
		PointOption convertedMinutesToPoint = new PointOption();
		switch(minutes){
			case 00:
				convertedMinutesToPoint.withCoordinates(538, 834); //00
				break;
			case 05:
				convertedMinutesToPoint.withCoordinates(720, 871); //05
				break;
			case 10:
				convertedMinutesToPoint.withCoordinates(834, 1002); //10
				break;
			case 15:
				convertedMinutesToPoint.withCoordinates(871, 1168); //15
				break;
			case 20:
				convertedMinutesToPoint.withCoordinates(839, 1328); //20
				break;
			case 25:
				convertedMinutesToPoint.withCoordinates(710, 1455); //25
				break;
			case 30:
				convertedMinutesToPoint.withCoordinates(533, 1515); //30
				break;
			case 35:
				convertedMinutesToPoint.withCoordinates(372, 1462); //35
				break;
			case 40:
				convertedMinutesToPoint.withCoordinates(241, 1335); //40
				break;
			case 45:
				convertedMinutesToPoint.withCoordinates(209, 1163); //45
				break;
			case 50:
				convertedMinutesToPoint.withCoordinates(243, 1002); //50
				break;
			case 55:
				convertedMinutesToPoint.withCoordinates(379, 871); //60
				break;
		}

		return convertedMinutesToPoint;
	}

}
