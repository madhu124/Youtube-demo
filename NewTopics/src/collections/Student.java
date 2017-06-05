package collections;

public class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public Student(int id){
		
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
Student(int id,String name){
	this.id=id;
	this.name=name;
	
}
public String toString(){
	return id+"---" + name;
}
}
