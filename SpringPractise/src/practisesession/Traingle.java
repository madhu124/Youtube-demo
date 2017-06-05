package practisesession;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Traingle implements ApplicationContextAware,BeanNameAware,DisposableBean,InitializingBean {

	/*List<Point> point;

	public List<Point> getPoint() {
		return point;
	}

	public void setPoint(List<Point> point) {
		this.point = point;
	}
	
	public void print(){
		
		System.out.println("Collections intialization starts");
		
		for(Point point:point){
			
			System.out.println("(" +point.getX()+","+point.getY()+")");
			
		}
		
		
		
	}*/
	
	
	
/*ObjectInjection
	 Point p1;
	Point p2;
	Point p3;

	
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	    public void print(){
		System.out.println("p1: "+"(" +p1.getX() +"," +p1.getY()+")");
		System.out.println("p2: "+"(" +p2.getX() +"," +p2.getY()+")");
		System.out.println("p3: "+"(" +p3.getX() +"," +p3.getY()+")");

		}*/
	
	
	@Autowired
	@Qualifier("hai")
	Point center;
	
	@Autowired
	private MessageSource message;
	
	ApplicationContext context=null;

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void setBeanName(String beanName) {
	
		System.out.println("bean name is " +beanName);
	}

	
	
	
	public MessageSource getMessage() {
		return message;
	}
	public void setMessage(MessageSource message) {
		this.message = message;
	}
	public void print(){
		System.out.println(this.message.getMessage("message",null,"default hai",null));
		System.out.println("cemter point is: (" +center.getX()+","+center.getY()+")");
	}
	
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
                this.context=context;		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("method intialized");		
	}
	@Override
	public void destroy() throws Exception {
System.out.println("destroy method");		
	}
	
	@PostConstruct
	public void myinit(){
		System.out.println("Init method defined in xml");
	}
	
	@PreDestroy
	public void clean(){
		System.out.println("destroy method defined in xml");
	}
	
	
}
