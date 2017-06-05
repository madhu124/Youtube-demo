package Strings;

import collections.Student;

public class StringTest {
	public static void main(String[] args){
	String s1=new String("A1");
	String s2=new String("A1");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2)); 
	// compares reference and it can be override the equals method from parent class i.e.. java.lang.object
	
	Student t1=new Student(100);
	Student t2=new Student(100);
	System.out.println(t1.equals(t2));// here the student object cant override equals method from parent class
	
	System.out.println("---------------");
	String str1="A1";
	String str2="A1";
	System.out.println(str1==str2);
	System.out.println("---------------");

StringBuffer strbuf=new StringBuffer(); //it is mutables that is original string can be modified
System.out.println(strbuf);
String dummy="";
String names[]={"s1,s2,s3,s4"};
for(int i=0;i<names.length;i++){
	strbuf.append(names[i]);
	
	
}
System.out.println(strbuf);
System.out.println("---------------");


	String a1="vakula";
	// conversion from string to string buffer
	StringBuffer sb1=new StringBuffer(a1);
	System.out.println(sb1);
	sb1.append("sriram");
	System.out.println(sb1);
	System.out.println("---------------");

	//conversion from string buffer to string
	String a2=sb1.toString();

	System.out.println(a2);
	System.out.println(a2.concat("s"));
	System.out.println("---------------");

	System.out.println(a2);
	
	}
	
	
	
}