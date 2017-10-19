package InputOutput;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExam02 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("memobj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Member(01,"¾ç¿ì¿µ",19));
		oos.writeObject(new Member(02,"È«±æµ¿",19));
		oos.writeObject(new Member(03,"±èÀÚ¹Ù",19));
		oos.writeObject(new Member(04,"±èµ¹µ¹",19));
		oos.writeObject(new Member(05,"°í¹Î¿µ",22));
		oos.writeObject(new Member(06,"ÇÑ³ª¶ó",22));
		oos.flush();
		oos.close();
		fos.close();
	}
}
