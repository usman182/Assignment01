import java.io.*;


public class DataInputStreamExample {
	
	public static void main(String args[]) throws IOException
	{
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.bin"));
		dataOutputStream.writeInt(123);
		dataOutputStream.writeFloat(45F);
		dataOutputStream.writeLong(789);
		
		dataOutputStream.close();
		
		
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.bin"));
		
		int int123 = dataInputStream.readInt();
		float float45 = dataInputStream.readFloat();
		long long789 = dataInputStream.readLong();
		
		dataInputStream.close();
		
		System.out.println("int123     = " + int123);
		System.out.println("float45     = " + float45);
		System.out.println("long789     = " + long789);
		
	}

}
