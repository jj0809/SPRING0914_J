package ex01_abstract;

/*
 * 1. 추상 메소드 ( abstract method )
 *    : 형태가 없는 메소드 = 본문이 없는 메소드
 * 
 *    [작성 방법]
 *      abstract 결과타입 메소드명(매개변수);  //중괄호(본문) 없음!
 *   
 * 2. 추상 클래스 (abstract class)
 *    : 형태가 없는 클래스 = "new가 불가능한 클래스" <- 추상을 쓰는 이유, new 못하게 하려고
 *    (미완성 메소드를 부르지 못하게 하기 위함.. 
 *    그래서 상속을 받으면 리메이크해서(오버라이드) 미완성 메소드를 완성시켜야한다..)
 *    
 *    - 추상 메소드를 하나라도 가지고 있으면 추상 클래스라고 할 수 있음   
 *    
 *    [작성 방법]
 *      abstract class 클래스명{
 *      	abstract 결과타입 메소드명 (매개변수); //어딘가에 하나는 무조건 있어야 함
 *      }
 *      
 *    - 추상 클래스를 상속받는 서브클래스들은 반드시 추상 메소드를 오버라이드 해야함
 */

abstract class Coffee{
	//field
	private String beanOrigin;
	//constructor
	public Coffee(String beanOrigin) {
		this.beanOrigin = beanOrigin;
	}
	//method - 일반 메소드
	public void info() {
		System.out.println("커피원산지: " + beanOrigin);
	}
	//method - 추상 메소드
	public abstract void taste(); //이거 하나가 추상 메소드라서 Coffee 클래스가 추상 클래스가 되어야만 함 
									//맛 무맛이잖아~
	
}//coffee

class Espresso extends Coffee{
	//field
	private int water;
	//constructor
	public Espresso(String beanOrigin, int water) {
		super(beanOrigin);
		this.water = water;
	}
	//method
	//일반 메소드는 오버라이드를 하든말든 알아서 처리하는데
	//추상 메소드는 반드시 오버라이드 해야함.
	@Override
	public void info() {
		super.info(); //커피원산지 출력
		System.out.println("물의 양: " + water);
	}
	@Override
	public void taste() { //오버라이드!
		System.out.println("Espresso는 쓰다");
		
	}
	
}

class Latte extends Espresso{
	//field
	private int milk;
	//constructor
	public Latte(String beanOrigin, int water, int milk) {
		super(beanOrigin, water);
		this.milk = milk;
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info(); //커피 원산지, 물
		System.out.println("우유의 양: " + milk);
	}
	@Override
	public void taste() {
		// TODO Auto-generated method stub
		super.taste();
		System.out.println("Latte는 부드럽다.");
	}
	
	
}
public class Ex01_Coffee {

	public static void main(String[] args) {
		//new Coffee("콜롬비아"); //불가능. 추상 클래스는 객체 생성할 수 없다.
		Coffee[] list = new Coffee[2]; //클래스가 아니라 길이 잡는 거라서 됨! 다른거임!
		list[0] = new Espresso("탄자니아", 30);
		list[1] = new Latte("케냐", 30, 150);
		
		for (Coffee coffee: list) {
			if (coffee != null) {
				coffee.info();
				coffee.taste();
			}
		}
	}

}
