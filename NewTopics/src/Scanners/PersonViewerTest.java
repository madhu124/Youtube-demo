package Scanners;
import Scanners.Lecture;
public class PersonViewerTest {
String Name;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
String dep;
	PersonViewerTest(String Name,String dep){
	this.Name=Name;
	this.dep=dep;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lecture l1=new Lecture("java");
Employee e1=new Employee("java");
PersonViewerTest p1= new PersonViewerTest(l1.getname("vakula"),l1.getSub());
System.out.println(p1.getName());
System.out.println(p1.getDep());
	}

}
