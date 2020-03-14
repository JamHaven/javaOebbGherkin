package oebbWeb.StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @When("^Chooses one ticket$")
    public void choosesOneTicket(DataTable dt) throws InterruptedException {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for (Map<String, String> listMap: list) {
			final String von = listMap.get("Von");
			final String nach = listMap.get("Nach");
			final String datum = listMap.get("Datum");
			final String uhrzeit = listMap.get("Uhrzeit");
			final String ab = listMap.get("Ab");
			final String an = listMap.get("An");
			/*driver.findElementById("at.oebb.ts:id/header_station_from").sendKeys(von);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.findElementByAccessibilityId(von).click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView[2]").click();
			driver.findElementById("at.oebb.ts:id/header_station_to").sendKeys(nach);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElementByAccessibilityId(nach).click();
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView[2]").click();
			driver.findElementByAccessibilityId("Single Tickets and Day Tickets").click();*/


			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("departure city or station");
			el1.sendKeys(von);
			MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId(von);
			el2.click();
			MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("arrival city or station");
			el3.sendKeys(nach);
			MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId(nach);
			el4.click();
			MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Single Tickets and Day Tickets");
			el5.click();

		}

    }		

    @Then("^The ticket costs €14,00")
    public void ergebnislisteenthaelt(DataTable dt){
		String prize = driver.findElementByAccessibilityId("€ 14,00").getText();
		Assert.assertEquals("€ 14,00",prize);
    }

}
