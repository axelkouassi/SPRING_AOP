package com.axel.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());
	}
	
	/*@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed.");
	}*/
	
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes String arguments has been called. The value is " + name + ".");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	//@Pointcut("execution(* * com.axel.model.Circle.*(..)")
	@Pointcut("within(com.axel.model.Circle)")
	public void allCircleMethods() {}

}
