package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearch {
	
	public String search(List<String> list,List<String> converList){
		//ArrayList������ ������ �˻��� �̷������ �ֵ��� ����
		converList.addAll(list);
		//��ȸ�� ������ �ۼ�
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȸ���ε����� �Է�[0-"+(converList.size()));
		return converList.get();
	}
}
