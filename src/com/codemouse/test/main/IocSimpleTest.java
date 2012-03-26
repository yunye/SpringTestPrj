package com.codemouse.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codemouse.test.Shape;

public class IocSimpleTest {
	public static void main(String[] args){
		//Shape shape = new Shape();
		//shape.displayCircle();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shape shape = (Shape)ctx.getBean("shape");
		shape.displayCircle();
	}
}
