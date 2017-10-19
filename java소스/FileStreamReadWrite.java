package ioexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamReadWrite {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		FileOutputStream fos = new FileOutputStream("bbb.txt",true);
		byte[] reData = new byte[4096];
		int data;
		while((data= fis.read())!= -1){
			fos.write(data);
	
		}
		
		
		fis.close();
		fos.close();
	}
}
