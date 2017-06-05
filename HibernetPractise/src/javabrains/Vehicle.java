package javabrains;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
@Id @GeneratedValue
	int vechicleId;
	String vechicleName;
	
	/*@ManyToOne
	UserDetails user=new UserDetails();
	
	
	
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}*/
	public int getVechicleId() {
		return vechicleId;
	}
	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}
	public String getVechicleName() {
		return vechicleName;
	}
	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
	
	
	
}
