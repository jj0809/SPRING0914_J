package ex02_interface;

//인터페이스 이름은 "~할 수 있는(able)" 형태의 이름을 종종 사용

// 상속(extends)과 구현(implements)을 동시에 진행할 수 있다.
// 1. 상속: 다중 상속 (2개 이상의 클래스를 상속 - 엄마꺼, 아빠꺼) 불가
// 2. 자바의 다중 상속: "상속 + 구현" 의 형태로 진행할 수 있음

//순서: 상속 - 구현 
class Phone{
	//field
	private String owner;
	//constructor
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	//method
	public void sendCall() {
		System.out.println(owner + "의 전화 걸기");
	}
	public void receiveCall() {
		System.out.println(owner + "의 전화 받기");
	}
}
//다중 상속을 위해 수퍼클래스 만들고 인터페이스 만들기
interface Computable{ //computer-able 
	public abstract void playGame();
	public abstract void playMusic();
	
}

//상속 먼저, 구현 나중
class SmartPhone extends Phone implements Computable{

	//constructor 꼭 필요함: Phone의 생성자 호출해야하기 때문!
	public SmartPhone(String owner) {
		super(owner);
	}
	//Computable 에 있는 내용들을 오버라이드 꼭 해주어야함
	//method
	@Override
	public void playGame() {
		System.out.println("게임을 한다.");
	}
	@Override
	public void playMusic() {
		System.out.println("음악을 듣는다.");
	}
	
} 

//SmartPhone은 Phone에도 저장할 수 있고 Computable에도 저장할 수 있다.

public class Ex03_Computable {
	public static void main(String[] args) {
		//1. Phone타입으로 저장하기
		Phone phone1 = new SmartPhone("에밀리");
		phone1.sendCall();
		phone1.receiveCall(); //Phone 타입으로 저장하면 Phone 클래스의 메소드만 보임! 
	//	phone1.playGame(); //Computable의 기능은 캐스팅을 해야함
		((Computable)phone1).playGame();
		((Computable)phone1).playMusic();
		//2. Computable타입으로 저장하기 - 1과 반대
		Computable phone2 = new SmartPhone("앨리스");
		phone2.playGame();
		phone2.playMusic(); 
		((Phone)phone2).sendCall();
		((Phone)phone2).receiveCall();
		//SmartPhone타입으로 저장이 가능한 경우
		SmartPhone phone3 = new SmartPhone("아만다");
		phone3.sendCall();
		phone3.receiveCall();
		phone3.playGame();
		phone3.playMusic();
		
		/* 타입별로 가능한 상황에 맞추어 사용할 것 */
		
	}

}
