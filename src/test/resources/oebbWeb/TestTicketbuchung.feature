Feature: Ticket price calculation in the web application
  Scenario Outline: Buy one ticket from Vienna to St. Poelten
    Given The web Application was started AND navigates to book a ticket
    When Chooses <tickets> ticket(s) from <from> nach <to> on the <date>, <isDeparture> at <time> with <discount> discount
    Then The ticket costs <price> Euros
  Examples:
    | from  | to           | date         | time | tickets | price | discount          | isDeparture |
    | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 1      | 49,90 | no                | departure |
    | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 1      | 26,10 | Vorteilscard Classic | departure |
    | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 2      | 52,20 | Vorteilscard Classic | departure |
    | Wien     | Wels       | 30 March 2020 | 9:00     | 1      | 43,00 | no                | arrival|
    | Wien     | Wels       | 30 March 2020 | 9:00     | 1      | 14,00 | no                | departure |
    | Wien     | Wels       | 30 March 2020 | 9:00     | 2      | 28,00 | no                | departure |
 # Scenario: Buy one ticket from Vienna to St. Poelten with a Vorteilscard
  #  Given The web Application was started AND navigates to book a ticket
  #  When Chooses
  #    |Von |Nach| Datum |Uhrzeit| Anzahl | Ermaessigung |
  #    |Wien |St. Poelten| Montag in 3 Wochen | 9:00 |1| Vorteilscard Classic |
  #    |St. Poelten |Wien| Montag in 3 Wochen | 9:00 |1| Vorteilscard Classic |
  #    |Wien |St. Poelten | 20.11.2020        | 17:00|1| Vorteilscard Classic |
  #    |St. Poelten |Wien | 20.11.2020        | 17:00|1| Vorteilscard Classic |
  #  Then The ticket costs €5,90
  #Scenario: Buy four tickets from Vienna to St. Poelten
  #  Given The web Application was started AND navigates to book a ticket
  #  When Chooses
  #    |Von |Nach| Datum |Uhrzeit| Anzahl | Ermaessigung |
  #    |Wien |St. Poelten| Montag in 3 Wochen | 9:00 |4| keine |
  #    |St. Poelten |Wien| Montag in 3 Wochen | 9:00 |4| keine |
  #    |Wien |St. Poelten | 20.11.2020        | 17:00|4| keine |
  #    |St. Poelten |Wien | 20.11.2020        | 17:00|4| keine |
  #  Then The ticket costs €45,20