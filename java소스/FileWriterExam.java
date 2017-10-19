package day15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("bbb.txt"); // 괄호안에 저장할 파일 이름
		String saveData = "양우영 100 90 12";
		fw.write(saveData);
		
		fw.close();
		
		//키보드로부터 한 반의 학생에 대하여 이름,국영수 점수를 입력받아서 파일로 저장하는 프로그램
		//while문으로 계속 입력 유무 체크하던지 한반의 인원수를 입력받고 for문으로 입력하든지 선택
		//성적 텍스트파일 만들고 읽어서 총점,평균 구한후에  resultsungjuk.txt파일로 만드는 프로그램
		//석차까지 해주면좋음
	}
}
