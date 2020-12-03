package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	//메소드 g/s 만들어 주어서 가로를 불러왔다.
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 일반
	public void draw(){ //showInfo()
		System.out.println("[사각형] #면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + " 그렸습니다.");                                                                        
	}

	public void showInfo() {
		System.out.println("sr1의 가로길이는 "+width+"입니다.");
	}

}


