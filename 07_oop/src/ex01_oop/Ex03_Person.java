package ex01_oop;


/* 책을 가지고 있는 사람 */

class Book{
	//field
	String title;
	String author;
	
	//constructor
	Book(String title, String author){ //"자바책", "김영희"
		this.title = title;
		this.author = author;
	}
	Book(String title){ //"홍길동전", "미상"
		this(title, "미상"); //매개 변수가 2개인 위의 생성자를 불러옴
	}
	//method - info
	void info() {
		System.out.println(title + ", " + author);
	}
	
}//book

class Person{
	//field
	String name;
	Book book;
	//constructor
	Person(String name, Book book){  //"데이빗", new Book("스프링5", "김철수")
		this.name = name; 
//		this.book = new Book(book.title, book.author); 내가한거.. 여기가 아니래ㅜㅜ
		this.book = book; //여기 book은 new Book에 넣어진 값들이 있으니까 그대로 쓰면 된다..
	  //this.book = new Book("스프링5", "김철수") 의 형태가 됨!
	}
	Person(String name, String title, String author){ //"제임스", "자바책", "김영희"
		this.name = name;
		this.book = new Book(title, author); //이게 맞는 방법... 
	//	book.title = title;   - NullPointerException 오류
	//	book.author = author;
	}
	Person(String name, String title){ //"데이빗", "스프링5"
		//1. 방법 
		this.name = name;
		this.book = new Book(title); //클래스 Book의 2번째 생성자를 직접 불러옴 
		//2. 방법 - 다른 생성자 이용 - this를 통해 소환
//		this(name, title, "미상"); //첫 번째 줄이 아니라서 오류남, 생성자 this 호출은 첫번째 줄이어야 함
	}
	//method - info
	void info(){
		System.out.print(name + ", ");
		book.info();
	}
	
	
}//person


public class Ex03_Person {

	public static void main(String[] args) {
		
		Person p1 = new Person("제임스", "자바책", "김영희");
		Person p2 = new Person("앨리스", "홍길동전"); //저자 없음
		Person p3 = new Person("데이빗", new Book("스프링5", "김철수")); //새로 책 받아옴
		Person p4 = new Person("에밀리", new Book("구미호전")); //받은 책에 저자가 없음
	
		p1.info(); //제임스, 자바책, 김영희
		p2.info(); //앨리스, 홍길동전, 미상
		p3.info(); //데이빗, 스프링5, 김철수
		p4.info(); //에밀리, 구미호전 ,미상

	}//main

}//package
