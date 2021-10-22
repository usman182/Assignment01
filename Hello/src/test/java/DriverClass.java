

public class DriverClass {
	
	public static void main(String[] args)
	{
		Passenger passenger = new Passenger();	// created a Passenger class object
		
		// Getting customer details
		passenger.setName();
		passenger.setGender();
		passenger.setAge();
		passenger.setAddress();
		passenger.setOrigin();
		passenger.setDestination();
		passenger.setPassengers();
		passenger.setPassportNumber();
		passenger.setCNICNumber();
		passenger.setPlaneType();
		
		
		passenger.displayPassenger();	// This function will display all the customer information
		
	}
	
}	