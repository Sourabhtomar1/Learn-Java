package practice;

import java.io.File;
import java.io.FileInputStream;

public class FileReading {
	public static void main(String[] args) {
		File file = new File("src/practice/read1.txt");
		try(FileInputStream fileInputStream = new FileInputStream(file)) {
			System.out.println("Total size to read "+fileInputStream.available());
			
			int content;
			while((content = fileInputStream.read()) != -1) {
				System.out.print((char) content);
			}
		}catch(Exception e) {
			
		}
	}

}
