package ex03_Object;


class Book{
	//field
	private String title;

	//constructor
	public Book(String title) {
		super();
		this.title = title;
	}
	//method
	public void info() {
		System.out.println("책 제목: " + title);
	}
}


public class Ex03_toString {

	public static void main(String[] args) {
		Book book = new Book("이것이 자바다");
		
		//책 정보 출력
		book.info();
		
		//책 정보 출력할 때 이런 코드도 가능한가?
		System.out.println(book); //가능하지 않음
		//실행결과 ex03_Object.Book@15db9742
		//ex03_Object: class
		//@ : at
		//15db9742 : 저장된 위치
		System.out.println(book.toString());
		//실행결과 ex03_Object.Book@15db9742
		
		// => Object 클래스의 toString은 '클래스타입@메모리주소' 를 반환함
			//Ex02의 라인 27~28 참조
		//이렇게 나오면 오버라이드가 되지 않았다는 뜻으로 개발자가 toString을 만들어서
		//사용할 수 있다는 말이 된다.
		
		/*
		 * 기본적으로 Object 클래스는 toString메소드가 희한하게 동작해서
		 * 이 걸 하고 싶을 때에는 오버라이드 해서 써야한다.
		 */
	}

}
