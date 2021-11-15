package ex01_thread;

//from 부터 to 까지 모든 정수의 합을 계산하는 Adder클래스
class Adder extends Thread{

	private int from;
	private int to;
	private int total;
	
	public Adder(int from, int to) {
		super();
		this.from = from;
		this.to = to;
		this.total = 0; //생략 가능
	}
	
	public int getTotal() {
		return total;
	}
	
	public void addition() {
		for (int n = from; n <= to; n++) {
			total += n;
		}
		System.out.println(from+ "부터 " + to + "까지의  합: " + total);
	}
	
	@Override
	public void run() {
		addition();
	}
}
public class Ex06_join {

	//main도 문제 발생시 예외 던져서 처리할 수 있음
	
	//join() 메소드의 예외 처리를 main이 직접 하지 않고 (try-catch 안함)
	//main을 호출하는 곳으로 예외 처리를 던짐
	//main 호출: JVM -> JVM이 예외 처리함
	public static void main(String[] args) throws Exception{
		Adder adder1 = new Adder(1, 10); //결과: 55
		Adder adder2 = new Adder(11, 100);
		
		adder1.start(); //약속: run()이 호출되면, 개발자설정: addition() 호출된다.
		adder2.start();
		
		//main은 adder1 스레드와 adder2 스레드가 시작되자마자 종료된다. (눈깜빡할 사이)
		//adder1 스레드와 adder2 스레드가 끝날 때 까지 기다려야만 전체 합을 구할 수 있다.
		
		//join() 메소드
		//join을 호출한 스레드와 함께 하기 위해서 스레드의 종료까지 기다린다.
		//예외처리 해야함(try-catch, throws)
		
		adder1.join(); //adder1과 함께하기 위해 끝날때까지 기다린다.
		adder2.join(); //이건 누가 먼저인지 관심 없음 그냥 둘 중 하나가 먼저 하면 기다림
		
		// adder1과 adder2가 함께 끝난 후에 아래 문이 실행된다.
		//join하지 않으면 그냥 < adder1 실행~ing adder2실행~ing 메인 실행! > 일케 됨
		//join 하고... < adder1 실행~ing adder2실행~ing adder1실행 완료 adder2 기다림
		//adder2 실행완료 메인 실행! >
		
		System.out.println("전체 합: " + (adder1.getTotal() + adder2.getTotal()));
		
		
	}

}
