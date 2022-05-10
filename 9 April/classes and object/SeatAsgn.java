/*Create a class that captures airline tickets.
Each ticket lists the departure and arrival cities, a flight number, and a seat assignment.
 A seat assignment has both a row and a letter for the seat within the row (such as 12F).
 Make two examples of tickets.*/
class SeatAsgn {
  int row;
  String seat;
  
  SeatAsgn (int row, String seat) {
    this.row = row;
    this.seat = seat;
  }
}

class AirlineTicket {
  String fromCity;
  String toCity;
  int flightNum;
  SeatAsgn seat;
  
  AirlineTicket (String fromCity, String toCity, 
                 int flightNum, SeatAsgn seat) {
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.flightNum = flightNum;
    this.seat = seat;
  }
}

// --------------------------------------

class Examples {
  Examples() {}
  
  AirlineTicket ticketToRome = 
    new AirlineTicket("Boston", "Rome", 56,
                      new SeatAsgn(12, "A"));
}