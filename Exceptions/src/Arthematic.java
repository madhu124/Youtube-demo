
public class Arthematic {

	int x,y;
	public static int  divide(int a,int b) throws Exception{
		if(b==0){
			ArithmeticException ae=new ArithmeticException("arthimatic exception ocuured");
			throw ae;
		}
		int c=a/b;
		return c;
	
	}
	//to define checked exception
	public static void BankTransfer(int amount,int ac1,int ac2) throws AmountExceed{
		if(amount>1000){
			AmountExceed ae=new AmountExceed("amount cant be transfered");
			throw ae;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// try catch for checked methods i.e userdefined exception methods like AmountExceed	
		try {
			BankTransfer(1005,1,2);
		} catch (AmountExceed e1) {
	System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		int a=10;
		int b=0;

		try{
		divide(a,b);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("start....");
		try{
		System.out.println(a/b); // as soon as it see this statement it will see for exception i.e.. catch block
		System.out.println("it skips the lines after error statement");
		}
		catch(Exception e){                  //
			System.out.println("error occured");
			System.out.println(e.getMessage()); // it is predefined method in object class exception
			e.printStackTrace();     // to denote the type of exception occured
		}

		System.out.println("finished....");
		
		int[] x={1,2,3};
		try{
			System.out.println(x[0]);
			System.out.println(x[1]);
			System.out.println(x[2]);
			System.out.println(x[8]); // outside the size of array x
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// Null point Exception  and type cast exception in HasARealationship Address
				
		
	}

}
