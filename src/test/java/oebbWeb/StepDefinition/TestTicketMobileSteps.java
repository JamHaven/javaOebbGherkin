package oebbWeb.StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

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
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//System.out.println(driver.getStatus());
    }		

    @Given("^navigates to book a ticket$")
	public void navigateToBooking(){
		System.out.println("TODO: navigateToBooking");
	}

    @When("^Chooses$")
    public void sucheZugverbindung(DataTable dt)  {
		System.out.println("TODO: sucheZugverbindung");
    }		

    @Then("^The ticket costs €\\d{1}.*")
    public void ergebnislisteenthaelt(DataTable dt){
		System.out.println("TODO: The ticket costs ...");
    }

}
