



public class TestExceptions {
	
	static void myMethod(int testNum) throws Exception
	{
		System.out.println("start - my method");
		if (testNum == 12)
		{
			throw new Exception();
		}
		System.out.println("end - my method");
	}
	
	
	
	
	public static void main(String args[])
	{
		int testNum = 12;
		try
		{
			System.out.println("try - first statement");
			myMethod(testNum);
			System.out.println("try - last statement");
		}
		catch (Exception e)
		{
			System.out.println("An Exception");
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Out of try/catch/finally - statement");
	}
	}
	
	
	



