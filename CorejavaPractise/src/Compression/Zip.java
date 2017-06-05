package Compression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Zip {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("abc.txt"); 
	
		
		// attach compressed file to file output stream
		FileOutputStream fos = new FileOutputStream("aaa.txt");
		//attach fileouputstream to deflatoroutputstream
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
		
		// read data from fileinputstream and write it into defaultstream
		
		int data;
		while((data=fis.read())!=-1){
			dos.write(data);
			
		}
		
		fis.close();
		dos.close();
		System.out.println("zipping completed");
	}

}
