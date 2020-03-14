Feature: Ticket price calculation in the OEBB Ticket Application on an Android device

  Scenario Outline: Buy one ticket from Vienna to Wels
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses <Anzahl> ticket(s) from <Von> nach <Nach> on the <Datum> at <Uhrzeit> with <Ermaesigung>
    Then The ticket costs <Kosten> Euros
    Examples:
      | Von  | Nach           | Datum         | Uhrzeit | Anzahl | Kosten | Ermaesigung|
      | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 1      | 49,90 | keine |
      | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 1      | 26,10 | Vorteilscard Classic |
      | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 2      | 52,20 | Vorteilscard Classic |
      | Wien     | Wels       | 30 March 2020 | 9:00     | 1      | 14,00 | keine |
      | Wien     | Wels       | 30 March 2020 | 9:00     | 2      | 28,00 | keine |
