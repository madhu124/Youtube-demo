package Criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class TreeCriteria {

	
	
	@Id
	@GeneratedValue
	@Column(name="Tree_Id")
	int id;
	
	@Column(name="Tree_name")
	String name;
	@Column(name="Tree_Status")
	String Status;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	
}
