package Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos= new FileOutputStream("xyz.txt");
		System.out.println("Enter the data ");
		int k ;
		while((k=System.in.read())!= '@'){
			fos.write(k);
		}

	}

}
