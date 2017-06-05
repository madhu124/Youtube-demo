package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FilesTofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("--------Reading completed");
		FileInputStream fis1= new FileInputStream("abc.txt");
		FileInputStream fis2= new FileInputStream("pqr.txt");

		FileOutputStream fos= new FileOutputStream("xyz.txt");
		
		SequenceInputStream s= new SequenceInputStream(fis1, fis2);
		 int k;
		 while((k=s.read())!=-1){
			 fos.write(k);
		 }
		System.out.println("-------writing completed---");

	}

}
