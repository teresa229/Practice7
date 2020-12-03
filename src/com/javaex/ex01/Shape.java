package com.javaex.ex01;

public abstract class Shape {
	
	protected String fillColor;
	
	//생성자
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}

	public abstract void draw();
}


