package ex04_constructor;

/*
 * 객체의 생성자 호출 방법
 * this() : 자신(this)의 생성자 호출
 * 다른 코드보다 먼저 호출되어야 한다. 
 */
class Book{
	//필드
	String title;
	String author;
	int price;
	//constructor
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(String title, String author){
	/*  this.title = title;
		this.author = author;
		this.price = 0; //생략가능   */ //넘 길고 중복이 많아
		this(title, author, 0); //3개를 전달하면 3개를 받을 수 있는 맨 첫 번 째 Book이 this가 된다
								// = 매개변수가 3개 선언된 다른 생성자 호출
	}
	Book(String title, int price){
		this(title, "미상", price);
	}
	
	void info() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price);
		System.out.println("=======================");
	}
}





public class Ex02_Book {

	public static void main(String[] args) {
		Book book1 = new Book("스프링5", "최범균", 26500);
		Book book2 = new Book("홍길동전", 15000);
		Book book3 = new Book("좋은생각", "박철수");
		
		book1.info(); //제목: 스프링 5, 저자: 최범균, 가격: 26500
		book2.info(); //제목: 홍길동전, 저자: 미상,  가격: 15000
		book3.info(); //제목: 좋은 생각, 저자: 박철수, 가격: 0
		
	}

}
