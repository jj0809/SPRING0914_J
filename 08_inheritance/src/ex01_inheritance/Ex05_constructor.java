package ex01_inheritance;


class Father{
	//field
	String fName;
	
	//constructor
	Father(String fName){
		this.fName = fName;
	}
}//father

class Son extends Father{
	//field
	String sName;
	
	//constructor
	Son(String fName, String sName){
		//반드시 수퍼클래스의 constructor를 호출해야함
		super(fName); //Father(String fName){...} 호출
		this.sName = sName;
	}
	
	//method
	void sonInfo() {
		System.out.println("아빠 이름: " + fName);
		System.out.println("아들 이름: " + sName);
	}
	
}//son


public class Ex05_constructor {

	public static void main(String[] args) {
		
		Son boy = new Son("Tom", "Tomson");
		boy.sonInfo();
		
	}//main

}
