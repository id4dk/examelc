package ioexam;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDir {
	public static void main(String[] args) throws IOException {
		String data = args[0];
		System.out.println(data);
		
		System.out.printf("%1$ty년 %1$tm월 %1$td일",new Date());
		
		File file = new File("D:");
		if(file.isFile()){
			String[]list = file.list();
			for(int i=0; i < list.length; i++){
				System.out.println(new Date(new File(list[i]).lastModified()) );
				System.out.println(new File(list[i]).getName());
			}
		}
		
		
		File file02 = new File("./../day13/ppp.jpg");
		System.out.println(file02.getPath());
		System.out.println(file02.getAbsolutePath());
		System.out.println(file02.getCanonicalPath());
		System.out.println(file02.getName());
	
		System.out.println("폴더경로는 :" +file02.getCanonicalPath().substring(0,file02.getCanonicalPath().indexOf(file02.getName())));
		System.out.println(file02.length());
		System.out.println(file02.getFreeSpace());
		
	}
}
//파일목록 보이게끔. 포맷쓰면좋음 지금된거처럼. printf쓰기
