package ControlStatemnts;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=371;
int n,c=0;
int temp=i;
while(i>0){
	n=i%10;
	c=c+(n*n*n);
	i=i/10;
}
System.out.println(c);
if(c==temp){
	System.out.println("It is Amstrong number");
}
else{
	System.out.println("not an amstrong number");
}
	}

}
