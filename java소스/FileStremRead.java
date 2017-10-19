package ioexam;

import java.io.FileInputStream;

import java.io.IOException;

public class FileStremRead {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		
		
		int data;
		while((data= fis.read())!= -1){
		System.out.println((char)data);
	
		}
		fis.close();
	}
}
