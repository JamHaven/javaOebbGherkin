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

public class TestSucheStepsMobile extends BaseSteps {
	AppiumDriver<MobileElement> driver;



	@Given("^The OEBB Ticket was started on an Android device$")
    public void startBrowser() throws MalformedURLException {
		System.out.println("Initiating client!");
		File app = new File("./jar/oebbMobileApp.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 29");
		capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability("automationName","true");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
		//you are free to set additional capabilities

		driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
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
