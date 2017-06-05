package LifeCycleOfbean;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import Collections.House;

public class Animal implements InitializingBean,DisposableBean {
int age;
String name;

List<CruelAnimal> cruelAnimal;





public List<CruelAnimal> getCruelAnimal() {
	return cruelAnimal;
}
public void setCruelAnimal(List<CruelAnimal> cruelAnimal) {
	this.cruelAnimal = cruelAnimal;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}







public void print(){
	System.out.println("name is " + getName() + " age is " +getAge());
	
	
	for(CruelAnimal cruelAnimal:cruelAnimal){
		
		System.out.println("name is " + cruelAnimal.getName() + " age is " + cruelAnimal.getAge());
		
		
	}
	

	
	
	
	
}


public void afterPropertiesSet() throws Exception {
System.out.println("LifeCycle of animal begin");	
}

@Override
public void destroy() throws Exception {

	System.out.println("LifeCycle of animal ends");	
}

public void FinalMethod(){
	System.out.println("We can print above methods my using init and destroy in xml final without using any interfaces and implementing them,check xml file");
}
}
