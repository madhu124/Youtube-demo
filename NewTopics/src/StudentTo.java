
public class StudentTo {
int id;
String name;
String subject;
public StudentTo(int id, String name, String subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}
public StudentTo(){
	
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
public String getSubject() {
	return subject;
}
public void setSub(String subject) {
	this.subject = subject;
}

public String toString(){
	return id + "  " + name +"  " + subject ;
}
}
