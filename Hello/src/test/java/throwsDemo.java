import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class throwsDemo {
	
	
	
	// declaring the type of Exceptions
	public static void findFile() throws Exception
	{
		// code that may generate IO Exception
		File newFile = new File("testing.txt");
		FileOutputStream stream2 = new FileOutputStream(newFile);
		FileInputStream stream = new FileInputStream(newFile);
		
	}
	
	public static void main(String args[])
	{
		try
		{
			findFile();
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("File not found");
			
		}
		
	}

}
