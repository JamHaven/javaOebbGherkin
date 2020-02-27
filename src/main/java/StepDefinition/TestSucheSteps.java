package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSucheSteps extends BaseSteps {
	WebDriver driver;

	@Given("^StarteBrowser$")
    public void startBrowser() throws Throwable							
    {		
		System.out.println("test");

        //System.setProperty("webdriver.gecko.driver", "jar//geckodriver.exe");
		//driver=  new FirefoxDriver();
	    //driver.manage().window().maximize();

	    this.driver = this.startFirefoxDriver();
	    this.driver.get("https://www.oebb.at/");
    }		

    @When("^SucheZugverbindung$")					
    public void sucheZugverbindung(List<String> parList) throws Throwable 							
    {		
    	//Todo						
    }		

    @Then("^ErgebnislisteEnth�lt$")					
    public void ergebnislisteEnth�lt(List<String> parList) throws Throwable 							
    {    		
    	//Todo					
    }	
}
