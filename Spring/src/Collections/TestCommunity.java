package Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCommunity {

	
	
	public static void main(String[] args){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Appar.xml");
		Community community=(Community) context.getBean("Welcome");
		community.print();
		
	}
	
}
