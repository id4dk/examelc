package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExam04 {
	public static void main(String[] args) {
		//�Է��۾� => 5��(5���� ȸ�������ߴٴ¸�)
		Scanner scan = new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		for(int i=0; i <5; i++){
			System.out.println("�̸� �Է�");
			String iname = scan.next();
			System.out.println("�ּ� �Է�");
			String address = scan.next();
			System.out.println("id�Է�");
			String id = scan.next();
			System.out.println("password�Է�");
			String pwd = scan.next();
			System.out.println("�ڵ��� ��ȣ�Է�");
			String phoneNum = scan.next();
			list.add(new Member(iname, address, id, pwd, phoneNum,1));
		}
		//DB���̺� �����ϴ� ������ �ִ�.
		//DB�� �����ϴ� ���������� list�� �޾Ƽ� ������ŭ �Է��۾� ���ش�.
		//3��° ȸ���� �̸��� �ּҸ� �˰������ ����Ұ��ΰ�
		//DB�� select �۾��� ���� ����� ���Ϲ޾Ƽ�(list���·�)
		Member getData = list.get(2); //3��°ȸ�� �̸� �˰�����ϱ� 0,1,2 => 2���־���
		String name03 = getData.getIname();
		System.out.println("3��° ȸ���� �̸�" +name03);
		String addr = getData.getAddress();
		System.out.println("3��° ȸ���� �ּ�" +addr);
	}
}
