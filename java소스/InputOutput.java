package kdk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputOutput {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("bbb.jpg");
		FileOutputStream fos = new FileOutputStream("bbbcp.jpg");
		
	}
}
