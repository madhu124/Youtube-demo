package PassBy;

public class PassByReference {

	public static void passByRef(Student s1){
		//s1=new Student(); // using this statement the main method value is assigned to it
		s1.id=200;
		System.out.println("inside id is " +s1.id);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st1=new Student();
st1.id=100;
System.out.println("after creating obj " + st1.id);
PassByReference.passByRef(st1);
System.out.println("after creating obj " + st1.id);//it is passed by reference so the original value is assigned
	}

}
