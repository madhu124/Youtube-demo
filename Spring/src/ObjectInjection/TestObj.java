package ObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import JavaBrains.Traingle;

public class TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("obj.xml");
		line line1=(line)context.getBean("inner-bean");
		
		line1.print();
		

	}

}
