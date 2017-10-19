package day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest03 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("aaa.txt");
		int readData;
		StringBuilder result = new StringBuilder();
		while( (readData = fr.read() ) != -1){
			result.append( (char)readData);
		}
		
		System.out.println(result); //char안넣으면 유니코드타입으로 읽어서 숫자나옴. 반복시키면 양우영 다나옴
		
		fr.close();
	}
}


		//키보드로부터 한 반의 학생에 대하여 이름,국영수 점수를 입력받아서 파일로 저장하는 프로그램
		//while문으로 계속 입력 유무 체크하던지 한반의 인원수를 입력받고 for문으로 입력하든지 선택
		//성적 텍스트파일 만들고 읽어서 총점,평균 구한후에  resultsungjuk.txt파일로 만드는 프로그램
		//석차까지 해주면좋음