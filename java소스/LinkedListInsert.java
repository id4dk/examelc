package exam01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListInsert {
	public List<String> Insert(List<String>object){
		List<String> list = object;
		
		Scanner scan = new Scanner(System.in);
		String loopChe = "y";
		String data = "";
		int position = 0;
	
		while(loopChe.equals("y")){
			System.out.println("�Է� ��ġ�� �����ϼ���");
			position = scan.nextInt();
			System.out.println("�Է� �ڷḦ �����ϼ���");
			data = scan.next();
			System.out.println("��� �Է��ұ��?");
			loopChe = scan.next();
			
		}
	
	
		
		list.add(position,data); //add�� �ڷ� �Է¹޴´�.(�Էµ� ��ġ,�ڷḦ �Է¹޴´�.)
								//�ڷ��� �Է�Ƚ���� �ݺ��� �� ���� ��� �ݺ��Ұ������� �Ǵ��ϴ·���
		
		return list;
	}
}
