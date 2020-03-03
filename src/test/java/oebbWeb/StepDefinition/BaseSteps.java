package oebbWeb.StepDefinition;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class BaseSteps {

    public FirefoxDriver startFirefoxDriver() throws Throwable {
        String os = System.getProperty("os.name", "unknown").toLowerCase(Locale.ROOT).toLowerCase();
        String path = "jar//geckodriver.exe";

        if(!os.contains("win")){
            path = "jar//geckodriver";
        }

        System.setProperty("webdriver.gecko.driver", path);
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
