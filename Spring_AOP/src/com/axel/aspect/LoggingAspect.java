package com.axel.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice() {
		System.out.println("Advice Run. Get Method called.");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	//@Pointcut("execution(* * com.axel.model.Circle.*(..)")
	@Pointcut("within(com.axel.model.Circle)")
	public void allCircleMethods() {}

}
