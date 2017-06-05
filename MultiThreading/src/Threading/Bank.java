package Threading;

class Customer {
	public double balance = 10000;

	public synchronized void withDraw(int wamount) {
		if (balance < wamount) {
			System.out.println("Less balance = " + balance + " please deposit and continue");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
balance=balance-wamount;
System.out.println("successfully withdrawn completed the remaining balance is "+ balance);
		} else {
			balance = balance - wamount;
		}

	}

	public synchronized void deposit(int damount) {
		System.out.println("your deposit amount : " + damount);

		balance = balance + damount;
		System.out.println("Now current balance:" + balance);
		notify();

	}

}

public class Bank {

	public static void main(String[] args) {
		final Customer c = new Customer();

		new Thread() {
			public void run() {
				c.withDraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposit(13000);
			}
		}.start();

	}

}
