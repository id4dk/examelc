package array;

import java.util.*;

public class ArrayListExam03 {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>(30); // ������ 30�������Ѱ�
		for(int i = 100; i < 130; i++){
			listInt.add(new Integer(i));
		}
		for(int i = 0; i < listInt.size(); i++){
			System.out.println(listInt.get(i));
		}
		System.out.println("==============�Ǵٸ����===============");
		Iterator<Integer> itor = listInt.iterator();  //�����ϴ¹��
		while(itor.hasNext()){
			System.out.println(itor.next()); 
		}
	}
}
