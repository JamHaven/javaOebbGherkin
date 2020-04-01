package oebbWeb.StepDefinition;

import io.appium.java_client.touch.WaitOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Automated test of the Android application of the OEBB-Ticket Application.
 * This requires the following applications up and running:
 *  - Appium Server - Standard config
 *  - Android Studiom AVD - Virtual Android device: Pixel 2 API 29 1080x1920: 420dpi Android 10 x86
 */
public class MobileSteps extends BaseSteps {
	AppiumDriver<MobileElement> driver;

	/**
	 * Configures the virtual android device to use the OEBB-Ticket app to be used with Appium.
	 */
	@Given("The OEBB Ticket was started on an Android device and navigates to book a ticket")
	public void the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket() {
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
			driver.findElementById("at.oebb.ts:id/header_addticket").click();
			driver.findElementById("at.oebb.ts:id/header_addticket").click();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

    }

	/**
	 * Does the Booking of a ticket with the specified parameters. This ranges from choosing a time, arrival and
	 * depature station, as well as the ticket amount and discounts for the travel.
	 * @param ticketAnzahl How many tickets should be bought
	 * @param departureStation From which station does the train depart
	 * @param arrivalStation To which station does the train travel
	 * @param travelDate On which date does the Train travel
	 * @param isDepartureMessage True: Time is for depature, False: Time is for arrival
	 * @param travelTime HH:MM Format when the train arrives or departs
	 * @param discountCard Either "no" if no discount is present, or the Discount Card name
	 * @throws InterruptedException If the Sleep is interrupted... not catched
	 */
    @When("^Chooses ([^\"]*) ticket\\(s\\) from ([^\"]*) nach ([^\"]*) on the ([^\"]*), ([^\"]*) at ([^\"]*) with ([^\"]*) discount$")
    public void choosesOneTicket(int ticketAnzahl, String departureStation, String arrivalStation, String travelDate, String isDepartureMessage, String travelTime, String discountCard) throws InterruptedException {
		boolean isDepartureBoolean = true;

		//Maps the Entries to the Boolean, Default is "Departure"
		if(isDepartureMessage.equals("departure")){
			isDepartureBoolean = true;
		}else if (isDepartureMessage.equals("arrival")){
			isDepartureBoolean = false;
		}else{
			System.out.println("Ungueltige Eingabe, ob Ankunft oder Abfahrt");
		}

		//Selects arrival and departure Station and returns to booking site
		this.selectStations(arrivalStation,departureStation);

		//Switch to the corresponding time selection View (arrival or departure time)
		MobileElement depatureTime;
		if(isDepartureBoolean) {
			//Select the depature time
			 depatureTime = (MobileElement) driver.findElementByAccessibilityId("Departure");
		}else{
			//Select the arrival time
			 depatureTime = (MobileElement) driver.findElementByAccessibilityId("Arrival");

		}
		depatureTime.click();

		//Select the time (hours and minutes) and stays in the time selection view
		this.selectTime(travelTime);

		//Selects the data of travel and returns to the booking view
		this.selectDate(travelDate);

		//Add Passengers and corresponding discount card and return to booking view
		this.selectPassengerInformation(ticketAnzahl, discountCard);

    }

	/**
	 * Adds passengers to the trip, as well as discounts to every traveler
	 * @param ticketAnzahl Number of passengers
	 * @param discountCard Type of discount card
	 * @throws InterruptedException If the sleep gets interrupted
	 */
	public void selectPassengerInformation(int ticketAnzahl, String discountCard) throws InterruptedException {
		MobileElement searchTickets = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");
		searchTickets.click();
		Thread.sleep(10000);

		//If a single or multiple persons with discount should be added
		if(ticketAnzahl >= 1 && !discountCard.equals("no")){
			MobileElement changePassengerElement = (MobileElement) driver.findElementByAccessibilityId("CHANGE");
			changePassengerElement.click();
			MobileElement addDiscountElement = (MobileElement) driver.findElementByAccessibilityId("ADD DISCOUNT");
			addDiscountElement.click();
			MobileElement discountElement = (MobileElement) driver.findElementByAccessibilityId(discountCard);
			discountElement.click();
			MobileElement confirmDiscount = (MobileElement) driver.findElementByAccessibilityId("CONFIRM");
			confirmDiscount.click();
			for (int i = 1; i < ticketAnzahl; i++) {
				MobileElement addAdultElement = (MobileElement) driver.findElementByAccessibilityId("Add adult");
				addAdultElement.click();
				addDiscountElement = (MobileElement) driver.findElementByAccessibilityId("ADD DISCOUNT");
				addDiscountElement.click();
				discountElement = (MobileElement) driver.findElementByAccessibilityId(discountCard);
				discountElement.click();
				confirmDiscount = (MobileElement) driver.findElementByAccessibilityId("CONFIRM");
				confirmDiscount.click();
			}
			MobileElement confirmChangeElement = (MobileElement) driver.findElementByAccessibilityId("CONFIRM");
			confirmChangeElement.click();
			Thread.sleep(10000);
		}
		else if(ticketAnzahl > 1 && discountCard.equals("no")){ //If multiple persons without discount should be added
			MobileElement changePassengerElement = (MobileElement) driver.findElementByAccessibilityId("CHANGE");
			changePassengerElement.click();
			for (int i = 1; i < ticketAnzahl; i++) {
				MobileElement addAdultElement = (MobileElement) driver.findElementByAccessibilityId("Add adult");
				addAdultElement.click();
			}
			MobileElement confirmChangeElement = (MobileElement) driver.findElementByAccessibilityId("CONFIRM");
			confirmChangeElement.click();
			Thread.sleep(10000);
		}
		//Other cases are irrelevant, since neither a discount or multiple persons are present
	}


