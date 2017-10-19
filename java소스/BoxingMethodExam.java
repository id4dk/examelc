package generic02;

import java.util.Calendar;

public class BoxingMethodExam {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		int intValue = box1.getT();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("yangdoll");
		String StringValue = box2.getT();
		System.out.println(StringValue);
		
		Box<StringBuffer> box3 = Util.boxing(new StringBuffer("ȫ�浿"));
		String strValue = box3.getT().toString();
		System.out.println(strValue);

		CalExam box4 = new CalExam();
		System.out.println(box4);
		
		
		}	
	}

