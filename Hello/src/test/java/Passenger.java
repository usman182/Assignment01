import java.util.Scanner;

public class Passenger {
	
	private String name;
	private String gender;
	private String age;
	private String address;
	private String origin;
	private String destination;
	private String passportNumber;
	private String CNICNumber;
	private String[] flightDates;//see later
	private String planeType;
	
	// Setter and Getter Functions
	// Function to set the name of the passenger
	public void setName()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name = scanner.nextLine();
	}
	
	// Function to set the gender of the passenger
	public void setGender()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter gender: ");
		this.gender = scanner.nextLine();
	}
		
	
	// Function to set the age of the passenger
	public void setAge()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		this.age = scanner.next();
	}
		
	
	// Function to set the address of the passenger
	public void setAddress()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter address: ");
		this.address = scanner.nextLine();
	}
				
	// Function to set the origin
	public void setOrigin()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter origin: ");
		this.origin = scanner.nextLine();
	}
	
	// Function to set the destination
	public void setDestination()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter destination: ");
		this.destination = scanner.nextLine();
	}
	
	// Function to set the passengers
	public void setPassengers()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of passengers: ");
		passengers = scanner.nextInt();
	}
	
	// Function to set the passport number of the passenger
	public void setPassportNumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter passport number: ");
		this.passportNumber = scanner.next();
	}
	
	// Function to set the CNIC number of the passenger
	public void setCNICNumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter CNIC number: ");
		this.CNICNumber = scanner.next();
	}
					
	
	// Function to set the plane type of the passenger
	public void setPlaneType()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter plane type (Business/First/Economy): ");
		this.planeType = scanner.nextLine();
	}
	
	
						
	
	// Function to display passenger information
	public void displayPassenger()
	{
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Origin: " + origin);
		System.out.println("Destination: " + destination);
		System.out.println("Passengers: " + passengers);
		System.out.println("Passport Number: " + passportNumber);
		System.out.println("CNIC Number: " + CNICNumber);
		System.out.println("Plane Type: " + planeType);
		
	}

}
