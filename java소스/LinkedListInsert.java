package exam01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListInsert {
	public List<String> Insert(List<String>object){
		List<String> list = object;
		
		Scanner scan = new Scanner(System.in);
		String loopChe = "y";
		String data = "";
		int position = 0;
	
		while(loopChe.equals("y")){
			System.out.println("입력 위치를 생성하세요");
			position = scan.nextInt();
			System.out.println("입력 자료를 생성하세요");
			data = scan.next();
			System.out.println("계속 입력할까요?");
			loopChe = scan.next();
			
		}
	
	
		
		list.add(position,data); //add로 자료 입력받는다.(입력될 위치,자료를 입력받는다.)
								//자료의 입력횟수는 반복될 때 마다 계속 반복할것인지를 판단하는로직
		
		return list;
	}
}
