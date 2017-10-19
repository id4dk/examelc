package generic;

import java.util.Date;

public class BoxUseExam {
	public static void main(String[] args) {
		Box obj = new Box();
		
		obj.setAge(19); // obj.setAge("19"); 허용하지않음
		System.out.println(obj.getAge());
		
		
		obj.setVar1(19); // 기본타입의 정수를 var1에 저장
		System.out.println(obj.getVar1()); // toString이 붙어서 실행된다.
		obj.setVar1(new StringBuffer("yangdoll")); // 문자열저장
		System.out.println(obj.getVar1());//toString이 붙어서 실행된다.
		obj.setVar1(new Date()); // 날짜를 저장,toString이 붙어서 실행된다.
		System.out.println(obj.getVar1());
	}

}
