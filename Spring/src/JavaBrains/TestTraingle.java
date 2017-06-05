package JavaBrains;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Traingle traingle=(Traingle)context.getBean("traingle");
		
		traingle.draw();
	}

}
