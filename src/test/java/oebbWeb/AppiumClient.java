package oebbWeb;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class AppiumClient {


    public void initEmulator() throws MalformedURLException {
        System.out.println("Initiating client!");
        File app = new File("./jar/oebbMobileApp.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 29");
        capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        capabilities.setCapability("autoGrantPermissions","true");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
        //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //you are free to set additional capabilities

        AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println(driver.getStatus());

        WebElement button = driver.findElement(By.className("UIAButton"));
        button.click();

        WebElement texts = driver.findElement(By.className("UIAStaticText"));
        assertEquals(texts.getText(), "");
    }
/*

MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Tickets and\nServices");
el1.click();
MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("22:03");
el2.click();
MobileElement el3 = (MobileElement) driver.findElementById("at.oebb.ts:id/dateButton");
el3.click();
MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("12 February 2020");
el4.click();
MobileElement el5 = (MobileElement) driver.findElementById("at.oebb.ts:id/timeButton");
el5.click();
MobileElement el6 = (MobileElement) driver.findElementById("at.oebb.ts:id/hours");
el6.click();
MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Hours circular slider: 22\"]/android.view.View[3]");
el7.click();
MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("CONFIRM");
el8.click();
MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("departure city or station");
el9.click();
el9.sendKeys("wien");
MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("arrival city or station");
el10.click();
el10.sendKeys("linz");
MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView[2]");
el11.click();
MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Innsbruck");
el12.click();
MobileElement el13 = (MobileElement) driver.findElementById("at.oebb.ts:id/travelActions_icon");
el13.click();

 */
}
