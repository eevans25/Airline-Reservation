# Airline Reservation System
## Description
- This is a basic airline reservation system I made that allows a passenger to set a budget and book any of the eight available flights. 
  - Passengers are asked to give their name and budget initially in order to create a new Passenger() object.
  - Passengers are then to asked to give an origin city and a destination city. This is used for the bookFlight() method.
  - The bookFlight() method will check to see if there is a flight from the origin city to the destination. If so, it will then check if the passenger's available budget is greater than or equal to the ticket price of the flight. 
  - If so, it will book the flight and subtract the ticket price from the the passenger's budget, creating a new balance for the passenger to potentially spend. If the flight was too expensive, the booking will be rejected.
  - The passenger will be given their new balance if a booking went through and will be asked if they want to book another flight with their available budget. The passenger can quit the program from here
  
## Credit
- The idea for this project came from [here](https://www.codewithc.com/airlines-reservation-system-java-project/).
