package ex01_inheritance;

//상속관계의 생성자는 뭔가 다르다!

class Mother{
	
	//constructor
	Mother(){
		System.out.println("엄마가 태어났다");
	}
}

//서브클래스
class Daughter extends Mother{
	//constructor
	
	Daughter(){

		/*super
		 * 1. 수퍼클래스의 참조값이다
		 * 2. super의 활용
		 * 	  1) 멤버 호출: super.필드, super.메소드()
		 *    2) 생성자 호출: super()
		 * 
		 * 
		 * this와 유사하게 기능함..
		 */
		
		
		//서브클래스의 생성자는
		//반드시 수퍼클래스의 생성자가 먼저 호출되어야 함
		//단, 디폴트 생성자(매개변수 없는 생성자)는 생략 가능 - 자동으로 호출됨
		super(); //수퍼클래스의 생성자 호출 방법
		
		System.out.println("딸이 태어났다"); //생성자가 호출되는 것은 클래스가 만들어짐과 같은 의미이므로...
	}
}



public class Ex04_constructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused") //unused 가지고 경고 띄우지 말아라... 하는 의미
		Daughter d = new Daughter(); //서브클래스만 생성
			//서브클래스의 constructor를 호출하면
			//실제로는 수퍼클래스의 constructor가 먼저 호출된 후 서브클래스 생성자가 호출됨..
		
		//결과는 엄마와 딸 생성자 같이 나타남
	}

}
