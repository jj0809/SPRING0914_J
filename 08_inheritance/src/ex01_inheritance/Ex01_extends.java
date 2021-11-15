package ex01_inheritance;
//슈퍼 클래스 (부모 클래스)
class Parent{
	//field
	int parentNum;
	
	//constructor
	//개발자가 만들지 않으면 생성자는 "디폴트 생성자"가 호출됨
	//디폴트 생성자:  Parent(){}
	
	//method
	void parentMethod(int n){
		parentNum = n;
		System.out.println("parentNum: " + n);
	}
	
}//parent

//서브클래스 (자식클래스)
class Child extends Parent{
	//field
	int childNum;
	
	//constructor 생략
	
	//method
	void childMethod() {
		childNum = 2;
		System.out.println("childNum: " + childNum);
	}
	@Override
	void parentMethod(int n) {
		System.out.println("override: " + n);
	}
	
}//child


public class Ex01_extends {

	public static void main(String[] args) {
		//슈퍼클래스(parent) 타입의 객체 (p) 생성
		Parent p = new Parent();
		//슈퍼클래스는 서브클래스의 멤버를 호출할 수 없음
		p.parentMethod(8);
		
		//서브클래스(child) 타입의 객체 (c) 생성
		Child c = new Child();
		//서브클래스는 슈퍼클래스의 멤버 호출 가능
		c.parentMethod(7);
		c.childMethod();
		
		
	}//main

}
