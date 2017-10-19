package ioexam;

import java.io.*;
import java.util.Date;
public class FileExam01 {
	public static void main(String[] args) throws IOException {
		 File file = new File("D:/java/day10");
		if(file.isFile()){
			System.out.println("������ ��ü�� �����Դϴ�.");
		}else{
			String[]list = file.list();
			for(int i=0; i < list.length; i++){
				System.out.println(new Date(new File(list[i]).lastModified()) );
				System.out.println(new File(list[i]).getName());
			}
		}
		System.out.println(file.lastModified());
		System.out.println(new Date(file.lastModified()) );
		
		File mkDir = new File("d:/yangdoll/yang/doll");
		if(mkDir.mkdirs()){
			System.out.println("mkdir������ �����Ǿ����ϴ�");
		}else{
			System.out.println("mkdir���� ������ �����Ͽ����ϴ�");
		} 
	

		
		File file02 = new File("./../day13/ppp.jpg");
		System.out.println(file02.getPath());
		System.out.println(file02.getAbsolutePath());
		System.out.println(file02.getCanonicalPath());
		System.out.println(file02.getName());
	
		System.out.println("������δ� :" +file.getCanonicalPath().substring(0,file.getCanonicalPath().indexOf(file.getName())));
		System.out.println(file02.length());
		System.out.println(file02.getFreeSpace());
	}
}
