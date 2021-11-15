package ex02_user_type;

public class Person {
	
	//field
	String name;
	int age;
	char gender;
	double height;
	boolean isAdult;
	Computer computer;
	Book book;
	
	//method
	/* 1. 필드 정보 출력하는 메소드
	 * 1) 결과타입: void
	 * 2) 메소드명: info
	 * 3) 매개변수: 없음
	 * 
	 */
	

	void info() { //괄호 안에 void라고 입력해도 문법상 문제되지는 않으나 자바에서는 쓰지 않음...
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "살, " + (isAdult ? "성인" : "미성년자"));
		System.out.println("성별: " + gender);
		System.out.println(" 키 : " + height + "cm");
		computer.info();  //컴퓨터는 이미 객체이다....
		book.print(); //북도 이미 객체입니다... 이미 구현이 끝나있는 상태입니다..

		//자바는 객체 지향적인 언어... 만들어둔 객체를 최대한 활용합니다..

	}
	
	
	
	
	/* 2. 필드에 정보 입력하는 메소드
	 * 1) 결과타입: void
	 * 2) 메소드명: save
	 * 3) 매개변수: isAdult 제외하고 모두 필요
	 * 			  String n, int a, char g, double h, Computer c, Book b; 
	 */

	void save(String n, int a, char g, double h, Computer c, Book b) {
		name = n;
		age = a;
		isAdult = a >= 20;
		gender = g;
		height = h;
		computer = c;
		book = b;
/*		computer.model = c.model;
		computer.manufacturer = c.manufacturer;
		computer.price = c.price;
		book.title = b.title;
		book.author = b.author;
		book.price = b.price;
		book.amount = b.amount;
		book.isBestSeller = b.isBestSeller;    */
	}
	
	
	
}
