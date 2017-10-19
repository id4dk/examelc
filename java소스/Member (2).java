package InputOutput;

import java.io.Serializable;

public class Member implements Serializable{
	int no;
	String iname;
	
	int age;
	public Member(int no, String iname, int age) {
		this.no = no;
		this.iname = iname;
		this.age = age;
	}
	
	
}
