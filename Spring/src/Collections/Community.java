package Collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Community implements ApplicationContextAware,BeanNameAware {

	List<House> house= new ArrayList();

	public List<House> getHouse() {
		return house;
	}
private ApplicationContext con;
	public void setHouse(List<House> house) {
		this.house = house;
	}
	
	public void print(){
		
		for(House house:house){
		
			System.out.println("House is " + house.getApp1() + " room no is " + house.getRoomNo() +
					
					" Bedroom is " + house.getBedroom());
			
			
		}
		
	}

	@Override
	public void setApplicationContext(ApplicationContext con) throws BeansException {
this.con=con;	
System.out.println(con);
	}

	@Override
	public void setBeanName(String beanName) {
System.out.println(" BeanName is " +beanName);		
	}
	
}
