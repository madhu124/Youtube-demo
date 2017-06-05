package Practice;

public class Father {
	protected Father(String str){
		System.out.println("created father" +str);
	}
static{
	System.out.println(" parent static method");
}
{
	System.out.println("empty parent method");
}

}
