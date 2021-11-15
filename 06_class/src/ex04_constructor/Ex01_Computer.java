package ex04_constructor;

	/*
	
	★★★★매★★★★우★★★★중★★★★요★★★★
	
	★★★★생성자 (Constructor)★★★★
	1. 메소드의 일종이다
	2. 생성자의 특징
	   1) 결과타입: 존재하지 않음 (void 아님) (있었는데? 아니..그냥없어요), 아무것도 쓰지 않음
	   2) 메소드명: 클래스명과 동일한 이름 
	   3) 매개변수: 일반 메소드와 동일하게 처리
	3. 생성자는 객체 생성 시점(new)에 호출됨: 객체를 만들 때 쓰는 메소드
	4. 메소드 오버로딩 가능
	   Computer com1 = new Computer();
	   Computer com2 = new Computer("gram");
	   Computer com3 = new Computer("gram", "LG");
	  
	생성자의 목적: 객체 만들면서 "필드 값" 채우고 싶어서.....
	*/


class Computer {
	//field
	String model;
	String manufacturer;
	int price;
	
	//constructor.. 결과타입 없다!
	Computer() {
		System.out.println("Computer() 호출");
	}
	Computer(String model) {
		this.model = model;
	}
	Computer(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}
	Computer(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	/*
	 * 실제로 많이 쓰는 constructor 2 가지
	 * 아무것도 안 받는 것
	 * 모두 다 받는 것
	 * ( = 
	 * 빈 껍데기 만들고 필요한 것만 넣어서 쓰거나
	 * 내용물이 가득한 객체가 필요할 때 )
	 */
	
	//method
	//필드 정보를 출력하는 메소드
	void info() {
		System.out.println("모델: " + model); 
		System.out.println("제조사: " + manufacturer);
		System.out.println("가격: " + price);
		System.out.println("===================");
	}
	
	
}//class Computer
	
public class Ex01_Computer {
	
	
	public static void main(String[] args) {
		Computer com1 = new Computer(); //여기서 바로 필드값 입력/실행.. 
		//내용물이 없는 com1
		
		Computer com2 = new Computer("gram"); //일케 바로 값을 입력할 수 있어서 생성자를 쓴다~!!!!!!!!!!!!!!
		Computer com3 = new Computer("gram", "LG");
		Computer com4 = new Computer("gram", "LG", 180);

		com1.info();
		com2.info();
		com3.info();
		com4.info();
	}//main

}
