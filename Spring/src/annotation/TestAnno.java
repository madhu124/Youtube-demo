package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Interface.Shape;

public class TestAnno {

	
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Anno.xml");
		context.registerShutdownHook();
		ShopAnno shop= (ShopAnno)context.getBean("shopAnno");
shop.draw();	

		
		}

		
		
		
	}
	
	

