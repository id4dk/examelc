package generic02;

import java.util.Calendar;


public class CalExam {
	public static int aaa;{
	

		Calendar today = Calendar.getInstance();
		System.out.println("�⵵" + today.get(Calendar.YEAR));
		System.out.println("��(0~11, 0:1��):" + today.get(Calendar.MONTH+1));
		System.out.println("�� ���� �� ° ��" + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� ����" + today.get(Calendar.DATE));
		System.out.println("�� ���� ����" + today.get(Calendar.DAY_OF_WEEK));
		
	
}
}