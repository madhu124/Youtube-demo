package Employee;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Employee.EmployeTo;

public class EmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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

		EmployeTo e1=new EmployeTo(11,"emp_two");
		EmployeTo e2=new EmployeTo(12,"emp_one");		

		 Transaction trans=session.beginTransaction();
		 
		 try{
			 session.save(e1);
			 session.save(e2);
		 }catch (Exception e) {
			// TODO: handle exception
			 trans.rollback();
		}
		 trans.commit();
		 session.close();
			}

		}
