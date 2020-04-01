Feature: Basic functionality of the OEBB web application

  Scenario Outline: Buy one ticket
    Given Open Browser and go to ÖBB
    When Chooses <tickets> ticket from <from> nach <to> on the <date>, <isDeparture> at <time> with <discount> discount on the website
    Then The ticket price on website is <price> Euros
    Examples:
      | from  | to           | date           | time      | tickets | price | discount          | isDeparture |
      | Salzburg | Ollersbach | 29 Juni 2020 | 17:30    | 2      | € 38,00 | Vorteilscard Classic | departure |
      | Salzburg | Ollersbach | 29 Juni 2020 | 17:30    | 1      | € 19,00 | Vorteilscard Classic | departure |
      | Salzburg | Ollersbach | 29 Juni 2020 | 17:30    | 1      | € 19,00 | no                | departure |
      | Wien     | Wels       | 12 Juni 2020 | 9:00     | 1      | € 14,00 | no                | arrival|
      | Wien     | Wels       | 12 Juni 2020 | 9:00     | 1      | € 14,00 | no                | departure |
      | Wien     | Wels       | 12 Juni 2020 | 9:00     | 2      | € 28,00 | no                | departure |

  Scenario Outline: Buy Einfach-raus-Ticket
    Given Open Browser and go to ÖBB
    When Choose Einfach-raus-Ticket for website
    Then The ticket price on website is <price> Euros for Einfach-raus
    Examples:
      | price |
      | € 35,00 |