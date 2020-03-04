$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("oebbWeb/TestSuche.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "StarteBrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "SucheZugverbindung",
  "rows": [
    {
      "cells": [
        "Von",
        "Nach",
        "Datum",
        "Uhrzeit",
        "Ab",
        "An"
      ],
      "line": 6
    },
    {
      "cells": [
        "Wien",
        "Linz",
        "Montag in 3 Wochen",
        "09:00",
        "1",
        "0"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "ErgebnislisteEnthaelt",
  "rows": [
    {
      "cells": [
        "Uhrzeit",
        "Von Bahnhof",
        "Zug",
        "buchbar"
      ],
      "line": 9
    },
    {
      "cells": [
        "09:42",
        "Wien Hbf",
        "Westbahn",
        "nein"
      ],
      "line": 10
    },
    {
      "cells": [
        "10:06",
        "Wien Westbahnhof",
        "Westbahn",
        "nein"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSucheSteps.startBrowser()"
});
formatter.result({
  "duration": 4888706300,
  "status": "passed"
});
formatter.match({
  "location": "TestSucheSteps.sucheZugverbindung(DataTable)"
});
formatter.result({
  "duration": 7881441000,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: .travelAction\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BVOTT9T\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 73.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200217142647, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 34064, moz:profile: C:\\Users\\jamha\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 45b4fc53-8fb4-4ea5-9c6d-61fa93aba43f\n*** Element info: {Using\u003dclass name, value\u003dtravelAction}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat oebbWeb.TestSucheSteps.sucheZugverbindung(TestSucheSteps.java:63)\r\n\tat ✽.When SucheZugverbindung(oebbWeb/TestSuche.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSucheSteps.ergebnislisteenthaelt(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("oebbWeb/TestSucheWeb.feature");
formatter.feature({
  "line": 1,
  "name": "Basic functionality of the OEBB route search",
  "description": "",
  "id": "basic-functionality-of-the-oebb-route-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User searches a route",
  "description": "",
  "id": "basic-functionality-of-the-oebb-route-search;user-searches-a-route",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "The web Application was started and the user wants to search for a train connection",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "The user searches a route between \u003cVon\u003e and \u003cNach\u003e on \u003cDatum\u003e between \u003cAb\u003e and \u003cAn\u003e",
  "rows": [
    {
      "cells": [
        "Von",
        "Nach",
        "Datum",
        "Uhrzeit",
        "Ab",
        "An"
      ],
      "line": 5
    },
    {
      "cells": [
        "Wien",
        "Linz",
        "Montag in 3 Wochen",
        "09:00",
        "1",
        "0"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The results should include the depature time \u003cUhrzeit\u003e from \u003cVon Bahnhof\u003e in Train \u003cZug\u003e and if its billable: \u003cbuchbar\u003e",
  "rows": [
    {
      "cells": [
        "Uhrzeit",
        "Von Bahnhof",
        "Zug",
        "buchbar"
      ],
      "line": 8
    },
    {
      "cells": [
        "09:42",
        "Wien Hbf",
        "Westbahn",
        "nein"
      ],
      "line": 9
    },
    {
      "cells": [
        "10:06",
        "Wien Westbahnhof",
        "Westbahn",
        "nein"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("oebbWeb/TestTicketbuchung.feature");
formatter.feature({
  "line": 1,
  "name": "Ticket price calculation",
  "description": "",
  "id": "ticket-price-calculation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Buy one ticket from Vienna to St. Poelten",
  "description": "",
  "id": "ticket-price-calculation;buy-one-ticket-from-vienna-to-st.-poelten",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "The web Application was started AND navigates to book a ticket",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Chooses",
  "rows": [
    {
      "cells": [
        "Von",
        "Nach",
        "Datum",
        "Uhrzeit",
        "Anzahl",
        "Ermaessigung"
      ],
      "line": 5
    },
    {
      "cells": [
        "Wien",
        "St. Poelten",
        "Montag in 3 Wochen",
        "9:00",
        "1",
        "keine"
      ],
      "line": 6
    },
    {
      "cells": [
        "St. Poelten",
        "Wien",
        "Montag in 3 Wochen",
        "9:00",
        "1",
        "keine"
      ],
      "line": 7
    },
    {
      "cells": [
        "Wien",
        "St. Poelten",
        "20.11.2020",
        "17:00",
        "1",
        "keine"
      ],
      "line": 8
    },
    {
      "cells": [
        "St. Poelten",
        "Wien",
        "20.11.2020",
        "17:00",
        "1",
        "keine"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The ticket costs€14,00",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "Buy one ticket from Vienna to St. Poelten with a Vorteilscard",
  "description": "",
  "id": "ticket-price-calculation;buy-one-ticket-from-vienna-to-st.-poelten-with-a-vorteilscard",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "The web Application was started AND navigates to book a ticket",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Chooses",
  "rows": [
    {
      "cells": [
        "Von",
        "Nach",
        "Datum",
        "Uhrzeit",
        "Anzahl",
        "Ermaessigung"
      ],
      "line": 14
    },
    {
      "cells": [
        "Wien",
        "St. Poelten",
        "Montag in 3 Wochen",
        "9:00",
        "1",
        "Vorteilscard Classic"
      ],
      "line": 15
    },
    {
      "cells": [
        "St. Poelten",
        "Wien",
        "Montag in 3 Wochen",
        "9:00",
        "1",
        "Vorteilscard Classic"
      ],
      "line": 16
    },
    {
      "cells": [
        "Wien",
        "St. Poelten",
        "20.11.2020",
        "17:00",
        "1",
        "Vorteilscard Classic"
      ],
      "line": 17
    },
    {
      "cells": [
        "St. Poelten",
        "Wien",
        "20.11.2020",
        "17:00",
        "1",
        "Vorteilscard Classic"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "The ticket costs €5,90",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "Buy four tickets from Vienna to St. Poelten",
  "description": "",
  "id": "ticket-price-calculation;buy-four-tickets-from-vienna-to-st.-poelten",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "The web Application was started AND navigates to book a ticket",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Chooses",
  "rows": [
    {
      "cells": [
        "Von",
        "Nach",
        "Datum",
        "Uhrzeit",
        "Anzahl",
        "Ermaessigung"
      ],
      "line": 23
    },
    {
      "cells": [
        "Wien",
        "St. Poelten",
        "Montag in 3 Wochen",
        "9:00",
        "4",
        "keine"
      ],
      "line": 24
    },
    {
      "cells": [
        "St. Poelten",
        "Wien",
        "Montag in 3 Wochen",
        "9:00",
        "4",
        "keine"
      ],
      "line": 25
    },
    {
      "cells": [
        "Wien",
        "St. Poelten",
        "20.11.2020",
        "17:00",
        "4",
        "keine"
      ],
      "line": 26
    },
    {
      "cells": [
        "St. Poelten",
        "Wien",
        "20.11.2020",
        "17:00",
        "4",
        "keine"
      ],
      "line": 27
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "The ticket costs €45,20",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});