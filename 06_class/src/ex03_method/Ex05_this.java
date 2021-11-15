package ex03_method;


/*
 * this: 객체 자신의 참조값 (객체가 어디에 저장되어 있다)
 * 객체를 저장하는 2 가지 요소 - 필드, 메소드: 필드와 메소드에 this를 활용할 수 있다.
 * this.~~/this.~~()
 * 외부에서 전달되는 변수 이름하고, 내부 필드의 이름을 구분하기 위함
 */

class Computer {
	
	//field - 이 바닥에서 내가 this 야~!
	String model; //필드는 파랑색
	String manufacturer;
	int price;
	
	//method - 1. setInfo
	void setInfo(String model, String manufacturer, int price) { //매개변수는 핑크색..
		//model = model; //둘 다 매개변수네..
		this.model = model; // 표준형 작성 방법, 매개변수 줄여서 쓰지 마요...
		this.manufacturer = manufacturer;
		this.price = price;
	}
	//method - 2. 출력 info
	void info() {
//		System.out.println(this.model); 구분할 필요가 없으므로 this 사용 안함
		System.out.println(model); //표준형 작성 방법
		System.out.println(manufacturer);
		System.out.println(price);
	}
	
}


public class Ex05_this {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.setInfo("GRAM", "LG", 150); //값 입력 시 tab 누르면 편하게 입력할 수 있음
		com.info();
		
	}

}
