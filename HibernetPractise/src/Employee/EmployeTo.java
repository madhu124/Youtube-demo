package Employee;

public class EmployeTo {
	int id;
	String name;
	int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public EmployeTo(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public EmployeTo() {
		// TODO Auto-generated constructor stub
	}
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

}
