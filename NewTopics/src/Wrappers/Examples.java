package Wrappers;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		Integer iobj=new Integer(x); // convertinh int to Integer object
		
		//Converting Integer obj to String
		String str=iobj.toString();
		System.out.println("value of string str is " +str);
		
		//converting Integer ohj to numeric datatypes
		Double d= iobj.doubleValue();
		System.out.println("double value is " +d);
		
		//converting Integer obj to float
		 float f= iobj.floatValue();
		 System.out.println("float value is" +f);
		 
		 //converting Integer obj to long
		 long l=iobj.longValue();
		 System.out.println("long value is " +l);
		 
		 //converting into byte
		 byte b=iobj.byteValue();
		 System.out.println("byte value is " +b);
		 
		 
		 //converting String to Integer object
		 String s="200";
		  Integer intObj=new Integer(s);
		  System.out.println("Integer object from string is " +s);
		  
		  //converting String to int
		  int i=intObj.intValue();
		  System.out.println("String to int " +i);
		  
		  
	}

}
