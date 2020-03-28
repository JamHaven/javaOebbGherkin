package oebbWeb.StepDefinition;

import java.util.List;
import java.util.Map;


import oebbWeb.StepDefinition.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSucheSteps extends BaseSteps {
	WebDriver driver;

	@Given("^StarteBrowser$")
    public void startBrowser() throws Throwable							
    {		
		System.out.println("test");
	    this.driver = this.startFirefoxDriver();
	    this.driver.get("https://tickets.oebb.at/de/ticket/relation?cref=oebb-header");
    }		

    @When("^SucheZugverbindung$")					
    public void sucheZugverbindung(DataTable dt) throws Throwable {
    	List<Map<String, String>> list = dt.asMaps(String.class, String.class);
    	for (Map<String, String> listMap: list) {  		
    		final String von = listMap.get("Von");
    		final String nach = listMap.get("Nach"); 
    		final String datum = listMap.get("Datum");
    		final String uhrzeit = listMap.get("Uhrzeit");
    		final String ab = listMap.get("Ab");
    		final String an = listMap.get("An");
    		Thread.sleep(1000);
    		driver.findElements(By.className("cursorPointer")).get(0).click();
    		driver.findElements(By.className("cursorPointer")).get(0).click();
    		Thread.sleep(1000);
    		driver.findElements(By.className("cursorPointer")).get(1).click();
    		driver.findElements(By.className("cursorPointer")).get(1).click();
    		
    		Thread.sleep(1000);
    		driver.findElements(By.name("stationFrom")).get(0).sendKeys(von);
    		driver.findElements(By.name("stationFrom")).get(0).sendKeys(von);
    		Thread.sleep(1000);
    		driver.findElements(By.name("stationTo")).get(0).sendKeys(nach);
    		
    		Thread.sleep(1000);
    		
    		WebElement textbox = driver.findElements(By.name("stationTo")).get(0);
    		textbox.sendKeys(Keys.ENTER);
    		
    		new Actions(driver).moveToElement(driver.findElement(By.id("leftColumn"))).perform();
    		driver.findElement(By.id("leftColumn")).click();

    		Thread.sleep(1000);
    		driver.findElement(By.className("travelAction")).click();
    		driver.findElement(By.className("travelAction")).click();
    		

    		
    		
	    	//driver.findElement(By.name("btnReset")).click();		
    		//TODO
        }		    				
    }		

    @Then("^ErgebnislisteEnthaelt$")
    public void ergebnislisteenthaelt(DataTable dt) throws Throwable {
    	List<Map<String, String>> list = dt.asMaps(String.class, String.class);
    	for (Map<String, String> listMap: list) {  	
	    	System.out.println(listMap.get("Uhrzeit"));
	    	System.out.println(listMap.get("Von Bahnhof"));
	    	System.out.println(listMap.get("Zug"));
	    	System.out.println(listMap.get("buchbar"));
	    	//TODO
    	}
    }

}
