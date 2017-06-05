package Serialization;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		String str= "This is a book on java" + " \n I am java learner";
		 
		FileWriter fw = new FileWriter("text");
		
		// read charac ter from string and write into file
		
		for(int i=0;i<str.length();i++){
			
			fw.write(str.charAt(i));
			
			//close the file
			
			fw.close();
			System.out.println("writing completed");
		}
		
	}

}
