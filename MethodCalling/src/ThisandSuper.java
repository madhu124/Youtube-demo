
public class ThisandSuper extends Super {

	int id;
	String name;
	//int c;
	
	/*public int getId() {
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
	}*/
	// Calling super class methods
	public void getProfession(){
		super.getProfession();     // calling parent class methods using super keyword and it must be first statement.
		System.out.println("child");
	}
	
public int total(int a, int b,int c){
		 /*super.getProfession();
		 getProfession();*/
	//return a+b+c;
		 int t=dototal(a,b);         // calling method dototal
		 int total=dototal(t,c);
		 return total;
	 }
public int dototal(int x,int y){      // called method
	return x+y;
}
// calling constructor

public ThisandSuper() {
	System.out.println("default constructor");
}
public ThisandSuper(int id){
	this(); // this keyword must be first statement in constructor if we are calling any constructor
	this.id=id;
	System.out.println("constructor with id");
}
public ThisandSuper(int id,String name){
	//this.id=id;  instead of this we can call constructor 
	this(id);  
	/* calling constructor from ThisandSuper(int id)
	 * this keyword must be first statement in constructor if we are calling any constructor
	 */
	this.name=name;
	System.out.println("constructor with id and name");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisandSuper test=new ThisandSuper();
ThisandSuper test1=new ThisandSuper(865,"varam");
System.out.println(test1.name);

System.out.println(test.total(5, 6, 7));
	}

}
