package oebbWeb;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions( monochrome = true, plugin = {"pretty", "html:./results/cucumber-pretty", "json:./results/cucumber.json"}, glue={"oebbWeb.StepDefinition"}, strict = true)
public class Runner 				
{		

}
