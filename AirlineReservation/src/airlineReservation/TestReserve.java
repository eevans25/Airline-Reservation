package airlineReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class TestReserve {
static ArrayList<Airline> airlines = new ArrayList<Airline>();
		
	public static void main(String[] args) {
		//Creates 8 unique flights and adds them to airlines ArrayList
		airlines.add(new Airline("Southwest", 207.00, "Los Angeles", "Dallas"));
		airlines.add(new Airline("United", 275.00, "San Francisco", "New York"));
		airlines.add(new Airline("Delta", 102.00, "Las Vegas", "Phoenix"));
		airlines.add(new Airline("Alaskan", 187.00, "Los Angeles", "Seattle"));
		airlines.add(new Airline("American", 289.00, "San Francisco", "Atlanta"));
		airlines.add(new Airline("Spirit", 89.00, "Las Vegas", "San Francisco"));
		airlines.add(new Airline("JetBlue", 289.00, "Los Angeles", "New York"));
		airlines.add(new Airline("Hawaiian", 300.00, "San Francisco", "Honolulu"));
		
		//Gets Passenger's name and budget
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first name: ");
		String name = scan.next();
		System.out.println("What is your budget: ");
		double budget = scan.nextDouble();
		
		//Creates new Passenger object
		Passenger pass = new Passenger(name, budget);
		
		//Asks for intended origin and destination. Used for bookFlight method
		//Can book another flight afterward. Can also quit program
		boolean loop = true;
		while(loop) {
			System.out.println("Where are you flying from [Los Angeles, San Francisco, Las Vegas]: ");
			String origin = scan.next();
			origin += scan.nextLine();
			
			System.out.println("Where are you flying to [Dallas, New York, Phoenix, Seattle, Atlanta, San Francisco, Honolulu]: ");
			String dest = scan.next();
			dest += scan.nextLine();
			
			bookFlight(pass, origin, dest);
			System.out.println(pass.getName() +", Do you want to book another flight[Yes or No]: ");
			String input = scan.next();
			if(input.equals("No")) {
				System.out.println(pass.getName() +", Thank you for using our reservation system!");
				loop = false;
			}
		}
		scan.close();
	}
	
	//Uses origin and destination from main to check available flights
	//If flight is found, checks to see if passenger's budget is greater than or equal to ticket price
	//If yes, books flight and reduces passenger's budget by ticket price
	//If no, states that the passenger cannot afford that flight
	public static void bookFlight(Passenger pass, String origin, String destination) {
		double budget = pass.getBudget();
		int counter = 0;
		for(int i = 0; i < airlines.size(); i++) {
			Airline flight = airlines.get(i);
			String curOrigin = flight.getOrigin();
			String curDestination = flight.getDestination();
			double curPrice = flight.getTicketPrice();
			if(origin.equals(curOrigin) && destination.equals(curDestination) && budget >= curPrice) {
				System.out.println(pass.getName() +", You are booked on " +flight.getName() +" to fly from " +origin +" to " +destination +".");
				pass.setBudget(budget - curPrice);
				System.out.println(pass.getName() +", Your current budget is " +pass.getBudget() +".");
				counter++;
				break;
			} else if(origin.equals(curOrigin) && destination.equals(curDestination) && budget < curPrice) {
				System.out.println(pass.getName() +", You cannot afford this flight.");
				counter++;
				break;
			}
		}
		if(counter == 0) {
			System.out.println("No flights found.");
		}
	}
	
	

}
