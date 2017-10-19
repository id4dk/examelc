package array;

import java.util.*;

public class ArrayListExam03 {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>(30); // 정수형 30개저장한거
		for(int i = 100; i < 130; i++){
			listInt.add(new Integer(i));
		}
		for(int i = 0; i < listInt.size(); i++){
			System.out.println(listInt.get(i));
		}
		System.out.println("==============또다른방법===============");
		Iterator<Integer> itor = listInt.iterator();  //권장하는방법
		while(itor.hasNext()){
			System.out.println(itor.next()); 
		}
	}
}
