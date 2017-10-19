package day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student_size=3;
		int subject_size=3;
		char inputName;
		String name[] = new String[student_size];
		String subject[] = new String[]{"국어","영어","수학"};


		System.out.println("이름을입력하세요");
		for(int i=0; i<name.length;i++){
			System.out.println(scan.next());
			System.out.println("국어점수"+name[i]);
		}
	}
}
