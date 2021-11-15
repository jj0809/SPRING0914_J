package ex03_Object;

/* Object 클래스
 * 1. 모든 클래스들의 슈퍼 클래스
 * 2. Object 타입으로 모든 데이터를 저장할 수 있음
 * 		class Animal{}
 * 		class Dog extends Animal{}
 * 
 * 		Animal animal = new Dog(); 가 가능합니다 슈퍼클래스는 서브클래스를 관리할 수 있습니다
 *  -> Object는 모든 클래스들의 수퍼클래스
 *  	class Animal extends Object{ } 가능
 *  뭐든 저장할 수 있다!!!!!
 *  타입이 애매할.. 때는 Object로 잡으면 된다 
 *  
 * 3. 모든 클래스들은 Object 클래스의 모든 메소드를 사용할 수 있음!
 * equals, hashCode, toString 예정
 * 적극적으로 열심히 쓰지 않아도 된다....~.~
 */

class Dog {
	//method
	public void run() {
		System.out.println("개가 달린다.");
	}
}

public class Ex01_Object {
	public static void main(String[] args) {
		//모든 걸 저장할 수 있는 Object 클래스
		Object obj = new Object();
		
		//특징
		//1. 변수 저장 (기본 자료형)
		obj = 10; //에러 없음
			//new Integer(10); 의 자체변환 과정 다음 저장되는 원리...
		System.out.println(obj);
		obj = 1.5;
		System.out.println(obj);
		obj = "james"; //어떤 타입이어도 저장 가능
		System.out.println(obj);
		
		//2. 객체(인스턴스, 참조 자료형) 저장
		obj = new Dog();
		//개가 달린다.
		// obj 객체는 Object 타입이므로 Object의 메소드만 호출할 수 있음
		// -> '다운캐스팅' 필요
		((Dog)obj).run();
//		if문을 사용하면 이클립스가 다운캐스팅 해준다!
//		if (obj instanceof Dog) {
//			((Dog) obj).run();
//		}
		
		/*
		 * Object에 다 저장할 수 있음
		 * 다운캐스팅해서 사용 가능!
		 */
		
	}

}
