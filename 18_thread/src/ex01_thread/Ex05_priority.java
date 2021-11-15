package ex01_thread;

//Priority 우선순위

class Morning{ }
class Dry extends Morning implements Runnable{
	@Override
	public void run() {
		System.out.println("머리를 말린다.");
	}
}
class WatchTV extends Morning implements Runnable{
	@Override
	public void run() {
		System.out.println("TV를 본다.");
	}
}


public class Ex05_priority {

	public static void main(String[] args) {
		//스레드의 우선순위
//		System.out.println("가장 낮음: " + Thread.MIN_PRIORITY);
//		System.out.println("가장 높음: " + Thread.MAX_PRIORITY);
//		System.out.println("보통: " + Thread.NORM_PRIORITY);
		
		//Runnable 생성 + Thread로 변경
		Thread dry = new Thread(new Dry());
		Thread watchTV = new Thread(new WatchTV());
		
		//Thread 스케줄링은 JVM이 담당하므로 
		//dry, watchTV 중 무엇이 먼저 실행될 지 모름
		//먼저 실행시키고자 하는 스레드의 우선 순위를 높여 최대한 원하는 결과를 얻을 수 있다.
		
		//dry 먼저 하기.. 가급적 머리 먼저 말리시오
		dry.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		
		//시작하기
		watchTV.start();
		dry.start();
		
		//TV가 꼭 나중에 되고 그런거 아님..... 지 맘대로 하는 듯.. 
	}

}
