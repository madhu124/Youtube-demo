package Practice;

public class Child extends Father {
 private Child(){
		super("hi");		

	 System.out.println("created child");
 }
 static{
		System.out.println(" child static method");
	}
	{
		System.out.println("child empty method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c1=new Child();
/*if("  String".trim()== "String");
{
	System.out.println("equal");
}*/
		int i = 132;
		short s = 15;
		byte b = (byte)i;
		int x = b + s;
		System.out.println(x);
	}

}
