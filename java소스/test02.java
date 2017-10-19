package exam01;

import java.util.*;

public class test02 {
	public static void main(String[] args) {
		//작업선택 1 =>입력(Linkedlist형태로 구성해서 입력작업)
		//		2 =>조회(입력에의해서 구성된 자료를 조회)
		
		//입력작업
		LinkedListInsert dataInsert = new LinkedListInsert();
		List<String>list = dataInsert.insert(new LinkedList<String>());
		
		//조회작업
		ArrayListSearch dataSearch = new ArrayListSearch();
		String result = dataSearch.search(list, new Vector<String>());
		System.out.println("조회한 결과는 :" +result);
	}
	

}
