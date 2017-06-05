package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
int stno;
String sname;
int marks;
public Student(int stno, String sname, int marks) {
	super();
	this.stno = stno;
	this.sname = sname;
	this.marks = marks;
}
public String toString(){
	return stno + "\t"+ sname+"\t"+marks;
}


}
public class objToFile {

	
	public void serilization(Object obj) throws IOException{
		FileOutputStream fos = new FileOutputStream("student.txt");
		
		ObjectOutputStream os= new ObjectOutputStream(fos);
		os.writeObject(obj);
		System.out.println("----Serilization-------");
		
	}
	public Object deserilization() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object ob=ois.readObject();
		System.out.println("----Deserilization------");
		return ob;
		
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		objToFile sd= new objToFile();
		 Student s1= new Student(100, "st1", 85);
		 sd.serilization(s1);
		 Student s2= (Student)sd.deserilization();
		System.out.println(s2);
		
	}

}
