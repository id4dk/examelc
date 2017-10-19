package generic02;

import java.util.Calendar;


public class CalExam {
	public static int aaa;{
	

		Calendar today = Calendar.getInstance();
		System.out.println("년도" + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월):" + today.get(Calendar.MONTH+1));
		System.out.println("이 달의 몇 째 주" + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇일" + today.get(Calendar.DATE));
		System.out.println("이 달의 몇일" + today.get(Calendar.DAY_OF_WEEK));
		
	
}
}