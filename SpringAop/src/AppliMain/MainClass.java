package AppliMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AppliMain.Model.Circle;
import AppliMain.Service.ShapeService;

public class MainClass {

	public static void main(String[] args){
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Aop.xml");
		ShapeService shapeService= ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle();
	}
	
	
	
}
