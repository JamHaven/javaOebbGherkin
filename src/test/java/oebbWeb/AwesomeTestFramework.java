package oebbWeb;

import java.net.MalformedURLException;

public class AwesomeTestFramework {
    public static void main(String[] args) throws MalformedURLException {
        AppiumServer appiumServer = new AppiumServer();
        AppiumClient appiumClient = new AppiumClient();


        int port = 4723;
        if(!appiumServer.checkIfServerIsRunnning(port)) {
            appiumServer.startServer(port);
            appiumClient.initEmulator();
            appiumServer.stopServer();
        } else {
            System.out.println("Appium Server already running on Port - " + port);
        }
    }
}
