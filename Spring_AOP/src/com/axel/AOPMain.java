package com.axel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.axel.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		//System.out.println(shapeService.getTriangle().getName());
		shapeService.getCircle().setName("Dummy name");
		//System.out.println(shapeService.getCircle().getName());

	}

}
