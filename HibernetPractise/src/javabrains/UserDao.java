package javabrains;

import java.util.Date;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class UserDao {

	public static void main(String[] args) {
		
UserDetails user=new UserDetails();
user.setName("First Name");


/*Vehicle vehicle1=new Vehicle();
vehicle1.setVechicleName("car");

user.getVehicle().add(vehicle1);
Vehicle vehicle2=new Vehicle();
vehicle2.setVechicleName("scooty");
user.getVehicle().add(vehicle2);*/

Address addr=new Address();
addr.setCity("lees summit");
addr.setLine1("User_Line1");
addr.setLine2("User_Line2");
user.getList().add(addr);

Address addr1=new Address();
addr1.setCity("Office_addr");
addr1.setLine1("Office_User_Line1");
addr1.setLine2("Office_User_Line2");
user.getList().add(addr1);

/*user.setDateoperation(new Date());
UserDetails user2=new UserDetails();
user2.setName("Second Name");*/

//vehicle1.setUser(user);
//vehicle1.setUser(user2);
//vehicle2.setUser(user);
SessionFactory fact=new Configuration().configure().buildSessionFactory();

Session session=fact.openSession();
Transaction trans=session.beginTransaction();

//session.save(addr);
session.save(user);
//session.save(addr1);

//session.save(user2);

//session.save(vehicle2);

//session.save(vehicle1);

session.getTransaction().commit();
session.close();

//object reading
/*user=null;
session=fact.openSession();
trans=session.beginTransaction();
user=(UserDetails)session.get(UserDetails.class, 10);
System.out.println(user.getName());
*/

//lazy fectch
 
/*user=null;
session=fact.openSession();
user=(UserDetails)session.get(UserDetails.class, 1);
System.out.println(user.getList().size());*/


	}

}
