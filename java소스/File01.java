package ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File01 {
		public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("aaa.txt");
			FileOutputStream fos = new FileOutputStream("pppcp.txt");
			int readData;
			byte[] k = new byte[10];
			while((readData = fis.read() ) !=-1 ){
				readData++;
				k[2] = (byte)(readData);
				fos.write(k);
			}
			fis.close();
			fos.close();
	}
}
