package Threading;
class A{
	
}
public class RunnableDemo extends A implements Runnable {

	
	@Override
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println("Inside run method :" +i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunnableDemo obj= new RunnableDemo();
Thread t = new Thread(obj);
t.start();
for(int i=11;i<=20;i++){
	System.out.println("Inside main method :" +i);
}
	}

	

}
