package CollectionsHb;

import java.util.ArrayList;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
//@Table(name="Owner_Vehicle")
public class Vehicle {

	
	@Id
	@GeneratedValue
	@Column(name="Vechicle_Id")
	int id;
	String Vechiclename;
	
	@ManyToMany//(mappedBy="vehicle")
	Collection<Owner> owner=new ArrayList<>();
	public Collection<Owner> getowner() {
		return owner;
	}
	public void setowner(Collection<Owner> owner) {
		this.owner = owner;
	}
	/*@ManyToOne
	@JoinColumn(name="user_id")
    Owner owner	=new Owner();
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVechiclename() {
		return Vechiclename;
	}
	public void setVechiclename(String vechiclename) {
		Vechiclename = vechiclename;
	}
	
	
	
}
