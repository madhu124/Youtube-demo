
public class StaticStudent {
int a;
int b;
static  final int c=100;


public int getA(){
	return a;
}

public static  int Final(){
	return c;
}
 public static int getAdd(int x,int y){
	 int total=x+y;
	 //System.out.println(id);// because static methods canm only access static variables.
	 //System.out.println(c);// it can access static variables only
	//getA() // because it cant call non static methods
	 //Final(); // it is a static method so it can be called here.
	 return total; 
 }
//if a variable declare as final and static it can be accesed by anyone but cant change it.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticStudent s1=new StaticStudent();
		System.out.println(StaticStudent.getAdd(10, 20));
		System.out.println(StaticStudent.c);
		//s1.c=200;// cant change value of final static variable
		System.out.println(s1.c);
		System.out.println(StaticStudent.c);
		//s1.c=300;
		System.out.println(StaticStudent.c);
	}

}
