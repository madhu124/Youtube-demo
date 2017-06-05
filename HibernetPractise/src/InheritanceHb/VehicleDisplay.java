package InheritanceHb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleDisplay {

	
	
	
	public static void main(String[] args){
	
		VehiclesIn vehicle1=new VehiclesIn();
		vehicle1.setName("Scooty");
		
		TwoWheeler twowheeler1=new TwoWheeler();
		twowheeler1.setName("bike");
		twowheeler1.setSteeringHandeler("bikehandler");
		
		FourWheeler fourwheller=new FourWheeler();
		fourwheller.setName("camry");
		fourwheller.setSteeringWheel("camryWheel");
		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
		session.save(vehicle1);
		session.save(twowheeler1);
		session.save(fourwheller);
		 trans.commit();
	session.close();
	}
}
