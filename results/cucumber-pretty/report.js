$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:oebbWeb/Mobile.feature");
formatter.feature({
  "name": "Ticket price calculation in the OEBB Ticket Application on an Android device",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.step({
  "name": "Chooses \u003ctickets\u003e ticket(s) from \u003cfrom\u003e nach \u003cto\u003e on the \u003cdate\u003e, \u003cisDeparture\u003e at \u003ctime\u003e with \u003cdiscount\u003e discount",
  "keyword": "When "
});
formatter.step({
  "name": "The ticket costs \u003cprice\u003e Euros",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "from",
        "to",
        "date",
        "time",
        "tickets",
        "price",
        "discount",
        "isDeparture"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "26 August 2020",
        "17:30",
        "1",
        "19,00",
        "no",
        "departure"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "26 August 2020",
        "17:30",
        "3",
        "57,00",
        "no",
        "departure"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "20 May 2020",
        "17:30",
        "1",
        "26,10",
        "Vorteilscard Classic",
        "departure"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "20 May 2020",
        "17:30",
        "2",
        "52,20",
        "Vorteilscard Classic",
        "departure"
      ]
    },
    {
      "cells": [
        "Wien",
        "Wels",
        "02 September 2020",
        "9:00",
        "1",
        "14,00",
        "no",
        "arrival"
      ]
    },
    {
      "cells": [
        "Wien",
        "Wels",
        "02 September 2020",
        "9:00",
        "1",
        "14,00",
        "no",
        "departure"
      ]
    },
    {
      "cells": [
        "Wien",
        "Wels",
        "02 September 2020",
        "9:00",
        "2",
        "28,00",
        "no",
        "departure"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket(s) from Salzburg nach Ollersbach on the 26 August 2020, departure at 17:30 with no discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 19,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 3 ticket(s) from Salzburg nach Ollersbach on the 26 August 2020, departure at 17:30 with no discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 57,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket(s) from Salzburg nach Ollersbach on the 20 May 2020, departure at 17:30 with Vorteilscard Classic discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 26,10 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 2 ticket(s) from Salzburg nach Ollersbach on the 20 May 2020, departure at 17:30 with Vorteilscard Classic discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 52,20 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket(s) from Wien nach Wels on the 02 September 2020, arrival at 9:00 with no discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 14,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket(s) from Wien nach Wels on the 02 September 2020, departure at 9:00 with no discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 14,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy tickets with the GUI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 2 ticket(s) from Wien nach Wels on the 02 September 2020, departure at 9:00 with no discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 28,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Buy Einfach-raus-Ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.step({
  "name": "Choose Einfach-raus-Ticket",
  "keyword": "When "
});
formatter.step({
  "name": "The ticket costs \u003cprice\u003e Euros",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "price"
      ]
    },
    {
      "cells": [
        "35.00"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buy Einfach-raus-Ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Einfach-raus-Ticket",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.einfachRaus()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket costs 35.00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.ergebnislisteenthaelt(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Selected journey is in the past",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.step({
  "name": "Chooses \u003ctickets\u003e ticket(s) from \u003cfrom\u003e nach \u003cto\u003e on the \u003cdate\u003e, \u003cisDeparture\u003e at \u003ctime\u003e with \u003cdiscount\u003e discount",
  "keyword": "When "
});
formatter.step({
  "name": "The journey is in the past",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "from",
        "to",
        "date",
        "time",
        "tickets",
        "discount",
        "isDeparture"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "31 March 2020",
        "17:30",
        "1",
        "no",
        "departure"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Selected journey is in the past",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The OEBB Ticket was started on an Android device and navigates to book a ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.the_OEBB_Ticket_was_started_on_an_Android_device_and_navigates_to_book_a_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket(s) from Salzburg nach Ollersbach on the 31 March 2020, departure at 17:30 with no discount",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.choosesOneTicket(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The journey is in the past",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.MobileSteps.jounreyInThePast()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:oebbWeb/Web.feature");
formatter.feature({
  "name": "Basic functionality of the OEBB web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.step({
  "name": "Chooses \u003ctickets\u003e ticket from \u003cfrom\u003e nach \u003cto\u003e on the \u003cdate\u003e, \u003cisDeparture\u003e at \u003ctime\u003e with \u003cdiscount\u003e discount on the website",
  "keyword": "When "
});
formatter.step({
  "name": "The ticket price on website is \u003cprice\u003e Euros",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "from",
        "to",
        "date",
        "time",
        "tickets",
        "price",
        "discount",
        "isDeparture"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "29 Juni 2020",
        "17:30",
        "2",
        "€ 38,00",
        "Vorteilscard Classic",
        "departure"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "29 Juni 2020",
        "17:30",
        "1",
        "€ 19,00",
        "Vorteilscard Classic",
        "departure"
      ]
    },
    {
      "cells": [
        "Salzburg",
        "Ollersbach",
        "29 Juni 2020",
        "17:30",
        "1",
        "€ 19,00",
        "no",
        "departure"
      ]
    },
    {
      "cells": [
        "Wien",
        "Wels",
        "12 Juni 2020",
        "9:00",
        "1",
        "€ 14,00",
        "no",
        "arrival"
      ]
    },
    {
      "cells": [
        "Wien",
        "Wels",
        "12 Juni 2020",
        "9:00",
        "1",
        "€ 14,00",
        "no",
        "departure"
      ]
    },
    {
      "cells": [
        "Wien",
        "Wels",
        "12 Juni 2020",
        "9:00",
        "2",
        "€ 28,00",
        "no",
        "departure"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 2 ticket from Salzburg nach Ollersbach on the 29 Juni 2020, departure at 17:30 with Vorteilscard Classic discount on the website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 38,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEuros(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket from Salzburg nach Ollersbach on the 29 Juni 2020, departure at 17:30 with Vorteilscard Classic discount on the website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 19,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEuros(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket from Salzburg nach Ollersbach on the 29 Juni 2020, departure at 17:30 with no discount on the website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 19,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEuros(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket from Wien nach Wels on the 12 Juni 2020, arrival at 9:00 with no discount on the website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 14,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEuros(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 1 ticket from Wien nach Wels on the 12 Juni 2020, departure at 9:00 with no discount on the website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 14,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEuros(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy one ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Chooses 2 ticket from Wien nach Wels on the 12 Juni 2020, departure at 9:00 with no discount on the website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.choosesTicketsTicketSFromFromNachToOnTheDateIsDepartureAtTimeWithDiscountDiscountOnTheWebsite(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 28,00 Euros",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEuros(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Buy Einfach-raus-Ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.step({
  "name": "Choose Einfach-raus-Ticket for website",
  "keyword": "When "
});
formatter.step({
  "name": "The ticket price on website is \u003cprice\u003e Euros for Einfach-raus",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "price"
      ]
    },
    {
      "cells": [
        "€ 35,00"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buy Einfach-raus-Ticket",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Browser and go to ÖBB",
  "keyword": "Given "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.openBrowserAndGoToÖBB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Einfach-raus-Ticket for website",
  "keyword": "When "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.chooseEinfachRausTicketForWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The ticket price on website is € 35,00 Euros for Einfach-raus",
  "keyword": "Then "
});
formatter.match({
  "location": "oebbWeb.StepDefinition.WebSteps.theTicketPriceOnWebsiteIsPriceEurosForEinfachRaus(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});