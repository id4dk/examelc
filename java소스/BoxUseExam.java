package generic;

import java.util.Date;

public class BoxUseExam {
	public static void main(String[] args) {
		Box obj = new Box();
		
		obj.setAge(19); // obj.setAge("19"); �����������
		System.out.println(obj.getAge());
		
		
		obj.setVar1(19); // �⺻Ÿ���� ������ var1�� ����
		System.out.println(obj.getVar1()); // toString�� �پ ����ȴ�.
		obj.setVar1(new StringBuffer("yangdoll")); // ���ڿ�����
		System.out.println(obj.getVar1());//toString�� �پ ����ȴ�.
		obj.setVar1(new Date()); // ��¥�� ����,toString�� �پ ����ȴ�.
		System.out.println(obj.getVar1());
	}

}
