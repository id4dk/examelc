package generic;

import java.util.Calendar;
import java.util.Date;

public class GenericUse {
	public static void main(String[] args) {
		GenericBox box = new GenericBox();
	//위에 노란줄 안나오게 하려면 오브젝트 붙여주면됨	GenericBox box<Object> = new GenericBox()<Object>); 
		box.age = 10; // GenericBox에서 int형으로 줫기때문에 정수만 입력가능
		box.var1 = "yang doll";	//var1은 문자타입이 된다.
		System.out.println(box.var1);
		String[]word = ((String)(box.var1)).split(" "); // Generic을 사용하면 이러한 불편함이 있음
		box.var1 = new Date();	//var1은 Date타입으로  된다.
		System.out.println(box.var1);
		
		
		GenericBox<String , Date> box2 = new GenericBox<>();
		box2.age = 12;
		box2.var1 = "qwer1234";
		box2.var1 = new Date().toString(); // box2를 String으로 줘서 Date를 못쓰지만 toString으로 바꿔줘서 사용가능
		String[] word2 = box2.var1.split(" "); //위에 Generic과 달리 형변환을 안하고 바로 split 사용가능
		box2.var2 = new Date();
		
	}

}
