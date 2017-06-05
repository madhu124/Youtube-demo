package Threading;

public class ThreadDemo extends Thread {

	public void run(){
		for(int i=1;i<10;i++){
			System.out.println("Inside run method :" +i);
		}
	}
		public void start(){
			super.start();
			System.out.println("Start method");
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadDemo t= new ThreadDemo();
t.start();
for(int i=11;i<=20;i++){
	System.out.println("Inside main method :" +i);
}
	}

}
