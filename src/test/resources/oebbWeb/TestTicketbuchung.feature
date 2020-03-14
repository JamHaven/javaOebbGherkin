Feature: Ticket price calculation
  Scenario Outline: Buy one ticket from Vienna to St. Poelten
    Given The web Application was started AND navigates to book a ticket
    When Chooses <Anzahl> ticket(s) from <Von> nach <Nach> on the <Datum> at <Uhrzeit>
    Then The ticket costs <Kosten> Euros
  Examples:
    | Von  | Nach | Datum         | Uhrzeit | Anzahl | Kosten |
    | Wien | Wels | 30 March 2020 | 9:00    | 1      | 14,00 |
    | Wien | Wels | 30 March 2020 | 9:00    | 2      | 28,00 |
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