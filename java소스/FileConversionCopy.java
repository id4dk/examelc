package ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Random;

public class FileConversionCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("zzz.jpg");
		FileOutputStream fos = new FileOutputStream("zzzcp.jpg");
		int readData;
		Random rnd = new Random();
		int position; // ���°�� ���� ���� ����Ǿ������� ��������
		int calNum;
		byte[] byData = new byte[20];
		int arrLen = byData.length;
		
		while((readData = fis.read() ) !=-1 ){
			for(int i=0; i < byData.length; i++){
				byData[i]=(byte)rnd.nextInt(255);
			}
			calNum = rnd.nextInt(15);
			position = rnd.nextInt(arrLen-2)+2; //2���� 19������ ���ڰ� ���Ƿ� �������
			readData = readData + calNum; // ���������� ������
			byData[0] = (byte)calNum;
			byData[1] = (byte)position;
			byData[2] = (byte)(readData);
			fos.write(byData);
		}
		fis.close();
		fos.close();
	}
}
