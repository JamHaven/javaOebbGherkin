package StepDefinition;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestTicketbuchungSteps {
	@Given("^StarteWebApp$")				
    public void starteWebApp() throws Throwable							
    {		
        //Todo				
    }		
	@And
	("^NavigiereZuTicketBuchung$")				
    public void navigiereZuTicketBuchung() throws Throwable							
    {		
        //Todo				
    }	
    @When("^W�hle$")					
    public void w�hle(List<String> parList) throws Throwable 							
    {		
    	//Todo						
    }		

    @Then("^TicketKostet �38,50$")					
    public void ticketKostet() throws Throwable 							
    {    		
    	//Todo							
    }	
}
