package generic;

import java.util.Calendar;
import java.util.Date;

public class GenericUse {
	public static void main(String[] args) {
		GenericBox box = new GenericBox();
	//���� ����� �ȳ����� �Ϸ��� ������Ʈ �ٿ��ָ��	GenericBox box<Object> = new GenericBox()<Object>); 
		box.age = 10; // GenericBox���� int������ �Z�⶧���� ������ �Է°���
		box.var1 = "yang doll";	//var1�� ����Ÿ���� �ȴ�.
		System.out.println(box.var1);
		String[]word = ((String)(box.var1)).split(" "); // Generic�� ����ϸ� �̷��� �������� ����
		box.var1 = new Date();	//var1�� DateŸ������  �ȴ�.
		System.out.println(box.var1);
		
		
		GenericBox<String , Date> box2 = new GenericBox<>();
		box2.age = 12;
		box2.var1 = "qwer1234";
		box2.var1 = new Date().toString(); // box2�� String���� �༭ Date�� �������� toString���� �ٲ��༭ ��밡��
		String[] word2 = box2.var1.split(" "); //���� Generic�� �޸� ����ȯ�� ���ϰ� �ٷ� split ��밡��
		box2.var2 = new Date();
		
	}

}
