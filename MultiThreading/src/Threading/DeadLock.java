package Threading;

import javax.swing.plaf.synth.SynthSpinnerUI;

import Threading.bookTicket.cancelticket;

class bookTicket extends Thread{
Object train,comp;

public bookTicket(Object train,Object comp) {

this.train=train;
this.comp=comp;
}
public void run(){
	synchronized (train) {
	System.out.println("BookTicket locked on train");
	try {
		Thread.sleep(150);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("book ticket now waiting to lock on compartment");
		
	}
	synchronized (comp){
		System.out.println("book ticket locked on cmpartment");
		
	}
	}
}
class cancelticket extends Thread{
	Object train,comp;
	cancelticket(Object train,Object comp){
		this.train=train;
		this.comp=comp;
		
	}
	
	
	public void run(){
		synchronized (comp) {
		System.out.println("cancel ticket locked on compartement");
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("cancelticket now waiting train to lock");
		}
	
	synchronized (train)
	{
		System.out.println("cancelTicket locked on train");
	}
	
	}
	
	
}
}
public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object train=new Object();
Object compartement=new Object();
bookTicket obj1= new bookTicket(train, compartement);


	}

}
