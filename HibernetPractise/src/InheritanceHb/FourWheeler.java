package InheritanceHb;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends VehiclesIn {

	
	String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}
	
	
	
}
