
public class Student extends Professor{
int id;
String name;

 Address mailaddr;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public static void main(String[] args){
	
Student s1=new Student();
s1.id=1234;
s1.name="vakula";
Address Mail=new Address("langsford",822,"lees summit", 64086);
 s1.mailaddr=Mail;
System.out.println(s1.mailaddr.stNo);
System.out.println(s1.mailaddr.stname);
System.out.println(s1.mailaddr.area);
System.out.println(s1.mailaddr.Zipcode);
		
}
}
