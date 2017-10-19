package InputOutput;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExam02 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("memobj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Member(01,"��쿵",19));
		oos.writeObject(new Member(02,"ȫ�浿",19));
		oos.writeObject(new Member(03,"���ڹ�",19));
		oos.writeObject(new Member(04,"�赹��",19));
		oos.writeObject(new Member(05,"��ο�",22));
		oos.writeObject(new Member(06,"�ѳ���",22));
		oos.flush();
		oos.close();
		fos.close();
	}
}
