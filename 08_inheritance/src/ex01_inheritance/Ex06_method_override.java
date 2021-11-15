package ex01_inheritance;

//method overload와 override는 관련 없음
/*
 * 메소드 오버라이드(override)
 * 
 * 1. 수퍼클래스의 메소드를 서브클래스는 사용할 수 있음 (코드의 재활용)
 * 2. 수퍼클래스의 메소드를 서브클래스가 다시 만들어서 사용할 수 있음 (오버라이드, 리메이크)
 * 3. 수퍼클래스의 메소드와 원형(결과타입, 메소드명, 매개변수)이 모두 같아야 함
 * 4. annotation @Override 추가 권장
 *  
 */

//수퍼클래스
class Espresso {
	//field
	String beanOrigin; //원산지
	int water; //물의 양
	
	//constructor
	Espresso(String beanOrigin, int water){
		this.beanOrigin = beanOrigin;
		this.water = water;
	}
	
	//method
	void taste() {
		System.out.println("Espresso는 쓴맛");
		
	}
}//에스프레소

//서브클래스
class Latte extends Espresso {
	//field
	int milk;
	
	//constructor
	Latte(String beanOrigin, int water, int milk){
		super(beanOrigin, water); //Espresso(String beanOrigin, int water)와 동일한 의미
		this.milk = milk;
	}
	
	//method... method override해보기
	
	//Espresso 클래스에 taste 메소드가 있으나 Latte가 사용하기에 부적절하므로(쓴맛아님)
	//taste 메소드를 사용할 수는 있지만 다시 만들어서 쓰자 override
	//*동일한 원형으로 만들어야함*
	//*@override 추가하기*
	
	/* @Override의 역할
	 *1. 자바에게 아래 메소드가 override한 메소드임을 알려줌
	 *   자바는 개발자가 제대로 오버라이드 했는지 확인해줌
	 *2. 다른 개발자에게 오버라이드 했음을 알려줌
	 */
	
	@Override //없어도 되지만 추가하기
	void taste() {
		System.out.println("Latte는 부드러운맛");
	}
}//latte


public class Ex06_method_override {

	public static void main(String[] args) {
		Latte cafeLatte = new Latte("콜롬비아", 10, 150);
		cafeLatte.taste(); //Latte 클래스의 taste 메소드 호출
		
	}//main

}
