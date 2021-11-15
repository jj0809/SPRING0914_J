package ex03_method;

class Nemo{
	
	//field
	int column;
	int low;
	
	/*
	 * 1) void
	 * 2) info
	 * 3) 없음
	 */
	void info() {
		System.out.println("너비: " + column + " 높이: " + low);
	}
	 /* 
	 * 1)void
	 * 2) setInfo
	 * 3) x y 
	 */
	//nemo1 용
	void setInfo(int x, int y) { 
		column = x;
		low = y;
	}
	//nemo2 용 
	void setInfo(int x) { //오버로딩
		setInfo(x, x);
	}
//	void setInfo(int a, double y) {
//		column = a;
//		low = (int)y;
//	}
	//넓이: return area 반환
	int getArea() {  /*  ★반환형 메소드이름★  */
		return column*low; //★초 간단!!!!!!!!!!
		/* 내꺼
		int area;
		area = column*low;
		return area;*/
	}
	
	
}//Nemo



public class Ex04_method_overloading {

	public static void main(String[] args) {
		
		//사각형 만들기
		//1. 직사각형
		Nemo nemo1 = new Nemo();
		nemo1.setInfo(3, 5); //가로 3 세로 5
		System.out.println("넓이: " + nemo1.getArea()); //넓이 15

		nemo1.info(); //너비: 3, 높이: 5  출력
		
		//2. 정사각형
		Nemo nemo2 = new Nemo();
		nemo2.setInfo(3);
		System.out.println("넓이: " + (nemo2.getArea())); //넓이 9
		nemo2.info(); //너비: 3, 높이: 3  출력
		
	} //main

}
