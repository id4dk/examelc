package array;

import java.util.*;

public class ArrayListExam05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet();
		//set�� list�� 5�� �ڷ� ����
		list.add("yang"); list.add("woo"); list.add("young"); 
		list.add("yang"); list.add("woo");
		System.out.println("list������ 5���� (�ߺ���)�ڷ� ���� �� ũ��:" +list.size());
		System.out.println(list.get(0) + "    " + list.get(2));
		set.add("yang"); set.add("woo"); set.add("young"); 
		set.add("yang"); set.add("woo");
		System.out.println("set ������ 5����(�ߺ���) �ڷ� ���� �� ũ��:" +set.size());
		Iterator<String> setData = set.iterator();
		while(setData.hasNext()){
			System.out.println(setData.next());
		}
		
	}
}
