package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Shape s = new Shape("빨강");  //추상클래스로 생성자 접근이 불가능하다.
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		
		//sr1의 가로크기 출력
//		System.out.println(((Ractangle)sr1).getWidth());
//		((Ractangle)sr1).showInfo();     :방법1
		
		System.out.println("sr1의 가로는 "+((Ractangle)sr1).getWidth()+"입니다."); // :방법2
	}
}

	
	