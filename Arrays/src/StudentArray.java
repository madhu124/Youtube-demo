
public class StudentArray {

	String [] c;
	final  String[] x={"s4","s5","s6"};
	final static int id=100;;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] marks={10,20,30};
System.out.println(marks[2]);
System.out.println("---------------");
System.out.println(" length is " +marks.length);
System.out.println("---------------");
for(int i=0;i< marks.length;i++){
	System.out.println(marks[i]);
}
String subs[]={"vakula","Sriram","varam","rajendra"};
System.out.println("---------------");
System.out.println(" length is " +subs.length);
System.out.println("---------------");

System.out.println("printing array using datatype string");
System.out.println("----------------------");

for(int j=0;j< subs.length;j++){
	System.out.println(subs[j]);
}
System.out.println("----------------------");

	
System.out.println("intializing array using object creation");
System.out.println("----------------------");
	StudentArray st1=new StudentArray();
	st1.c=new String[3];
	st1.c[0]="s0";
	st1.c[1]="s1";
	st1.c[2]="s2";
	// st1.id=200;
	for(int i=0;i< st1.c.length;i++){
		System.out.println(st1.c[i]);
	}
	System.out.println("----------------------");
System.out.println("array with static and final cant be changed but can be accesed");

StudentArray st2=new StudentArray();
//st2.x[2]="s8";// we cant change it buy y no error?
//st2.id=100;
for(int i=0;i<st2.x.length;i++){
	System.out.println(st2.x[i]);
}
	
	
	}	
	
}
