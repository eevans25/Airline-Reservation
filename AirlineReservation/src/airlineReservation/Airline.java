package airlineReservation;

//Airlines can create flights, decide capacity, and set ticket prices for a route
public class Airline {
	private String name;
	private double ticketPrice;
	private String origin;
	private String destination;
	
	//Creates Airline object
	public Airline(String name, double ticketPrice, String origin, String destination) {
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.origin = origin;
		this.destination = destination;
	}
	
	//No Argument Constructor
	public Airline() {
		name = "null";
		ticketPrice = 0.0;
		origin = "somewhere";
		destination = "nowhere";
	}

	public String getName() {
		return name;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

}
