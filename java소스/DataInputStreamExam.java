package InputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExam {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("primitiveData.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		String dataStr = dis.readUTF();
		int dataInt = dis.readInt();
		
		long dataLon = dis.readLong();
		
		System.out.println(dataStr+"넘겨받은 정수의 값:"+dataInt + "  "+dataLon);
		fis.close();
		dis.close();
		
	}
}
