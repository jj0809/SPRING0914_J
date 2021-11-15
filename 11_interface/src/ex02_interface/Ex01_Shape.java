package ex02_interface;

/*
 * 1. 인터페이스(interface): 모든 메소드가 추상 메소드인 추상 클래스
 * 	  - 인터페이스 내부에는 final 상수와 추상 메소드만 가질 수 있음 (구 버전 기준)
 * 		      (jdk 1.8 이후로 default 메소드와 static 메소드(본문이 있는 것들)도 가질 수 있음)
 * 2. 인터페이스의 특징
 *    1) 상속(extends)받는다고 하지 않고 구현(implements)한다고 함.. 
 *    2) 2개 이상의 인터페이스를 구현할 수 있음.
 *    3) abstract 키워드를 생략할 수 있음
 *    
 * 
 * 인터페이스 = 작업 지시서
 */

interface Shape{
//	public abstract String getName();
//	public abstract double getArea();
	
	//public abstract는 자동으로 삽입된다.
	String getName();
	double getArea();
	
	//알고만 있자 - 1.8 부터 본문이 있는 default, static 메소드도 인터페이스가 가질 수 있다.
//	public default void whoAmI() {
//		System.out.println("나는 도형이다.");
//	}
}

//인터페이스를 보고 구현하자
//구현 클래스
class Rect implements Shape{
	//field
	private int width, height;
	//constructor
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	//method
	@Override
	public String getName() {
		return "사각형";
	}
	@Override
	public double getArea() {
		return width * height;
	}
	
}


public class Ex01_Shape {

	public static void main(String[] args) {
	
		//interface도 구현 클래스들의 공통되는 타입이다.
		Shape[] list = new Shape[2]; //라인16의 인터페이스를 말함..
		
		list[0] = new Rect(3, 5);
		System.out.println(list[0].getName() + "의 넓이: " + list[0].getArea());
		
	}

}
