package ex01_thread;
/*
 * 스레드(Thread)
 * : 세부 실행 단위
 * : 한 작업(Task)을 구성하는 여러 스레드(세부 작업)가 존재할 수 있음
 * ex) 작업-청소, 스레드-걸레질,먼지털기..
 * : 자바 스레드는 JVM에 의해 실행되는 단위
 * : 자바는 스레드만 존재하며 상위 단위(작업)은 존재하지 않음
 * 
 * 지금까진 싱글 스레드만 했는데 오늘은 멀티 스레드를 해볼 것입니다~
 * 
 * 스레드 수가 많으면 개발 PC로 좋음.. 동시에 여러 개를 돌릴 수 있다...
 * 
 * 스레드 생성 방법
 * 방법 1. Thread 클래스를 상속 받는다. 기존에 다른 클래스를 상속 받으면 자바는 멀티 상속이 안돼서..사용불가한 방법
 * 방법 2. Runnable 인터페이스를 구현한다. <-무조건 가능한 방법
 * 		(스레드에 넣어야하는 기본 메소드: Run)
 */

class Process extends Thread{ //Thread: java.lang 기본 패키지 소속
	//Process: 일반화된 이름~ 
	
	//field
	private String processName;
	//constructor
	public Process(String processName){
		this.processName = processName;
	}
	
	//method
	//스레드는 수행 작업을 run() 메소드를 오버라이드 한다.
	@Override
	public void run() {
		//본문 의미없다..
		//스레드 동작을 보기 위해서 오~래 실행시켜보기
		//sleep(밀리초) 메소드 : Thread 클래스에 있는 일시 중지 메소드
		//sleep(1000): 1초간 일시 중지. sleep을 쓰려면 try-catch 필요 ->Interuptted Exception throws함
		try {
			for (int i = 0; i < 3; i ++) {
				sleep(1000);
				System.out.println(processName);
				//1초에 한번씩 processName을 출력함
			}
		}catch(Exception e){
				e.printStackTrace();
		}
	}
	
}

public class Ex01_Thread {
	public static void main(String[] args) {
		Process process = new Process("나의 첫 스레드");
		
		//process 객체는 run() 메소드를 가지고 있으나
		//run 메소드를 직접 호출할 수 없음 -> start()메소드로 스레드 시작함
		//자동으로 run이 호출됨
		process.start();
		//main이 그동안 쓰고 있던 단일 스레드였음... 지금은 main과 process 스레드 두 개가 되었다
		
		//process 스레드는 메인과 상관없이, 메인이 끝나도 계속 진행된다..
		System.out.println("main 스레드를 종료합니다.");
		//두 개의 스레드가 개별적으로, 동시에 진행되었다..
	}//main

}
