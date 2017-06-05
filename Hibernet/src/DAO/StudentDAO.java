
package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import TranferObject.Student;

public class StudentDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//get the instance of configuration
Configuration cfg=new Configuration();

/* configure the configuration file 
 * this loads the mapping files
 * connects to the database using the connection properties
 * 
 */
cfg.configure("hibernate.cfg.xml");

//obtain session factory
SessionFactory sessionfactory=cfg.buildSessionFactory();

// Using sessionfactory open a session and perform the required operation

Session session=sessionfactory.openSession();

Student s1=new Student(12,"Student one");		
 Transaction trans=session.beginTransaction();
 
 try{
	 session.save(s1);
	 
 }catch (Exception e) {
	// TODO: handle exception
	 trans.rollback();
}
 trans.commit();
 session.close();
	}

}
