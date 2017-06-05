package ControlStatemnts;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=121,n1,j=0;
int sum,temp;
temp=i;
while(i>0){
	n1=(i%10);
	
	j=(j*10)+n1;
	i=i/10;
}
if(j==temp){
	System.out.println("palindrome number");
	
}
else{System.out.println("not a palindrome");
}
}

}
