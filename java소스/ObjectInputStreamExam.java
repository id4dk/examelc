package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputStreamExam {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("obj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Integer kkk = (Integer)ois.readObject();
		Double yyy = (Double)ois.readObject();
		int[]zzz = (int[])ois.readObject();
		String str = (String)ois.readObject();
		
		System.out.println(kkk+"  "+yyy+"  "+Arrays.toString(zzz)+"  " + str);
		ois.close();
		
	}
}	
