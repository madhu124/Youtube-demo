import java.util.HashSet;
import java.util.Set;

public class CheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]=new int[3];// must specify size
		x[0]=100;
		x[1]=200;
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		System.out.println("------------");
		/*int a[]={10,20,30};
		int b[]=new int[2];
b=a;
System.out.println(b[2]);*/
		int[] a={10,20,30,40};
		int [] b={20,30,90};
		Set s1=new HashSet();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				
			}
		}
	}
System.out.println("----------------------");
		s1.add(10);
		s1.add(10);
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println("----------------------");
		
	int c= 12;
	
	switch (c){
		case 1:
			System.out.println("one");
	break;
		case 2:
			System.out.println("two");
	break;
		case 3:
			System.out.println("three");
	break;
		case 4:
			System.out.println("four");
	break;
		case 5:
			System.out.println("five");
	break;
		case 6:
			System.out.println("six");
	break;
		case 7:
			System.out.println("seven");
	break;
		case 8:
			System.out.println("eight");
	break;
		case 9:
			System.out.println("nine");
	break;
		default:
		
			System.out.println("other");
		
	
	}
//to find sum and average	
	
	int y=0;
	for(int i=1;i<=100;i++){
		y=y+i;
	}
	System.out.println("the sum is " +y);
	float aver=y/100;
System.out.println("the average is" +aver );	

/*int z=0;
int count=0;
for(int i=111;i<=8899;i++){
	z=z+i;
	count++;
	}
System.out.println(z);

System.out.println(count);
double average=z/count;
System.out.println(average);*/

System.out.println("----------------------");

//sum and divisible by 7
int div=0;
int count=0;
for(int i=1;i<=100;i++){
	if(i%7==0){
		div=div+i;
		count++;
	}
	
}
System.out.println(div);
System.out.println(count);
double divavr=div/count;
System.out.println(divavr);
System.out.println("----------------------");

//sum of squares

int squ=0;
for(int i=1;i<=100;i++){
	squ=squ+(i*i);
}
System.out.println(squ);
System.out.println("----------------------");
//product of inetgers

int product=1;
for(int i=1;i<=10;i++){
	product=product*i;
}
System.out.println(product);
	
//left to right and right to left

int l=0;
int r=0;
for(int i=1;i<=5000;i++){
	l=l+i;
			
}
	System.out.println("left to right sum is " +l);
	for(int i=5000;i>=0;i--){
		r=r+i;
	}
		System.out.println("right to left sum is "+r);
		System.out.println("--------------------------");
	// fibonacci series
		
		int n1=1;
		int n2=1;
		int n3=0,Count=20,i,sum=0;
		for(i=2;i<Count;i++){
			n3=n1+n2;
			System.out.println(n3);
			sum=sum+n3;

			n1=n2;
			n2=n3;
		}
		double av=sum/Count;
		System.out.println(av);
	
	// extract digits
		
		int n=1542;
		int s=0;
		while(n%10!=0){
			s=n%10;
			n=n/10;
			System.out.print(+s);
			if(n%10!=0){
				System.out.print(",");
			}
			
			//System.out.println(",");
		}

	
	}
	
	
	
}