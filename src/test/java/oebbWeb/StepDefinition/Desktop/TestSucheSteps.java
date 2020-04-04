package oebbWeb.StepDefinition.Desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import oebbWeb.StepDefinition.BaseSteps;

public class TestSucheSteps extends BaseSteps {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("^The web Application was started AND navigates to book a ticket$")
	public void the_web_Application_was_started_AND_navigates_to_book_a_ticket() throws Throwable {
		System.out.println("test");
	    this.driver = this.startFirefoxDriver();
	    js = (JavascriptExecutor) driver;
	    driver.get("https://tickets.oebb.at/de/ticket/relation");
	    Thread.sleep(1000);
    	driver.manage().window().setSize(new Dimension(1080, 708));
    }		

	@When("^Chooses (\\d+) ticket\\(s\\) from Wien nach Wels on the (\\d+)\\.(\\d+)\\.(\\d+) at (\\d+):(\\d+)$")
	public void chooses_ticket_s_from_Wien_nach_Wels_on_the_at(int ticketAnzahl, int tag, int monat, int jahr, int stunden, int minuten) throws Throwable {
	      Thread.sleep(1000);
	    	driver.findElement(By.name("stationFrom")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("stationFrom")).sendKeys("Wien");
	    	Thread.sleep(1000);	    	
	    	driver.findElement(By.cssSelector(".entry:nth-child(2) span:nth-child(2)")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("stationTo")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("stationTo")).sendKeys("linz");
	    	Thread.sleep(1000);
	    	driver.findElement(By.cssSelector(".entry:nth-child(4) span:nth-child(2)")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.cssSelector(".time > span:nth-child(2)")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.cssSelector(".date-field .mat-form-field-infix")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("mat-input-0")).clear();
	    	driver.findElement(By.id("mat-input-0")).sendKeys(tag+"."+monat+"."+jahr);
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("mat-input-1")).click();
	    	driver.findElement(By.id("mat-input-1")).clear();
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("mat-input-1")).sendKeys(stunden+":"+minuten);
	    	Thread.sleep(1000);
	    	driver.findElement(By.cssSelector(".date-field .mat-form-field-infix")).click();
	        driver.findElement(By.cssSelector(".mat-flat-button > .mat-button-wrapper")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector(".travelActionWrapper:nth-child(1) span:nth-child(3)")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector(".passengers")).click();
	        Thread.sleep(1000);
	        for (int i=1;i < ticketAnzahl;i++) {
	        	Thread.sleep(1000);
	        	driver.findElements(By.className("addPersonButton")).get(0).click();
	        	Thread.sleep(1000);
	        }
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//span[contains(.,\'WEITER\')]")).click();	        
	        Thread.sleep(5000);	        
	        driver.findElements(By.className("connectionWrapper")).get(0).click();
	        Thread.sleep(1000);
	        System.out.println("Preis: "+driver.findElements(By.className("show-price")).get(0).getText());
	        js.executeScript("window.scrollTo(0,0)");
	             		    				
    }		


	@Then("^The ticket costs (\\d+),(\\d+) Euros$")
	public void the_ticket_costs_Euros(int arg1, int arg2) throws Throwable {
		Thread.sleep(1000);
        String calculated = driver.findElements(By.className("price")).get(2).getText();
        String ticketCost = "€ "+ arg1+","+arg2+"0";
        System.out.println("calculated: "+calculated + " ticketCost: "+ ticketCost);
        if (!ticketCost.equals(calculated))
        	throw new Exception("Ticket cost not match");
        js.executeScript("window.scrollTo(0,0)");
        driver.quit();
    }

}
 