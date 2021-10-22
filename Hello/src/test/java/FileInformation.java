import java.io.File;

public class FileInformation {
	
	public static void main(String args[])
	{
		// creating an object of the file
		File myObj = new File("C:\\Users\\musma\\Desktop\\data-structures\\Hello\\src\\test\\java\\input.txt");//absolute path
		
		// check whether the file exists
		if (myObj.exists())
		{
			// returning the name of the file
			System.out.println("File Name : " + myObj.getName());
			
			// returning the path of the file (Absolute path)
			System.out.println("Absolute Path : " + myObj.getAbsolutePath());
			
			// returning whether the file is writable
			System.out.println("Writable : " + myObj.canWrite());
			
			// returning whether the file is readable
			System.out.println("Readable : " + myObj.canRead());
			
			// returning the length of the file in bytes
			System.out.println("File size in bytes : " + myObj.length());
		}
		else
		{
			System.out.println("File does not exist");
		}
	}

}
