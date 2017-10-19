package array;

import java.util.*;

public class ArrayListExam05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet();
		//set과 list에 5개 자료 저장
		list.add("yang"); list.add("woo"); list.add("young"); 
		list.add("yang"); list.add("woo");
		System.out.println("list구조에 5개의 (중복된)자료 저장 후 크기:" +list.size());
		System.out.println(list.get(0) + "    " + list.get(2));
		set.add("yang"); set.add("woo"); set.add("young"); 
		set.add("yang"); set.add("woo");
		System.out.println("set 구조에 5개의(중복된) 자료 저장 후 크기:" +set.size());
		Iterator<String> setData = set.iterator();
		while(setData.hasNext()){
			System.out.println(setData.next());
		}
		
	}
}
