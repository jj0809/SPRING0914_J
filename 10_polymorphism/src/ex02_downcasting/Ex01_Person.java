package ex02_downcasting;

//모든 사람은 Person 타입이다

class Person{
	//method
	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
}//person, super

class Student extends Person{
	//method
	public void study() {
		System.out.println("공부한다.");
	}
	
}//student

class Worker extends Person{
	//method
	public void work() {
		System.out.println("일한다.");
	}
}
public class Ex01_Person {
	public static void main(String[] args) {
		//upcasting
		//수퍼클래스 타입 객체 = new 서브클래스();
		
		Person p1 = new Student();
		Person p2 = new Worker();
		
		p1.eat();
		p1.sleep();
	//	p1.study(); //?? Person 클래스의 메소드만 호출할 수 있기 때문에 에러.. 실행하고난 뒤에 가능..
		
		p2.eat();
		p2.sleep();
	//	p2.work(); // 위와 동일한 이유로 안됨..
		
		//Person 타입의 p1 객체를 student 타입으로 변환하면 study 메소드도 사용할 수 있음
		
		//다운캐스팅: 수퍼클래스 타입의 객체를 서브 클래스 타입으로 변환함
		//*반드시 강제로 변환해야 함 (업캐스팅은 자동변환)
		
		((Student)p1).study();
		((Worker)p2).work();
		
		//잘못된 다운캐스팅
		Person p3 = new Student(); //학생
	//	((Worker)p3).work(); //직장인으로 잘못 다운캐스팅했지만 이클립스가 알아차리지 못함..
							// 실행하면 오류남 Exception ~ 
							//캐스팅은 개발자가 하라면 무조건 하기 떄문에 잘못해도 이클립스가 잡아주지 못함.
							//어디가 잘못됐는지 표시가 안되서 나중에 확인하기가 어렵다
		
		//안전한 캐스팅을 위해 타입을 확인하고 캐스팅하자..
		//클래스 타입 확인: instanceof (<-연산자)
		
		if (p3 instanceof Worker) { //p3 객체가 Worker의 인스턴스(객체)인지? (Worker타입인지??)
			((Worker)p3).work(); //잘못된 캐스팅이므로 실행하지 않음^^
		}else if(p3 instanceof Student) {
			((Student)p3).study();
		} //안전한 방법~!
		
		
	}

}
