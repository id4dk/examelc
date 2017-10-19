package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExam02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("memobj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member obj1 = (Member)ois.readObject();
		Member obj2 = (Member)ois.readObject();
		Member obj3 = (Member)ois.readObject();
		Member obj4 = (Member)ois.readObject();
		Member obj5 = (Member)ois.readObject();
		Member obj6 = (Member)ois.readObject();
		
		System.out.println("첫번째 객체자료 의 이름 :" + obj1.iname);
		System.out.println("다섯번째 객체자료 의 이름 :" + obj5.iname);
		System.out.println("여섯번째 객체자료 의 이름 :" + obj6.iname);
		System.out.println("다섯번째 객체자료 의 나이 :" + obj1.age);
		
		
		ois.close();
	}
}
