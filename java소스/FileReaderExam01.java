package day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam01 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("aaa.txt");
		int readData;
		StringBuilder result = new StringBuilder();
		while( (readData = fr.read() ) != -1){
			result.append( (char)readData);
		}
		
		System.out.println(result); //char안넣으면 유니코드타입으로 읽어서 숫자나옴. 반복시키면 양우영 다나옴
		
		fr.close();
	
	}
}
