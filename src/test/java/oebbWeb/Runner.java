package oebbWeb;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(plugin = {"pretty", "html:./results/cucumber-pretty", "json:./results/cucumber.json"})
public class Runner 				
{		

}
