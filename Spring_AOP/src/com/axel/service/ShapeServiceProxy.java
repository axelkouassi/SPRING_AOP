package com.axel.service;

import com.axel.aspect.LoggingAspect;
import com.axel.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}

}
