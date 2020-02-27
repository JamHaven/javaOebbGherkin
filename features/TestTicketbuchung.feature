Feature: Reset functionality on login page of Application 
Scenario: Verification  
Given StarteWebApp AND NavigiereZuTicketBuchung

When Wähle
|Von |Nach| Datum |Uhrzeit| Anzahl | Ermäßigung|Wien |Linz| Montag in 3 Wochen |1| keine|

Then TicketKostet €38,50
