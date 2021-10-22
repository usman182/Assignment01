
public class throwDemo {
	
	public static void divideByZero()
	{
		// throw an Exception
		throw new ArithmeticException("Trying to divide by 0");
	}
	
	public static void main(String args[])
	{
		divideByZero();
	}

}
