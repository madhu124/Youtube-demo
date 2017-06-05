package Scanners;

public class Lecture implements Person {
	public  String getname(String Name){
		return Name;
	}
	String sub;
	

	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}

public Lecture(String sub){
super();
	this.sub=sub;

}
public String getDescription(){
	return "Teaches " + sub;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lecture l=new Lecture("java");
System.out.println(l.getname("vakula"));
System.out.println(l.getSub());
System.out.println(l.getDescription());

	
	}

}
