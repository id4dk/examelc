package ioexam;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
public class FileDriArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����θ� ��Ȯ�ϰ� �Է��ϼ���");
		String path = scan.next();
		File file = new File(path);
		int fileCount = 0;
		int dirCount = 0;
		long totalFileSize = 0;
		
		File[]list = file.listFiles();
		int listCnt = list.length;
		for(int i=0; i < listCnt; i++){
			if(list[i].isFile()){
				//�����϶� ó���� ���� �����
				fileCount++;	//������ ������ ���� ���ϻ����� ������Ű��
				long fileSize = list[i].length();	
				totalFileSize =+ fileSize;
				System.out.printf("%$1$tY-%$1$tm-%$1$te %2$,30d $3$30s %n", new Date( list[i].lastModified()));//���Ͽ� ���õ� ������ ���Ŀ� �°� ����ϰ�
			}else{
				dirCount++;
				System.out.printf("%1$tY-%1$tm-%1$te	<Dir>\t\t");
				//�����϶� ó���� ���� ��
				//������������,���� ���õ� ������ ���Ŀ��°� ���
			}
		}System.out.printf("\t\t\t%-d���� ����\t%-d,d ����Ʈ\n", fileCount, totalFileSize );
		System.out.printf("\t\t\t%-d�� ���丮\t%-d,d ����Ʈ\n", fileCount, totalFileSize);
	}	//���������� ������ ������ ��ü ������ ������ ����ϰ�
}		//�����ǰ��� ���..��ũ�������� ���
