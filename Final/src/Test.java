
public class Test {

	final int a=10;
	public final int getA(){
		return a;
  }
	public static void main(String[] args){
		Test t=new Test();
		System.out.println(t.getA());// it is possible to call a final method in same class

		}
}
// if a class  