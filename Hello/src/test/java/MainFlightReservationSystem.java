import java.util.Scanner;

public class MainFlightReservationSystem {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String origin, destination;	// to get the origin and the destination
		int passengers;	// to get the number of passengers
		String flightDates;	//to get the flight dates
		String travelDocumentIdentity;	// for identification
		
		
		System.out.println("============================================================================================== Flight Reservation System ============================================================");
		System.out.println("Flight Details\n");
		
		System.out.println("Enter the origin of the flight");
		origin = scanner.nextLine();	// reads a string
		
		System.out.println("Enter the destination of the flight");
		destination = scanner.nextLine();
		
		System.out.println("Enter the number of passengers along with you");
		passengers = scanner.nextInt();
		
		System.out.println("Enter the travel document identification number");
		travelDocumentIdentity = scanner.next();
		
	}

}
