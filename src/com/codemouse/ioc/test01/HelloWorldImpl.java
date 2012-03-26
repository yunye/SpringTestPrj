package com.codemouse.ioc.test01;

import java.beans.ConstructorProperties;

public class HelloWorldImpl implements HelloWorldApi {
	private String message;
	private int index;
	
	@ConstructorProperties({"message", "index"})
	public HelloWorldImpl(String message, int index){
		this.message = message;
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println("index: " + this.index + " message: " + this.message);
	}

	
	
}