package com.axel.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	
	//@Before("args(name)")
	//@After("args(name)")
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method that takes String arguments has been called. The value is " + name + ". The output value is: " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex) {
		System.out.println("An exception " + ex + " has been thrown.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	//@Pointcut("execution(* * com.axel.model.Circle.*(..)")
	@Pointcut("within(com.axel.model.Circle)")
	public void allCircleMethods() {}

}
