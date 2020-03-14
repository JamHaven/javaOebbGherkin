Feature: Ticket price calculation in the OEBB Ticket Application on an Android device
  Scenario: Buy one ticket from Vienna to Wels
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses one ticket
      |Von |Nach| Datum |Uhrzeit| Anzahl | Ermaessigung |
      |Wien |Wels| 30.03.2020 | 9:00 |1| keine |
    Then The ticket costs €14,00
  Scenario: Buy one ticket from Vienna to Wels with a Vorteilscard
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses vorteilscard classic and one ticket
      |Von |Nach| Datum |Uhrzeit| Anzahl | Ermaessigung |
      |Wien |Wels| Montag in 3 Wochen | 9:00 |1| Vorteilscard Classic |
    Then The ticket costs €5,90
  Scenario: Buy four tickets from Vienna to Wels
    Given The OEBB Ticket was started on an Android device and navigates to book a ticket
    When Chooses four tickets
      |Von |Nach| Datum |Uhrzeit| Anzahl | Ermaessigung |
      |Wien |Wels| Montag in 3 Wochen | 9:00 |4| keine |
    Then The ticket costs €45,20