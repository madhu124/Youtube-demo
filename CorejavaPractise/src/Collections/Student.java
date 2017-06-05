package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class Student {

	int id;
	String name;
	int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public static void main(String[] args){
		
Student s1=new Student(101,"st1",10);
Student s2=new Student(102,"st2",20);
Student s3=new Student(103,"st3",30);
Student s4=new Student(104,"st4",40);

Student[] Array={s1,s2,s3,s4};
LinkedHashSet lhs= new LinkedHashSet();
	
for(int i=0;i<Array.length;i++){
	
	lhs.add(Array[i].getName());
	lhs.add(Array[i].getId());
	lhs.add(Array[i].getMarks());

}

LinkedHashSet lhs1= new LinkedHashSet();
		lhs1.addAll(lhs);
		
		
Iterator it1=lhs1.iterator();
while(it1.hasNext()){
	System.out.println(it1.next());
}
System.out.println("-----------");
		



	}
}
