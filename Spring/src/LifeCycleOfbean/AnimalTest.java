package LifeCycleOfbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {

	public static void main(String[] args) {

		
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Animal.xml");
	context.registerShutdownHook();
	Animal animal=(Animal)context.getBean("mamals");
		
	}

}
