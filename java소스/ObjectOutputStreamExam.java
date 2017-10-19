package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExam {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("obj.dat");
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		ois.writeObject(new Integer(10) );
		ois.writeObject(new Double(3.14) );
		ois.writeObject(new int[]{1,2,3} );
		ois.writeObject(new String("ȫ�浿") );
		ois.flush();
		ois.close();
		fos.close();
		
		
	}
}
