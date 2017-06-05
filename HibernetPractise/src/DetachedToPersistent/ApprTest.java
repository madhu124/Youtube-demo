package DetachedToPersistent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ApprTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Appartment appr=new Appartment();
		appr.setTenantName("John");
		
		
		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
		session.save(appr);
		
		trans.commit();
		session.close();
		
		//appr.setTenantName("kevin");
		
		session=fact.openSession();
		trans=session.beginTransaction();
		session.update(appr);
         session.save(appr);
		
		trans.commit();
		session.close();
		
		
		
		
	}

}
