package annotation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Collections.House;
@Service/*@Repository  
          @Controller
          @Component?*/
public class ShopAnno {

	point pointA;
	
	@Autowired
	private MessageSource message;
	
	
		public point getPointA() {
		return pointA;
	}
		@Autowired
	/*	@Qualifier("hai")*/
		//@Resource(name="pointB")
	public void setPointA(point pointA) {
		this.pointA = pointA;
	}
		
		
		
	
public MessageSource getMessage() {
			return message;
		}
		public void setMessage(MessageSource message) {
			this.message = message;
		}
		
		
		
		
public void draw(){
	System.out.println(this.message.getMessage("Drawing.circle",null,"default",null));
	
	System.out.println(this.message.getMessage("value",new Object[]{pointA.getX(),pointA.getY()},"default",null));

	
	
System.out.println(this.message.getMessage("greeting",null,"Hai",null));


}
@PostConstruct
public void intilizer(){
	System.out.print("instead of init method we can use the annotation @PostConstruct annotation   ");
}
@PreDestroy
public void destroy(){
	System.out.print("instead of destroy method we can use the annotation @PreDestroy annotation");

}
	
	
	}

	
