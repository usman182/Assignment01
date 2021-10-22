import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException
	{
		try
		{
			FileReader fr = new FileReader("TestFile.txt");
			Scanner myReader = new Scanner(fr);
			
			while (myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
			
			myReader.close();
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
		
		
	}
	
}
