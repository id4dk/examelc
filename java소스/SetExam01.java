package exam01;

import java.util.*;

public class SetExam01 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member ("ȫ�浿",19) );
		System.out.println("set�� ũ�� :"+set.size());
		set.add(new Member ("ȫ�浿",19) );
		System.out.println("set�� ũ�� :"+set.size());
		set.add(new Member ("ȫ�浿",19) );
		System.out.println("set�� ũ�� :"+set.size());
		
		Set<String>set2 = new HashSet<>();
		set2.add("ȫ�浿");
		System.out.println("se2t�� ũ�� :"+set.size());
		set2.add("ȫ�浿");
		System.out.println("set2�� ũ�� :"+set.size());
		set2.add("ȫ�浿");
		System.out.println("set2�� ũ�� :"+set.size());
				
	}
}
