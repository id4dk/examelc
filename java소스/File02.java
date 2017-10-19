package ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class File02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("ppp.txt");
		int readData;
		int writeData;
		byte[] k = new byte[100];
		int lengthArr = k.length;
		Random rnd = new Random();

		while((readData = fis.read() ) != -1 ){
			for(int i=0; i<lengthArr; i++){
				System.out.printf("%02x ",k[i]);
				
			}
			System.out.println();
			readData++;
			k[50] = (byte)(readData);

		}
		fis.close();

}
}