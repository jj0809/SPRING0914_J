package ex01_upcasting;


//모든 coffee를 저장할 수 있는 Coffee 타입 만들기
class Coffee{
	//field
	private String beanOrigin; //커피콩 원산지
	//constructor
	public Coffee(String beanOrigin) {
		super(); //object용
		this.beanOrigin = beanOrigin;
	}
	//method
	public void info() {
		System.out.println("커피원산지: " + beanOrigin);
	}
	public void taste() {
		//내용이 없어도 Espresso, Latte의 호출을 위해 메소드 만들어야함...
	}
	
}//coffee

class Espresso extends Coffee{ 
	//field - coffee의 자식이므로 커피콩 원산지는 이미 포함되어 있는 정보
	private int water;
	//constructor
	public Espresso(String beanOrigin, int water) {
		super(beanOrigin);
		this.water = water;
	}
	//method
	@Override
	public void info() {
		super.info(); //coffee의 info
		System.out.println("물의 양: " + water);
	}
	@Override
	public void taste() {
		System.out.println("Espresso는 쓰다.");
	}
	
	
}//espresso

class Latte extends Espresso{
	//field - 에스프레소의 자식이므로 커피콩 원산지, 물의 양은 이미 포함되어 있는 정보
	private int milk;
	//constructor

	public Latte(String beanOrigin, int water, int milk) {
		super(beanOrigin, water);
		this.milk = milk;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("우유 양: " + milk);
	}
	@Override
	public void taste() {
		System.out.println("Latte는 부드럽다.");
	}
	
	
	
}//latte

public class Ex03_Coffee {

	public static void main(String[] args) {
		//모든 커피는 Coffee 클래스의 서브클래스이므로
		//Coffee 클래스 타입으로 저장할 수 있음.//
		Coffee coffee1 = new Espresso("케냐", 30);
		Coffee coffee2 = new Latte("인도네시아", 30, 150);
		
		coffee1.info(); //﻿Coffee 클래스에서 info 메소드를 찾아 호출 여부를 기다림
						//new에서 객체를 확인한 뒤 Espresso 클래스의 info 메소드를 호출하기로 결정한다.
		coffee1.taste(); 
		coffee2.taste();
	}

}
