package Threading;

public class Test {

	public static void main(String[] args) {
System.out.println(Thread.currentThread().getName());
	
	Thread.currentThread().setName("Laddu");
	System.out.println(Thread.currentThread().getName());

	}

}
