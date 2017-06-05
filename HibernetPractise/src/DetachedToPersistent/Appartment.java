package DetachedToPersistent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class Appartment {

	@Id
	@GeneratedValue
	@Column(name="Room_No")
	int RoomNo;
	
	String TenantName;

	public int getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}

	public String getTenantName() {
		return TenantName;
	}

	public void setTenantName(String tenantName) {
		TenantName = tenantName;
	}
	
	
	
}
