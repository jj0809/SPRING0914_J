package ex03_method;



/*
 * 메소드 오버로딩 (method overloading)
 * 1. 메소드명이 같은 메소드를 여러 개 만들 수 있다.
 * 2. 반드시 매개변수가 달라야 한다. (괄호 안 내용이 달라야 한다)
 * 3. 결과타입은 전혀 상관이 없다.
 * 
 */



class Book {
	//field
	String title; //null
	String author;//null
	int price;    //0
	
	//method
	
	//1. 필드정보 저장 메소드
	
	void setInfo(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}
	
/*	//2. 필드정보 저장 메소드 - 저자가 없는 경우
	void setInfo(String t, int p){//메소드 이름 동일해야 메소드 오버로딩
		title = t;
		price = p;
		author = "미상";
	}
	
	//3. 필드정보 저장 메소드 - 가격이 없는 경우..
	void setInfo(String t, String a) {
		title = t;
		author = a;
		//price는 초기화 값인 0이 됨
	}  
	             ↓ 코드 정리
	*/
	//2. 필드정보 저장 메소드 - 저자가 없는 경우
	void setInfo(String t, int p){//메소드 이름 동일해야 메소드 오버로딩
		setInfo(t, "미상", p);
	}
	//3. 필드정보 저장 메소드 - 가격이 없는 경우..
	void setInfo(String t, String a) {
		setInfo(t, a, 0);
	}
	//4. 필드정보 출력 메소드
	void info() {
		System.out.print("제목: " + title + "\t");
		System.out.print("저자: " + author + "\t");
		System.out.println("가격: " + price + "원");
	}
	
	
	
}//Book
public class Ex03_method_overloading {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setInfo("어린왕자", "생택쥐베리", 15000);
		b1.info();
		
		Book b2 = new Book();
		b2.setInfo("홍길동전", 10000);
		b2.info();
		
		Book b3 = new Book();
		b3.setInfo("좋은생각", "박철수");
		b3.info();
	}//main

}
