package Interface;

import org.quartz.plugins.management.ShutdownHookPlugin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context=new ClassPathXmlApplicationContext("Shape.xml");
context.registerShutdownHook();
	Shape shape= (Shape)context.getBean("traingle");
	shape.draw();
	}

}
