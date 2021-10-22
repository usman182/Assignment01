import java.io.FileInputStream;

public class MainFileInputStream {

	public static void main(String args[])
	{
		try
		{
			FileInputStream input = new FileInputStream("input.txt");
			
			System.out.println("Data in the file : ");
			
			// read the first byte from the file
			int i = input.read();
			
			while (i != -1)
			{
				System.out.print((char)i);
				
				// read the next byte from the file
				i = input.read();
			}
			// close the file
			input.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
			System.out.println("Error! File does not exist");
		}
	}
}
