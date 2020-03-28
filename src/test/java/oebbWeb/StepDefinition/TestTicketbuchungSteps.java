package oebbWeb.StepDefinition;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestTicketbuchungSteps {
	
	@Given("^StarteWebApp and NavigiereZuTicketBuchung$")
	public void startewebapp_AND_NavigiereZuTicketBuchung() throws Throwable {
		System.out.println("StarteWebApp AND NavigiereZuTicketBuchung");
	}
	@Given("^StarteWebApp$")
	public void startewebapp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
    @When("^Waehle$")
    public void waehle(List<String> parList) throws Throwable
    {		
    	//Todo						
    }		

    @Then("^TicketKostet 38,50$")
    public void ticketKostet() throws Throwable 							
    {    		
    	//Todo							
    }	
}
