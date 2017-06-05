package InheritanceHb;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)

//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="vehicle_type",
                      discriminatorType=DiscriminatorType.STRING
		)*/
public class VehiclesIn {
@Id
@Column(name="vehicle_id")
@GeneratedValue
	int id;
	String name;
	int LicenseNumber;
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
	public int getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		LicenseNumber = licenseNumber;
	}
}
	