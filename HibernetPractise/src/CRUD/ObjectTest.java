package CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaBooks notes=new JavaBooks();
		
       //TransientObject
		notes.setBookname("Ethics");
		
		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
       session.save(notes);		
		//Persistemt object
       notes.setBookname("Updated Ethics");
       trans.commit();
       session.close();
     
       //Detached object
       notes.setBookname("Updated Ethics again");

       
       
	}

}
