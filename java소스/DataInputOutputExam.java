package InputOutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputExam {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("primitiveData.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("ȫ�浿");
		dos.writeInt(100);
		dos.writeDouble(95.5);
		
		dos.flush(); 
		dos.close();
		
	}
}
