import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public static void main(String[] args)
	{
		try
		{
			FileWriter myWriter = new FileWriter("TestFile.txt");
			myWriter.write("Java is one of the top languages in the world");
			
			myWriter.close();
			System.out.println("Successfully written to the file");
		}
		catch (IOException e)
		{
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}

}
