/**
 * 
 */
package Scanners;


public class Employee implements Person{
	String name;
 String dep;
public String getname(String Name){
	return Name;
}
public  void setname(String name){
this.name=name;	
}
	public String getDepartment(String dep){
		return dep;
	}
	Employee(String dep){
		super();
		this.dep=dep;
	}
	
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getDescription(){
		return  "dep is " +getDep() ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee("Elctronics");
System.out.println(e.getname("vakula"));
System.out.println(e.getDescription());

	}

}
