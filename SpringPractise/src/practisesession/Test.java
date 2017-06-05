package practisesession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	
	
	
	public static void main(String[] args){
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
		Traingle traingle=(Traingle)context.getBean("traingle");
		traingle.print();
		
	}





}
