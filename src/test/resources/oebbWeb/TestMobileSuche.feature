Feature: Ticket price calculation in the OEBB Ticket Application on an Android device

  Scenario Outline: Buy one ticket from Vienna to Wels
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses <Anzahl> ticket(s) from <Von> nach <Nach> on the <Datum> at <Uhrzeit>
    Then The ticket costs <Kosten> Euros
    Examples:
      | Von  | Nach | Datum         | Uhrzeit | Anzahl | Kosten |
      | Wien | Wels | 30 March 2020 | 9:00    | 1      | 14,00 |
      | Wien | Wels | 30 March 2020 | 9:00    | 2      | 28,00 |