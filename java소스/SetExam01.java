package exam01;

import java.util.*;

public class SetExam01 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member ("È«±æµ¿",19) );
		System.out.println("setÀÇ Å©±â :"+set.size());
		set.add(new Member ("È«±æµ¿",19) );
		System.out.println("setÀÇ Å©±â :"+set.size());
		set.add(new Member ("È«±æµ¿",19) );
		System.out.println("setÀÇ Å©±â :"+set.size());
		
		Set<String>set2 = new HashSet<>();
		set2.add("È«±æµ¿");
		System.out.println("se2tÀÇ Å©±â :"+set.size());
		set2.add("È«±æµ¿");
		System.out.println("set2ÀÇ Å©±â :"+set.size());
		set2.add("È«±æµ¿");
		System.out.println("set2ÀÇ Å©±â :"+set.size());
				
	}
}
