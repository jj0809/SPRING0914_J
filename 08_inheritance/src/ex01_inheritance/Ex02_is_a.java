package ex01_inheritance;

/*상속으로 구현할 수 있는 상황
 * 1. is - a 관계
 * 2. has - a 관계
 * 
 * 
 * is - a 관계
 * X is a Y : X는 Y이다 ... 상속
 * 
 * EV is a Car : 전기자동차(EV)는 자동차이다
 * 슈퍼클래스는 Car이고 서브클래스는 EV이다
 * 
 * 
 * is a 관계가 성립하면 상속이 가능하다.
 * 
 * has - a 상속보다는 포함관계에 어울림
 */
//슈퍼클래스
class Car{
	//method
	void drive() {
		System.out.println("Car's Drive()");
		
	}
}

//서브클래스
class EV extends Car{
	
	//method
	void charge(){
		System.out.println("EV's charge()");
	
	}
}

public class Ex02_is_a {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		
		EV ev = new EV();
		ev.drive();
		ev.charge();
		
		
		
	}

}
