import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOReadingWriting {

	public static void main(String[] args) throws IOException
	{
		// Writing to a file using buffer and channel
		/*FileOutputStream fout = new FileOutputStream("niotest.txt");
		FileChannel writeChannel = fout.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
		
		String message = "This is test string";
		writeBuffer.put(message.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		System.out.println("File written successfully");*/
		
		// Reading from a file using buffer and channel
		FileInputStream fin = new FileInputStream("niotest.txt");
		FileChannel readChannel = fin.getChannel();
		ByteBuffer readBuffer = ByteBuffer.allocate(1024);
		int result = readChannel.read(readBuffer);
		System.out.println(result);
	}
	
}
