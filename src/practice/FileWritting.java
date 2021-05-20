package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class FileWritting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/practice/write.txt");
		try(FileWriter fileWriter = new FileWriter(file)){
			//OutputStreamWriter fileWriter;
			fileWriter.write("This is amazing.........");
			fileWriter.write("Hello From Evertz.........");
			fileWriter.write("This is amazing.........");
			fileWriter.close();
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			
			String line = null;
			
			while((line = bufferReader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch (Exception e) {
			
		}
	}

}
