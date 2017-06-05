package InheritanceHb;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends VehiclesIn {

	
	String SteeringHandeler;

	public String getSteeringHandeler() {
		return SteeringHandeler;
	}

	public void setSteeringHandeler(String steeringHandeler) {
		SteeringHandeler = steeringHandeler;
	}
	
	
	
}
