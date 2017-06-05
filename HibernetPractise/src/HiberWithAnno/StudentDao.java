package HiberWithAnno;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentDao {

	public static Session getSession(){
		Configuration config=new Configuration();
	
		config.configure("hibernate.cfg.xml");
				SessionFactory fact=config.buildSessionFactory();
		
		Session session=fact.openSession();
		
		return session;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Session session=StudentDao.getSession();
		 StudentTo s1=new StudentTo();
		 s1.setId(192);
		 s1.setName("student_one");
		 s1.setSubject("maths");
		 s1.setDob(new java.util.Date());
		 List<Address> adds1=new ArrayList<Address>();
		 	Address adress1=new Address("city1","line1","line1");
		 	Address adress2=new Address("city2","line2","line2");

		 	adds1.add(adress1);
		 	adds1.add(adress2);

		 	s1.setAddr(adds1);
		 	
		 Transaction trans=session.beginTransaction();
		 
		 try {
			session.save(s1);
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			
			
			
		}
		trans.commit();
		session.close();
		
	}

}
