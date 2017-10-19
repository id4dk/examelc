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
		
		System.out.println(result); //char�ȳ����� �����ڵ�Ÿ������ �о ���ڳ���. �ݺ���Ű�� ��쿵 �ٳ���
		
		fr.close();
	
	}
}
