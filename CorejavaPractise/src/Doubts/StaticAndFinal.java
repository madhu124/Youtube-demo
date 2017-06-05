package Doubts;

public class StaticAndFinal {
	
	static int a=15;
	final String b="vakula";
public static void main(String[] args){
	
//Direct access of variable without object creation
	System.out.println(a);
	a=a+10;
	System.out.println(a);
	
// Object Creation is required for final
	StaticAndFinal s=new StaticAndFinal();
	System.out.println(s.b);
	
	// == operator
	
	int x= new Integer(10);
	int y=10;
	
if(x==y){
	System.out.println("equal");
}
else System.out.println("not equal");

String h="10";
String k= new String("20");
String i="10";
if(h.equals(k)){
	System.out.println("equal ");
}

if(h.equals(i)){
	System.out.println("equal ");
}


boolean equal=(h==k);
System.out.println(equal);

boolean equal1=(h==i);
System.out.println(equal1);
}
}


