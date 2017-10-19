package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearch {
	
	public String search(List<String> list,List<String> converList){
		//ArrayList구조를 가지고 검색이 이루어질수 있도록 하자
		converList.addAll(list);
		//조회할 구문을 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할인덱스값 입력[0-"+(converList.size()));
		return converList.get();
	}
}
