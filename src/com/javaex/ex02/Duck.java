package com.javaex.ex02;

public class Duck extends Bird {
	
	//필드
	private String name;

	//생성자
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//메소드 일반
    public void sing() {
    System.out.println("오리("+ getName()+")가 소리내어 웁니다.");
    }

    public void fly() {
    System.out.println("오리("+ getName()+")가 날지 않습니다.");
    }
    
    public void showName() {
    System.out.println("오리의 이름은 "+ getName() +"입니다.");
    }

}
