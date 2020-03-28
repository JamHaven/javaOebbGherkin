Feature: Ticket price calculation in the web application
  Scenario Outline: Buy one ticket from Vienna to St. Poelten
    Given The web Application was started and navigates to book a ticket
    When Chooses <tickets> ticket(s) from <from> nach <to> on the <date>, <isDeparture> at <time> with <discount> discount
    Then The ticket costs <price> Euros
  Examples:
    | from  | to           | date         | time | tickets | price | discount          | isDeparture |
    | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 1      | 52,10 | no                | departure |
    | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 1      | 26,10 | Vorteilscard Classic | departure |
    | Salzburg | Ollersbach | 29 March 2020 | 17:30    | 2      | 52,20 | Vorteilscard Classic | departure |
    | Wien     | Wels       | 30 March 2020 | 9:00     | 1      | 43,00 | no                | arrival|
    | Wien     | Wels       | 30 March 2020 | 9:00     | 1      | 14,00 | no                | departure |
    | Wien     | Wels       | 30 March 2020 | 9:00     | 2      | 28,00 | no                | departure |
  Scenario Outline: Buy Einfach-raus-Ticket
    Given The web Application was started and navigates to book a ticket
    When Choose Einfach-raus-Ticket
    Then The ticket costs <price> Euros
    Examples:
      | price |
      | 35.00 |