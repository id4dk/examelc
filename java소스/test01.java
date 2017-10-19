package exam01;

import java.util.*;


public class test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		int k =0;
		int j =0;
		System.out.println( list.size() );
		list.add(123);
		System.out.println( list.size() );
		list.add(456);
		System.out.println( list.size() );
		list.add(789);
		
		for(int i =0; i < list.size(); i++){
			k = list.size();
			System.out.println("Array" +k+i);
		}
		System.out.println( list2.size() );
		list2.add("ddd");
		System.out.println( list2.size() );
		list2.add("eee");
		System.out.println( list2.size() );
		list2.add("fff");
		for(int i =0; i < list2.size(); i++){
			j = list.size();
			System.out.println("Array" +j+i);
		}
	}
	
}
