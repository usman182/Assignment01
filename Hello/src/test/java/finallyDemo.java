
public class finallyDemo {
	
	public static void main(String args[])
	{
		try
		{
			//code that generates Exception
			int divideByZero = 5/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithemtic Exception => " + e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}

}
