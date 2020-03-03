package oebbWeb;


import java.io.File;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumClient {


    public void initEmulator() throws MalformedURLException {

        File app = new File("./jar/oebbMobileApp.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 29");
        capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        //you are free to set additional capabilities
        AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }
}
