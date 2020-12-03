package com.javaex.ex02;

public abstract class Bird {
    
	//필드
	private String name;
	
	//생성자

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public abstract String getName();
	public abstract void sing();
	public abstract void fly();
	public abstract void showName();
}