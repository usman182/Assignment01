/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;

public class Copy {
	
	public static void main(String[] args) throws IOException
	{
		try
		{
		//opening the streams
		FileReader in = new FileReader("infile.txt");
		BufferedReader br = new BufferedReader(in);
		
		FileWriter out = new FileWriter("outfile.txt");
		BufferedWriter bw = new BufferedWriter(out);
		
		// processing the streams
		String aLine = null;
		while ((aLine = br.readLine()) != null)
		{
			bw.write(aLine, 0, aLine.length());
			System.out.println(aLine);
		}
		// closing the streams
		in.close();
		out.close();
		}
		catch (IOException e)
		{
			System.out.println("An Error Occured");
		}
	}

}
