package ioexam;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class RecoverCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("ppp.txt");
		FileOutputStream fos = new FileOutputStream("qqqcp.txt");
		int readData;
		byte[] k = new byte[10];
		Random rnd = new Random();
		int writeData;
		while((readData = fis.read(k) ) !=-1 ){
			writeData = k[0];
			writeData--;
			
			fos.write(writeData);
		}
		fis.close();
		fos.close();
	}//1byte�κ������� �Ӽ�������10��ǰ�
	//�����Ἥ �ұ�Ģ������
}



