package exam01;

import java.util.*;

public class test02 {
	public static void main(String[] args) {
		//�۾����� 1 =>�Է�(Linkedlist���·� �����ؼ� �Է��۾�)
		//		2 =>��ȸ(�Է¿����ؼ� ������ �ڷḦ ��ȸ)
		
		//�Է��۾�
		LinkedListInsert dataInsert = new LinkedListInsert();
		List<String>list = dataInsert.insert(new LinkedList<String>());
		
		//��ȸ�۾�
		ArrayListSearch dataSearch = new ArrayListSearch();
		String result = dataSearch.search(list, new Vector<String>());
		System.out.println("��ȸ�� ����� :" +result);
	}
	

}
