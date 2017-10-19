package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExam04 {
	public static void main(String[] args) {
		//입력작업 => 5번(5명이 회원가입했다는말)
		Scanner scan = new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		for(int i=0; i <5; i++){
			System.out.println("이름 입력");
			String iname = scan.next();
			System.out.println("주소 입력");
			String address = scan.next();
			System.out.println("id입력");
			String id = scan.next();
			System.out.println("password입력");
			String pwd = scan.next();
			System.out.println("핸드폰 번호입력");
			String phoneNum = scan.next();
			list.add(new Member(iname, address, id, pwd, phoneNum,1));
		}
		//DB테이블에 저장하는 과정이 있다.
		//DB를 저장하는 로직에서는 list를 받아서 개수만큼 입력작업 해준다.
		//3번째 회원의 이름과 주소를 알고싶을때 어떻게할것인가
		//DB의 select 작업에 의한 결과를 리턴받아서(list형태로)
		Member getData = list.get(2); //3번째회원 이름 알고싶으니까 0,1,2 => 2를넣어줌
		String name03 = getData.getIname();
		System.out.println("3번째 회원의 이름" +name03);
		String addr = getData.getAddress();
		System.out.println("3번째 회원의 주소" +addr);
	}
}
