package Criteria;

import org.hibernate.Transaction;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
	/*for(int i=0;i<=10;i++){
		TreeCriteria tree=new TreeCriteria();
		tree.setName("tree " + i);
		session.save(tree);
		
	}*/
		
		
	Criteria creteria=session.createCriteria(TreeCriteria.class)
//.setProjection(Projections.count("id"))
.addOrder(Order.desc("id"));
	
	
	//creteria.add(Restrictions.eq("id", 4));
	
	List<TreeCriteria> Treelist= (List<TreeCriteria>)creteria.list();
	
	
	trans.commit();
	session.close();
	for(TreeCriteria tree:Treelist)
	
	System.out.println(tree.getName());  
	
	

	
		

	}

}
