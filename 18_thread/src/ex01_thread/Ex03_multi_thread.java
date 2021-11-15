package ex01_thread;

//Ex02의 내용은 안바꾸고 이름들만 바꿨음

//Thread일 때 
class Pistol extends Thread {
	private String model;
	private int bullet;
	public Pistol(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}
	//thread 작업은 run 메소드의 오버라이드가 필요함
	@Override
	public void run() {
		for (int i = 1; i <= bullet; i++) {//i는 idx가 아니라 일반 총알이여~
			System.out.println(model + "(" + i + "발 사격)");
			try {
				sleep(500); //0.5초 딜레이
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Ex03_multi_thread {
	public static void main(String[] args) {
	
		//스레드인 pistol들은 각자 독립적으로 실행됨
		//2개의 pistol을 동시에 실행할 수 있음
		Pistol p1 = new Pistol("콜", 6);
		Pistol p2 = new Pistol("베레타", 10);
		
		//스레드 실행 메소드: start
		p1.start(); 
		p2.start(); 
		
		//나중에 2개 이상의 스레드가 1개의 공유자원을 어떻게 사용할지.. 
		//스레드는 작업에 대한 세부 작업들을 동시에 진행하는 것이다..
		//청소를 거실, 안방 할 때 1개의 공유자원인 청소기를 누가 사용할 것인가..
		
		
	}//main

}
