
public class tryCatchDemo {
	
	
	public static void main(String args[])
	{
		try
		{
			//code that may raise exception
			int data = 100/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Hello");
		}
		System.out.println("rest of the code...");
	}
}
