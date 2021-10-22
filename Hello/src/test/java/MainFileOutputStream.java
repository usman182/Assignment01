import java.io.FileOutputStream;


public class MainFileOutputStream {
	
	public static void main(String args[])
	{
		String data = "This is the line of text inside the file";
		try
		{
			FileOutputStream output = new FileOutputStream("output.txt");
			
			// get the bytes from the string
			byte[] array = data.getBytes();
			
			
			// write byte to the file
			output.write(array);
			
			// close the file
			output.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
	}

}
