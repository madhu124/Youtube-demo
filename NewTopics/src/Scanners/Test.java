package Scanners;

public class Test {
	int a,b;
	public Test(int a,int b){
		this.a=a;
		this.b=b;
	}
public int getMul(){
	return a*b;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public static void main(String[] args){
Test t1=new Test(25,5);
System.out.println(t1.getMul());
}
}
