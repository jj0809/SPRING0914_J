package ex01_thread;

//스레드는 스레드 클래스를 상속하고 run 메소드를 가집니다!


//Thread가 아닐 때 - 총을 한 번에 한자루밖에 못쓴다
//Thread는 쌍권총을 쓸 수 있다~!
class Gun{
	private String model;
	private int bullet;
	public Gun(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}
	
	public void shoot() {
		for (int i = 1; i <= bullet; i++) {//i는 idx가 아니라 일반 총알이여~
			System.out.println(model + "(" + i + "발 사격)");
		}
	}
	
}



public class Ex02_multi_thread {
	public static void main(String[] args) {
	
		//스레드가 아닌 Gun은 2 개 이상이 동시에 shoot() 메소드를 호출할 수 없음
		Gun g1 = new Gun("콜", 6);
		Gun g2 = new Gun("베레타", 10);
		
		g1.shoot(); //g1먼저 다 쏘고
		g2.shoot(); //이후 g2 쏨
		
	}//main

}
