package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sungjuk99"); //���������μ������ϸ������
		Scanner scan = new Scanner(System.in);  //new Scanner(new File("sungjuk.txt"));   //���� ��ĳ��
/*		String sub[] =	new String[]{"����","����","����"};
		System.out.println("ù��° �л�");
		String aaa = scan.nextLine();    	//����ɵ����� ��ĳ�ʷ� �Է�============>>>>>�̰Ŵٽ��ϱ�
		System.out.println("��������:"+90 +"\t��������:"+90 +"\t��������:"+90);
		System.out.println("�ι�° �л�");
		String bbb = scan.nextLine();
		System.out.println("��������:"+50 +"\t��������:"+50 +"\t��������:"+50);
		System.out.println("����° �л�");
		String ccc = scan.nextLine();
		System.out.println("��������:"+20 +"\t��������:"+20 +"\t��������:"+20);
		 */
		String saveData = "�� 90 90 90 \n�� 50 50 50 \n�� 20 20 20";  
		int student_size=3;
		int subject_size=3;
		String[]name =new String[student_size];
		String[]subject = new String[]{"����","����","����"};
		double[][]score =new double[student_size][subject_size+1];
		
		double[] kor= {90,50,20};
		double[] eng={90,50,20};
		double[] math={90,50,20};
		int result = 0;
		int avr = 0;
		for(int i = 0; i <name.length; i++){
				System.out.println("�̸��� �Է��ϼ���"+name[i]);
				scan.next();
		}for(int j = 0; j <score.length; j++){
				System.out.println("ù��° �л� ������ �Է��ϼ���"+score[j]);
				scan.next();
				
			}
		System.out.println("ù��° �л� ����:" +result );
		System.out.println("�ι�° �л� ����:" +result );
		System.out.println("����° �л� ����:" +result );
		System.out.println("ù��° �л� ���:"+avr);
		System.out.println("�ι�° �л� ���:"+avr);
		System.out.println("����° �л� ���:"+avr);
		
		fw.write(saveData);//�Է¹����� �ؽ�Ʈ���Ͽ� �ٷ� ����        ====>>�ٽ��ϱ�
		fw.close();
		
	}
	}


//Ű����κ��� �� ���� �л��� ���Ͽ� �̸�,������ ������ �Է¹޾Ƽ� ���Ϸ� �����ϴ� ���α׷�
		//while������ ��� �Է� ���� üũ�ϴ��� �ѹ��� �ο����� �Է¹ް� for������ �Է��ϵ��� ����
		//���� �ؽ�Ʈ���� ����� �о ����,��� �����Ŀ�  resultsungjuk.txt���Ϸ� ����� ���α׷�
		//�������� ���ָ�����