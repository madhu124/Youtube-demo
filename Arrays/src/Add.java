
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a={1,2,3,4,5,6};
int sum=0;
for(int i=0;i<a.length;i++){

	sum=a[i]+sum;

}
System.out.println(sum); // to find sum of array
System.out.println(sum/a.length); // to find average 
	
	for(int i=0;i<a.length;i++){
		if(a[i]==4){
			System.out.println("index of 4 is " +i);
		}
	}
	
	
	}
	

}
