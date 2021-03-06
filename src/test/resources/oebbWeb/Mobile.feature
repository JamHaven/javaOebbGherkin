Feature: Ticket price calculation in the OEBB Ticket Application on an Android device

  Scenario Outline: Get the price of the trip with the closest time according to specified criteria
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses <tickets> ticket(s) from <from> nach <to> on the <date>, <isDeparture> at <time> with <discount> discount
    Then The ticket costs <price> Euros
    Examples:
      | from  | to           | date         | time | tickets | price | discount          | isDeparture |
      | Salzburg | Ollersbach | 26 August 2020 | 17:30    | 1      | 19,00 | no                | departure |
      | Salzburg | Ollersbach | 26 August 2020 | 17:30    | 3      | 57,00 | no                | departure |
      | Salzburg | Ollersbach | 20 May 2020 | 17:30    | 1      | 26,10 | Vorteilscard Classic | departure |
      | Salzburg | Ollersbach | 20 May 2020 | 17:30    | 2      | 52,20 | Vorteilscard Classic | departure |
      | Wien     | Wels       | 02 September 2020 | 9:00     | 1      | 14,00 | no                | arrival|
      | Wien     | Wels       | 02 September 2020 | 9:00     | 1      | 14,00 | no                | departure |
      | Wien     | Wels       | 02 September 2020 | 9:00     | 2      | 28,00 | no                | departure |

  Scenario Outline: Select one Einfach-raus-Ticket
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Choose Einfach-raus-Ticket
    Then The ticket costs <price> Euros
    Examples:
      | price |
      | 35.00 |

  Scenario Outline: Selected journey is in the past
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses <tickets> ticket(s) from <from> nach <to> on the <date>, <isDeparture> at <time> with <discount> discount
    Then The journey is in the past
    Examples:
      | from  | to           | date         | time | tickets |  discount          | isDeparture |
      | Salzburg | Ollersbach | 31 March 2020 | 17:30    | 1      | no                | departure |