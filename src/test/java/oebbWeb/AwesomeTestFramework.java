package oebbWeb;

import org.junit.runner.JUnitCore;

import java.net.MalformedURLException;

public class AwesomeTestFramework {
    public static void main(String[] args) throws MalformedURLException {
        AppiumClient appiumClient = new AppiumClient();

        //Selenium Webapp
        //JUnitCore.main("oebbWeb.Runner");

        int port = 4723;
        appiumClient.initEmulator();

        /*if(!appiumServer.checkIfServerIsRunnning(port)) {
            System.out.println("starting server!");
            appiumServer.startServer(port);
            appiumClient.initEmulator();
            appiumServer.stopServer();
        } else {
            System.out.println("Appium Server already running on Port - " + port);
            System.out.println("Using external Server.");
            appiumClient.initEmulator();

        }*/

    }
}
