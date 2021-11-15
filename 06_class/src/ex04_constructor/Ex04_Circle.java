package ex04_constructor;

class Circle{
	
	//field
	int x;
	int y;
	double r;
	
	
//	생성자 2개
	Circle(int x, int y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	Circle(double r){
		this(0, 0, r);
	}
//	호출결과가 메인에 넘어가서 처리되려면 반환 결과가 있어야 함  get Area
	double getArea() {
		return Math.PI *r*r; //대문자로 이루어진 상수: 값 변경 불가, 상수 처리: final
//	 =	return Math.PI * Math.pow(r, 2);
		//결과 타입이 있으면 반드시 return문이 있어야 함
	}
	
	void info() {
		System.out.println("중심 좌표: (" + x + ", " + y +")\t 반지름: " + r);
	}
	
}//class



public class Ex04_Circle {

	public static void main(String[] args) {
		
		
		Circle circle1 = new Circle(1.5);
		Circle circle2 = new Circle(1, 2, 1.5);
		System.out.println("circle1의 크기: " + circle1.getArea());
		System.out.println("circle2의 크기: " + circle2.getArea());
		
		circle1.info(); //중심 좌표: (0, 0) 반지름: 1.5
		circle2.info(); //중심 좌표: (1, 2) 반지름: 1.5

	}

}
