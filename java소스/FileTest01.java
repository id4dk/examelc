package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sungjuk99"); //최종적으로성적파일만들어짐
		Scanner scan = new Scanner(System.in);  //new Scanner(new File("sungjuk.txt"));   //파일 스캐너
/*		String sub[] =	new String[]{"국어","영어","수학"};
		System.out.println("첫번째 학생");
		String aaa = scan.nextLine();    	//저장될데이터 스캐너로 입력============>>>>>이거다시하기
		System.out.println("국어점수:"+90 +"\t영어점수:"+90 +"\t수학점수:"+90);
		System.out.println("두번째 학생");
		String bbb = scan.nextLine();
		System.out.println("국어점수:"+50 +"\t영어점수:"+50 +"\t수학점수:"+50);
		System.out.println("세번째 학생");
		String ccc = scan.nextLine();
		System.out.println("국어점수:"+20 +"\t영어점수:"+20 +"\t수학점수:"+20);
		 */
		String saveData = "김 90 90 90 \n이 50 50 50 \n박 20 20 20";  
		int student_size=3;
		int subject_size=3;
		String[]name =new String[student_size];
		String[]subject = new String[]{"국어","영어","수학"};
		double[][]score =new double[student_size][subject_size+1];
		
		double[] kor= {90,50,20};
		double[] eng={90,50,20};
		double[] math={90,50,20};
		int result = 0;
		int avr = 0;
		for(int i = 0; i <name.length; i++){
				System.out.println("이름을 입력하세요"+name[i]);
				scan.next();
		}for(int j = 0; j <score.length; j++){
				System.out.println("첫번째 학생 점수를 입력하세요"+score[j]);
				scan.next();
				
			}
		System.out.println("첫번째 학생 총점:" +result );
		System.out.println("두번째 학생 총점:" +result );
		System.out.println("세번째 학생 총점:" +result );
		System.out.println("첫번째 학생 평균:"+avr);
		System.out.println("두번째 학생 평균:"+avr);
		System.out.println("세번째 학생 평균:"+avr);
		
		fw.write(saveData);//입력받은거 텍스트파일에 바로 저장        ====>>다시하기
		fw.close();
		
	}
	}


//키보드로부터 한 반의 학생에 대하여 이름,국영수 점수를 입력받아서 파일로 저장하는 프로그램
		//while문으로 계속 입력 유무 체크하던지 한반의 인원수를 입력받고 for문으로 입력하든지 선택
		//성적 텍스트파일 만들고 읽어서 총점,평균 구한후에  resultsungjuk.txt파일로 만드는 프로그램
		//석차까지 해주면좋음