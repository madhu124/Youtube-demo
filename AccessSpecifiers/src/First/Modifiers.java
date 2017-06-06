package First;

public class Modifiers {
	public int age=3;
	
protected int num=5;
private double sal;
  int getNum(){
	return num;
}
public static void main(String[] args){
	Modifiers y=new Modifiers();
	System.out.println(y.getNum());
}
	
	
}
