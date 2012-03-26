package com.codemouse.test;

public class Shape {
	private Circle circle;
	
	public void displayCircle(){
		System.out.println("Display Circle now: ");
		this.circle.display();
	}
	
	public void setCircle(Circle circle){
		this.circle = circle;
	}
	
	public Circle getCircle(){
		return this.circle;
	}
}
