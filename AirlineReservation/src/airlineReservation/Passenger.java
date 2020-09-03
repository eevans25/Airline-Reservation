package airlineReservation;

//Passengers can set a budget. This is used to book flights later
public class Passenger {
	private String name;
	private double budget;
	
	//Creates Passenger object
	public Passenger(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}
	
	//No Argument Constructor
	public Passenger() {
		name = "null";
		budget = 0.0;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
}
