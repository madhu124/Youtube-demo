package CollectionsHb;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CollMapping {

	public static void main(String[] args){
		Owner owner1=new Owner();
		owner1.setUserName("User_One");
		
		Owner owner2=new Owner();
		owner2.setUserName("User_two");
		
		//Vehicle vehicle1=new Vehicle();
		
		
		
		
		
         /*onetoone
          * owner1.setVehicle(vehicle1);
         owner2.setVehicle(vehicle2);*/
		
		/*OneToMany
		 * owner1.getVehicle().add(vehicle1);
		owner1.getVehicle().add(vehicle2);*/
		
		/*ManyToOne
		 * owner1.setVehicle(vehicle1);
		owner2.setVehicle(vehicle1);*/
		
		
		//ManyToMany
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVechiclename("car");
		
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVechiclename("Scooty");
		
		owner1.getVehicle().add(vehicle1);
		owner2.getVehicle().add(vehicle2);
		vehicle1.getowner().add(owner1);
		vehicle2.getowner().add(owner2);
		
		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
		
		session.save(vehicle1);
		session.save(owner1);

		session.save(vehicle2);
		session.save(owner2);

		
		
		
		trans.commit();
		session.close();
	}
	
	
	
}
