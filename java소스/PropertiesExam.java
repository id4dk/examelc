package exam01;

import java.io.FilterReader;
import java.util.Properties;

public class PropertiesExam {
	public static void main(String[] args) {
		Properties pro = new  Properties();
		pro.load(new FilterReader("test.properties"));
		String ojbcData = pro.getProperty("object");
		System.out.println("������ ��ü Ŭ���� +:" + objData);
		
		Class cls = class.forName(objData);
	}
}
