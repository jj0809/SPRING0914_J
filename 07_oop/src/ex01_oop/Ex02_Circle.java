package ex01_oop;

/*
 * ★★★★★★★★★★★중요★★★★★★★★★★★★★
 */
//좌표
class Coord {
	
	//field
	int x;
	int y;

	//constructor
	Coord (int x, int y){ //new Coord(3, 5)
		this.x = x;
		this.y = y;
	}
	Coord (Coord coord){ //new Coord(coord1)
		//매개변수가 2 개인 다른 생성자(this..)를 호출.  this를 쓰면 항상 내가 아닌 다른 생성자를 호출하므로 기억하기
	//	this.x = coord.x; 아래꺼랑 같은 말..
	//	this.y = coord.y;
		this(coord.x, coord.y);
	}
	//method
	void info() {
		System.out.print("좌표 (" + x + ", "+ y +") ");
	}
	
}

//원
class Circle{
	
	//field
	double r;
	Coord center; //Coord 타입의 센터
	
	//constructor
	Circle (double r){
	//this.r = r;
		//매개변수가 3개인 다른 생성자 (밑에꺼)를 호출
		this(1, 1, r);
	}
	Circle (int x, int y, double r){
		this.r = r;
//		center.x = x;
//		center.y = y; //틀림.. NullPointerException 발생... center가 Null이기 때문
		//center의 생성 필요, 생성은 new!!!
		center = new Coord(x, y); //center를 만들어줌 center 이제 Null 아님
	}
	
	
	//method
	double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	
	void info() {
		center.info(); //좌표 출력
		System.out.println(", 반지름: " + r + "넓이: " + getArea());
	}
	
}

public class Ex02_Circle {
	public static void main(String[] args) {
		
		Coord coord1 = new Coord(3, 5);
		Coord coord2 = new Coord(coord1); //두 번째 좌표는 첫 번째 좌표와 같다, constructor 2개 필요
		
		coord1.info(); //좌표 (3, 5)
		coord2.info(); //좌표 (3, 5)
		System.out.println();		
		Circle circle1 = new Circle(1.5); 
		Circle circle2 = new Circle(33, 55, 1.5);
		
		circle1.info();	//좌표 (1, 1)		 반지름 1.5	넓이 7.x
		circle2.info();	//좌표 (33, 55)	 반지름 1.5 	넓이 7.x
		
		
	}

}
