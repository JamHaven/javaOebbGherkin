Feature: Reset functionality on login page of Application 
  Scenario: Verification of Reset button

  Given StarteBrowser
    When SucheZugverbindung
      |Von |Nach| Datum |Uhrzeit| Ab |An|
      |Wien |Linz| Montag in 3 Wochen |09:00| 1 | 0|
    Then ErgebnislisteEnthaelt
      |Uhrzeit| Von Bahnhof | Zug | buchbar |
      |09:42| Wien Hbf| Westbahn | nein|
      |10:06| Wien Westbahnhof| Westbahn | nein|
