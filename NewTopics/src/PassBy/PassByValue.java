package PassBy;

public class PassByValue {
	public static void PassValue(int x){
		x=x+1;
		System.out.println("x value is " +x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
System.out.println("a value is " +a);
PassByValue.PassValue(a);
System.out.println("new a is " +a);



	}

}
