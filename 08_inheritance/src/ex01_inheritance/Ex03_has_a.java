package ex01_inheritance;
/*
 * has - a 관계
 * 1. 상속 관계로 구현할 수 있다
 * 2. 대부분은 상속이 아닌 포함 관계로 구현함 
 * 
 * 포함관계: 클래스 안에 클래스가 들어가있는 것...
 * class Coord{
 * 		int x, y;
 * }
 * 
 * class Circle{
 * 		Coord center; => 여기서 Circle이 Coord를 가진다. 포함
 * 		double r;
 * }
 * 
 * has a 보다 is a 가 훨씬 많이 사용되므로 is a 기억해둘 것
 * 
 * (불확실..)has a의 경우 07_oop의 Ex02_Circle 형식으로 더 많이 사용하는 듯........하다.......
 */

//Circle has a Coord
//수퍼클래스: Coord
class Coord{
	//field
	int x, y;
	
	//constructor 생략
	
	//메소드
	void setCoord(int x, int y){
		this.x = x;
		this.y = y;
	}
	void coordInfo() {
		System.out.println("["+ x + ", " + y + "]");
	}
}
//서브클래스: Circle
class Circle extends Coord{
	//field
	double r;
	
	//constructor 생략
	
	//method
	//* Circle의 클래스는 Coord 클래스의 메소드를 사용할 수 있음..
	void setCircle(int x, int y, double r) {
		setCoord(x, y); //Coord의 메소드에 바로 저장... 마치 내꺼처럼 사용 가능
		this.r = r;
	}
	void circleInfo() {
		System.out.print("중심좌표 : " );
		coordInfo();
		System.out.println("반지름: " + r);
	}
}//Circle

public class Ex03_has_a {

	public static void main(String[] args) {
		//슈퍼클래스 - 필요 없슴~~ 
		Coord c = new Coord();
		c.setCoord(1, 1);
		c.coordInfo();
		
		//서브클래스 - 중요!
		Circle circle = new Circle();
		circle.setCircle(2, 2, 1.5); //setCoord 메소드가 함께 호출됨
		circle.circleInfo(); //coordInfo 메소드가 함께 호출됨
		
		
		
	}

}