	/**
	 * Selects the date of travel in the UI. Returns to the booking view
	 * @param travelDate Time of Travel: DD Month YYYY
	 * @throws InterruptedException If the sleep gets interrupted
	 */
	public void selectDate(String travelDate) throws InterruptedException {
		//Select Date
		MobileElement selectDate = (MobileElement) driver.findElementById("at.oebb.ts:id/dateButton");
		selectDate.click();
		Thread.sleep(1000);

		//Select the required Date
		scrollUntilElementInAccessbilityId(travelDate);
		MobileElement chooseDate = (MobileElement) driver.findElementByAccessibilityId(travelDate);
		chooseDate.click();

		//Confirm Date and Time Selection
		MobileElement confirmDateSelection = (MobileElement) driver.findElementById("at.oebb.ts:id/ok_button");
		confirmDateSelection.click();
		Thread.sleep(4000);
	}

	/**
	 * Selects the time values from travelTime in the UI. Stays in the time selection view.
	 * @param travelTime Time in format HH:MM
	 * @throws InterruptedException If the sleep gets interrupted
	 */
	public void selectTime(String travelTime) throws InterruptedException {
		PointOption timeHoursPoint = new PointOption();
		PointOption timeMinutesPoint = new PointOption();
		String[] hoursAndMinutes;
		int hours;
		int minutes;
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
	}

	/**
	 * Selects the arrival and departure Station and confirms the selection --> return to the booking screen
	 * @param departureStation From which station does the train depart
	 * @param arrivalStation To which station does the train travel
	 * @throws InterruptedException
	 */
	public void selectStations(String arrivalStation, String departureStation) throws InterruptedException {
		//Enter Depature Station
		MobileElement depatureStationElement = driver.findElementByAccessibilityId("departure city or station");
		depatureStationElement.sendKeys(departureStation);
		Thread.sleep(2000);

		//Confirm tick to save departure city
		PointOption departureStationPoint = new PointOption();
		departureStationPoint.withCoordinates(996,378);
		new TouchAction(driver).tap(departureStationPoint).perform();

    	//Enter Arrival Station
		MobileElement arrivalStationElement = driver.findElementByAccessibilityId("arrival city or station");
		arrivalStationElement.sendKeys(arrivalStation);
		Thread.sleep(2000);
		//Confirm Arrival Station and return to previous menu
		MobileElement confirmArrivalStation = driver.findElementByAccessibilityId(arrivalStation);
		confirmArrivalStation.click();
	}

	/**
	 * Evaluates the FIRST ticket available. This is rather dependent on the entered date and the time the search is started.
	 * Unfortunately, the testers can not influence the search time, to make the tests more consistent.
	 * @param ticketCost Price of the FIRST available ticket in the result view
	 */
    @Then("^The ticket costs ([^\"]*) Euros")
    public void ergebnislisteenthaelt(String ticketCost){
		try {
			String prize = driver.findElementByAccessibilityId("€ " + ticketCost).getText();
			Assert.assertEquals("€ " + ticketCost, prize);
		}catch(NoSuchElementException nse){
			Assert.fail();
		}
    }

	/**
	 * Evaluates the first ticket, if the journey is in the past.
	 */
	@Then("^The journey is in the past")
	public void jounreyInThePast(){
		try {
			String elementText = driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"This journey is in the past\"])[1]").getText();
			Assert.assertEquals("This journey is in the past", elementText);
		}catch(NoSuchElementException nse){
			Assert.fail();
		}
	}

	/**
	 * Chooses the "Einfach-raus-Ticket option
	 */
    @When("^Choose Einfach-raus-Ticket$")
    public void einfachRaus(){
		MobileElement einfachRausButton = (MobileElement) driver.findElementByAccessibilityId("Einfach-Raus-Ticket");
		einfachRausButton.click();
	}

	/**
	 * Gets the coordinates of the requested hours, from the selection wheel. There was/is no other way to select the time there.
	 * @param hours Hours to be selected from the time wheel
	 * @return Point with coordinates of the requested hours
	 */
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

	/**
	 * Gets the coordinates of the requested minutes, from the selection wheel. There was/is no other way to select the time there.
	 * @param minutes Minutes to be selected from the time wheel
	 * @return Point with coordinates of the requested minutes
	 */
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

	/**
	 * Scrolls until a specific Item can be found via accessibilityId. Scrolls via relative swipe.
	 * @param elementToFind Item to look for before every swipe.
	 */
	public void scrollUntilElementInAccessbilityId(String elementToFind) {
		boolean found = false;
		int swipeCount = 0;
		Dimension size = driver.manage().window().getSize();
		int startY = (int) (size.height * 0.70);
		int endY = (int) (size.height * 0.30);
		int startX = (size.width / 2);

		while (!found || swipeCount == 15) {
			TouchAction action = new TouchAction(driver);
			try {
				driver.findElementByAccessibilityId(elementToFind);
				found = true;
			} catch (Exception e) {


				new TouchAction(driver)
						.press(new PointOption().withCoordinates(startX,startY))
						.waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
						.moveTo(new PointOption().withCoordinates(startX, endY))
						.release()
						.perform();

				swipeCount++;
			}


		}
	}
}
