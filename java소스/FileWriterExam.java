package day15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("bbb.txt"); // ��ȣ�ȿ� ������ ���� �̸�
		String saveData = "��쿵 100 90 12";
		fw.write(saveData);
		
		fw.close();
		
		//Ű����κ��� �� ���� �л��� ���Ͽ� �̸�,������ ������ �Է¹޾Ƽ� ���Ϸ� �����ϴ� ���α׷�
		//while������ ��� �Է� ���� üũ�ϴ��� �ѹ��� �ο����� �Է¹ް� for������ �Է��ϵ��� ����
		//���� �ؽ�Ʈ���� ����� �о ����,��� �����Ŀ�  resultsungjuk.txt���Ϸ� ����� ���α׷�
		//�������� ���ָ�����
	}
}
