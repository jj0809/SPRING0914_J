package ex01_user_type;

/*
 * 오늘의 수업: 클래스 만들기
 * 
 * 객체지향언어
 * 1. 객체지향 언어: 모든 '사물'을 객체로 만들어서 처리하는 언어
 * 2. 클래스: 객체를 만드는 설계도
 *    클래스          | 객체
 *    붕어빵 기계    | 붕어빵
 * 
 *    클래스가 있어야 객체를 만들 수 있음
 * 3. 클래스: 개발자가 만드는 '타입'이라 볼 수 있음
 *
 */

/* 
 * 클래스의 구성요소 - 필드, 메소드
 * 1. 필드(field)
 *    객체가 가질 값
 * 2. 메소드(method)
 *    객체가 가질 기능
 * 예시)
 *    컴퓨터 클래스
 *    - 필드: 모델명, 제조사, 가격, 생산년도 등...
 *    - 메소드: 계산, 인터넷, 앱 실행, 게임 등...
 */

/*
 * 객체
 * 1. 클래스가 있어야만 객체를 생성할 수 있음
 * 2. 객체는 필드, 메소드를 가짐 (클래스와 똑같은 값, 기능을 가진다 - 객체가 클래스에 속하기 때문)
 * 3. 객체 생성 방법
 *    1) new 를 이용한 동적 생성	               *Scanner sc = new Scanner(System.in);
 *    2) 정적 생성 방법 ...나중에 나옴                  객체 이름: sc
 * 4. 필드와 메소드 호출 방법				      클래스 이름: Scanner
 *    1) 객체.필드						   *sc.nextInt()
 *    2) 객체.메소드()    				      메소드: nextInt
 */



/*
 * 하나의 자바 파일에 여러 클래스를 둘 수 있음 (비추천)
 * 파일명과 같은 이름의 클래스만 public을 붙임
 * 
 * *.java 파일을 컴파일하면 class 파일이 생기는뎅...
 * 지금 *.java 안에 class가 두 개 있으니 class 파일도 두 개가 된다..
 */



// 객체 생성을 위한 클래스 만들기
class Computer {
	String model; //클래스 내에서 선언한 변수 = 필드.
	String manufacturer; //필드
	int price; //필드
}//class
//여기까지 만든 클래스는 type의 형태로 쓰이며  main에서 실행됨




// 메인 클래스 : main 메소드를 가지고 있는 클래스
// 실행을 위해서 존재
// 객체를 만드는 목적의 클래스가 아님
public class Ex01_Computer {

	public static void main(String[] args) { //메인 메소드
		/*
		 * 메인은 반드시 실행을 위한 메소드 중 하나.. 없으면 실행이 안된다...
		 * 자바에서는 모든 메소드가 클래스 안에 들어가야 한다...
		 * 
		 * Ex01_Computer class는 단순히 메인을 가지기 위한 클래스
		 * 
		 * 메소드 안에서 선언하면 필드가 아님...그냥 변수!
		 */
		
		Computer myCom = new Computer();
		/*
		 * 클래스 이름: Computer (type)
		 * 객체(object): myCom  (variable)
		 * new: 자바에게 내리는 명령, 만들라
		 */
		
		//호출하기
		myCom.model = "GRAM";
		myCom.manufacturer = "LG";
		myCom.price = 180;
		
		//위 세 개의 데이터를 myCom 하나에 묶어서 한 번에 전달하는 방식... 데이터 관리가 가능 
		
		
		Computer yourCom = new Computer();
		yourCom.model  = "SENSE";
		yourCom.manufacturer = "SAMSUNG";
		yourCom.price = 150;
		
		//객체 자체 확인
		System.out.println(myCom); //myCom의 저장위치(참조값=주소값) 확인
		
		//필드 확인
		System.out.print(myCom.model + "  ");
		System.out.print(myCom.manufacturer + "  ");
		System.out.println(myCom.price);
	
		System.out.print(yourCom.model + "  ");
		System.out.print(yourCom.manufacturer + "  ");
		System.out.println(yourCom.price);
		
	}//main

}
