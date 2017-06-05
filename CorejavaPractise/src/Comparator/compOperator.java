package Comparator;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{

	int id;
	int age;
	String name;
	
	
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}



	



	@Override
	public int compareTo(Object o) {
Student s=(Student)o;		
if(age==s.age){
	return 0;
}
else if(age>s.age)
return 1;

else return -1;
	}
	


public String tostring(){
	return id+" " +age +" " +name ;
}
}
public class compOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(1,33,"pgr"));
al.add(new Student(1,31,"anh"));
al.add(new Student(1,13,"pgr"));
Collections.sort(al );

for(Student s:al){
	System.out.println(s.id+" "+s.name+" "+s.age);
}



	}

}
