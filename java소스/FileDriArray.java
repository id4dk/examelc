package ioexam;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
public class FileDriArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("절대경로를 정확하게 입력하세요");
		String path = scan.next();
		File file = new File(path);
		int fileCount = 0;
		int dirCount = 0;
		long totalFileSize = 0;
		
		File[]list = file.listFiles();
		int listCnt = list.length;
		for(int i=0; i < listCnt; i++){
			if(list[i].isFile()){
				//파일일때 처리할 내용 여기들어감
				fileCount++;	//파일의 개수를 세고 파일사이즈 누적시키고
				long fileSize = list[i].length();	
				totalFileSize =+ fileSize;
				System.out.printf("%$1$tY-%$1$tm-%$1$te %2$,30d $3$30s %n", new Date( list[i].lastModified()));//파일에 관련된 정보를 형식에 맞게 출력하고
			}else{
				dirCount++;
				System.out.printf("%1$tY-%1$tm-%1$te	<Dir>\t\t");
				//폴더일때 처리할 내용 들어감
				//폴더개수세고,폴더 관련된 정보를 형식에맞게 출력
			}
		}System.out.printf("\t\t\t%-d개의 파일\t%-d,d 바이트\n", fileCount, totalFileSize );
		System.out.printf("\t\t\t%-d개 디렉토리\t%-d,d 바이트\n", fileCount, totalFileSize);
	}	//최종적으로 파일의 개수와 전체 파일의 사이즈 출력하고
}		//폴더의개수 출력..디스크남은공간 출력
