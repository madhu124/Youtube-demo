package javabrains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue
	int id;
	@Column(name="USER_NAME")
	String name;
	/*@Temporal(TemporalType.DATE)
	private Date dateoperation = new java.sql.Date(new java.util.Date().getTime());
	
	public Date getDateoperation() {
		return dateoperation;
	}
	public void setDateoperation(Date dateoperation) {
		this.dateoperation = dateoperation;
	}*/
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="line1",column=@Column(name="Home_line1")),
	@AttributeOverride(name="line2",column=@Column(name="Home_line2")),
	@AttributeOverride(name="city", column=@Column(name="Home_City")),
	})
	Address Homeaddress;
	@Embedded
	Address OfficeAddress;
	
	public Address getHomeaddress() {
		return Homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		Homeaddress = homeaddress;
	}
	public Address getOfficeAddress() {
		return OfficeAddress;
	}*/
	
	
	
	@ElementCollection
	@JoinTable(name="User_Address",
	joinColumns=@JoinColumn(name="Use_Id"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="Address_Id") }, generator = "hilo-gen", type = @Type(type="long"))
	Collection<Address> list=new ArrayList();
	
	
		public Collection<Address> getList() {
		return list;
	}
	public void setList(Collection<Address> list) {
		this.list = list;
	}
	
	/*@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="User_Id"),
	inverseJoinColumns=@JoinColumn(name="vechicle_id")
			)
	Collection<Vehicle> vehicle=new ArrayList();
	
	
		public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}*/
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
