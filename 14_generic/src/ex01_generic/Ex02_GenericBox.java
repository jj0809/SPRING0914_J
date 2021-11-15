package ex01_generic;

/* 무엇이든 담을 수 있는 GenericBox
 * 선행 작업이 필요 없는 ObjectBox와 달리
 * GenericBox를 생성할 때 저장할 데이터의 타입을 미리 결정해둔다.
 */

class GenericBox<T> { //<T>: 저장할 데이터의 타입, T: GenericBox 생성 시 어떤 타입인지 전달됨
						//T자리에는 가급적 대문자, 한 글자로 작성할 것
	//field
	private T item;
	//constructor 생략, new GeneriBox() 생성 가능
	//method
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
}

//담을 물건
class Computer{}
class Book{}
public class Ex02_GenericBox {

	public static void main(String[] args) {

		//GenericBox의 생성 ( 생성 문법 가장 중요! )
		//생성할 때 저장할 데이터의 타입을 결정해서 전달해야 한다.
//		GenericBox<Book> box = new GenericBox<Book>();
		GenericBox<Book> box = new GenericBox<>(); //최근 추세 (라인 32와 같은 뜻)
		
		/*
		//33라인의 생성 시점에 GenericBox 클래스는 아래와 같이 변경된다.
		class GenericBox<T> {
			private Book item;
			public Book getItem() {
				return item;
			}
			public void setItem(Book item) {
				this.item = item;
			}
		}
		*/
		
		//box에 Book을 저장한다.
		box.setItem(new Book()); //정상
		//box 에 Computer를 저장한다. 
//		box.setItem(new Computer()); //동작 불가. 비정상.. 컴파일에러 (ObjectBox에서는 가능했던 작업)
		//33라인에서 Book만 넣기로 지정했기 때문에 안된다.
		
		//box에 저장된 item 꺼내기
		Book book = box.getItem(); //정상동작, 캐스팅 필요없음
		
		//box에 저장된 item 꺼내기 - 잘못된 버전
//		Computer com = box.getItem(); // 비정상. 이것두 ObjectBox에서는 가능했던 작업.
		
		//정수를 담을 수 있는 GenericBox 생성
		GenericBox<Integer> box2 = new GenericBox<>(); //<int>는 불가
		//int는 기본 자료형이라서 안된당... Integer는 Wrapper클래스
		//generic 처리 시 "기본 자료형 (int, double 등)"은 사용불가하다
		//대신 Wrapper Class (Integer, DOuble 등)를 사용함
		
		box2.setItem(100); //100 -> Integer item : Auto Boxing
		int n = box2.getItem(); //꺼낼때는 문제 없음. int n = Integer : Auto UnBoxing
		
		//오토박싱 오토언박싱은 자연스럽게 이루어지므로 그냥 int와 Integer가 같다고 생각하고 쓰면 된당
		
		System.out.println(n);
		//generic은 기본 자료형을 아예! 쓸 수 없음. 대신 Wrapper클래스 쓸 수있다.
	}

}

















