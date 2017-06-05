package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("abc.txt");
		f.createNewFile();
		File f1= new File("pqr.txt");
		f1.createNewFile();
		File f2= new File("xyz.txt");
		f2.createNewFile();


		
		FileInputStream fis= new FileInputStream("abc.txt");
		FileOutputStream fos= new FileOutputStream("pqr.txt");
		int k;
		while((k=fis.read())!=-1){
			fos.write(k);
		}


	}

}
