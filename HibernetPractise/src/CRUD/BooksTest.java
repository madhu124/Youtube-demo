package CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BooksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
      /* Create Operation
       * 
       * for(int i=0;i<10;i++){
    	 
    	   JavaBooks book=new JavaBooks();
    	   
    	   book.setBookname("Book" + i);
    	   
    	   session.save(book);
    	   
       }*/
		
		
		/*Update Operation
		JavaBooks book= (JavaBooks)session.get(JavaBooks.class, 6);
		book.setBookname("ethics");
		session.save(book);*/
		
		/*Fetch Operation
				JavaBooks book= (JavaBooks)session.get(JavaBooks.class, 6);

		System.out.println("updates user is " + book.getBookname());
		*/
		
		// DeleteOperation
		JavaBooks book= (JavaBooks)session.get(JavaBooks.class, 6);
       session.delete(book);
		
		
		
		
		
		
		trans.commit();
		session.close();
		
		
		
	}

}
