package HiberWithAnno;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
(name="Student_details")
public class StudentTo {

	@Id
	@GeneratedValue
	int id;
	//@Column(name="Student_name",nullable=false,length=60)
	String name;
	String subject;
	@Temporal(TemporalType.TIME)
	Date dob;
	@ElementCollection
	List<Address> addr;
	
		public void setAddr(List<Address> addr) {
		this.addr = addr;
	}
		public Date getDob() {
		return dob;
	}
		public void setDob(Date dob) {
		this.dob = dob;
	}
		public StudentTo(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	;
	public StudentTo() {
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
		
		
	
}
