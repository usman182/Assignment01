import java.io.File;	// import the File class
import java.io.IOException;	// import the IO Exception class to handle errors


public class CreateFile {

	public static void main(String args[])
	{
	try
	{
		File myObj = new File("C:\\Users\\musma\\Desktop\\data-structures\\Hello\\src\\test\\java\\fil.txt");
		if (myObj.createNewFile())
		{
			System.out.println("File Created " + myObj.getName());
		}
		else
		{
			System.out.println("File Already Exists");
			//throw new IOException();
		}
		
	}
	catch (IOException e)
	{
		System.out.println("An Error Occured");
		e.printStackTrace();
	}
	}
}
