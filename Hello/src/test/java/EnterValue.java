import java.util.*;

public class EnterValue {
	
	public static double enterValue() 
	{
		Scanner scanner = new Scanner(System.in);
		boolean valid = true;
		double a = 0;
		
		do
		{
			try
			{
				if (a >= 0 || valid)
				{
					System.out.println("Please enter a positive value: ");
					
				}
				else if (valid)
				{
					System.out.println("Please enter positive values only: ");
				}
				
				a = scanner.nextDouble();
				valid = true;
				
				
			}
			catch (InputMismatchException e)
			{
				System.out.println("Please enter numerical values only: ");
				scanner = new Scanner(System.in);
				valid = false;
				
			}
			
		} while (!valid || a < 0);
		
		return a;
	}

	public static void main(String args[]) 
	{
		System.out.println("Checking input value");
		double result = enterValue();
		System.out.println("The value that you entered is: " + result);
	}
}
