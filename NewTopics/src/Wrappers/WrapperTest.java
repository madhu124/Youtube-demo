package Wrappers;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
	//creating an integr object	
		Integer iobj=new Integer(10);
		
		//printing that integer obj in same datatype
		int i=iobj.intValue();
		System.out.println("integer value is " +i);
		
		//creating a double object
		Double dobj=new Double(16.9);
		
		//converting that double object to integer and printing it
		int j=dobj.intValue();
		System.out.println("double value converted to integer and the value is " +j);
		
		// Creating a string and converting it into integer,double,float....
		String s="15";
		Integer k=new Integer(s);
		System.out.println("the value of string after converting to Integer is " +s);
		
		//instead of above method we can use another method calles type casting
		int int1=Integer.parseInt(s);
		System.out.println("the value after typecasting is " +int1);
		// above two methods results same
		
		Double d=new Double(s);
		System.out.println("the value of string after converting to double is " +d);
		
		//typecasting for double
		double d1=Double.parseDouble(s);
		System.out.println("the string value after typrcasting to double is " +d1);
		// above two methods results same
		
		//similarly for float,long,etc....
		Float f=new Float(s);
		System.out.println("the value of string after converting to float is " +f);
		
		//converting integer to string
		
		String str=iobj.toString();
		System.out.println("the str value of iobj after conversion is " +str);
		
		// converting character to double,int,..
		
		Character c=new Character('0');
		double ci=c.charValue();
		System.out.println(ci);
		
		
	}

}
