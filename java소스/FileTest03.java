package day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest03 {
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


		//Ű����κ��� �� ���� �л��� ���Ͽ� �̸�,������ ������ �Է¹޾Ƽ� ���Ϸ� �����ϴ� ���α׷�
		//while������ ��� �Է� ���� üũ�ϴ��� �ѹ��� �ο����� �Է¹ް� for������ �Է��ϵ��� ����
		//���� �ؽ�Ʈ���� ����� �о ����,��� �����Ŀ�  resultsungjuk.txt���Ϸ� ����� ���α׷�
		//�������� ���ָ�����