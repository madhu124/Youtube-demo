package Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import AppliMain.Model.Circle;

@Aspect
public class LogAspect {

//@Before("execution(public String AppliMain.Model.Circle.getName())")
	
	@Before(" allmethods() ")

	public void FirstAspect(JoinPoint joinpoint){
		int x=12,y=10;
		System.out.println("subtraction is " + (x-y));
	   
	}
	
	@AfterReturning("args(name)")
	public void AllStringMethods(String name){
	System.out.println("The value of name is " +name);	
	}
	
	
@Around("allGetters()")
public Object AroundMethod(ProceedingJoinPoint precedingpoint){
	
	Object returnvalue=null;
	
	try {
		System.out.println("Before Aspect");
		
		
		returnvalue=precedingpoint.proceed();
		
		System.out.println("After Aspect");
	} catch (Throwable e) {
		
		System.out.println("Handles exeception");
		
	}
	
	System.out.println("Final report");
	
	return returnvalue;
	
}
	
	
	/*@Before("allGetters()")

	public void SecondAspect(JoinPoint joinpoint){

	int x=12,y=10;
	System.out.println("addition is " + (x+y));
	System.out.println(joinpoint);
	}	
*/	
@Pointcut("execution(public * get*(..))")
public void allGetters(){
	
}
@Pointcut("within(AppliMain.Model.* )")

public void allmethods(){}

}
