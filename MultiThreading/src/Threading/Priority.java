package Threading;
class MyClass extends Thread{
	int count=0;
	public void run(){
		for(int i=1;i<1000;i++)
		++count;
		System.out.println("completed thread"+ Thread.currentThread().getName());
	
	
	
	System.out.println("priority is "+Thread.currentThread().getPriority());
	}
}
public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass obj=new MyClass();
Thread t1 = new Thread(obj,"one");
Thread t2= new Thread(obj,"two");
	
	
	t1.setPriority(8);
	t2.setPriority(Thread.NORM_PRIORITY);//prority is 5
	
	t1.start();
	t2.start();
	}

}
