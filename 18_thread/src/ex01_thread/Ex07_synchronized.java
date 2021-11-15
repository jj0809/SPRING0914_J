package ex01_thread;

/* 엄마: 거실 청소 (스레드)
 * 아빠: 방청소 (스레드)
 * 
 * 청소 도구 1개 (스레드에서 사용하는 자원)
 * 
 * 사이 좋게 한 번씩 Cleaner를 사용하도록
 * 사용 중(메소드 실행 중)에는 Cleaner를 가져가지 못하도록 synchronized 처리
 * 
 * synchronized: (정말정말 많이 안쓴다!)
 * 임계 영역(critical section)
 * : 공유 데이터를 관리하기 위해서 한 번에 한 스레드의 접근만 허용하는 영역
 * -> Cleaner를 임계 영역으로 만들자!
 * 메소드 앞에 추가하면 됨!
 */
class Cleaner{
	
	public synchronized void livingRoomCleaning() throws Exception{ //wait 예외 던짐
		System.out.println("거실 청소중");
		System.out.println("거실 청소 조금 했음");
		notify(); //거실 청소 끝났다, 반납.. 다른 스레드(papa)에게 알려줌
				//papa가 Cleaner 가져감
		System.out.println("방청소 끝날 때 까지 기다리는 중...");
		wait(); //기다림.. wait 예외처리 필요
	}
	public synchronized void roomCleaning() throws Exception{
		System.out.println("방 청소중");
		System.out.println("방 청소 조금 했음");
		notify(); //방 청소 끝났다고 다른 스레드(mama)에게 알려줌
				//mama가 Cleaner 가져감
		System.out.println("거실 청소 끝날때까지 기다리는 중...");
		wait(); //시간 정해놓고 쓰기.. timeout..
	}
}


class Mama extends Thread{ 
	private Cleaner cleaner;

//생성자 생략: 디폴트 타입으로 생성가능
	
	public Cleaner getCleaner() {
		return cleaner;
	}
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	@Override
	public void run() { //run에 예외던지면 오버라이드 규칙에 위배
		for (int i = 0; i < 10; i++) { //10번
			try {
			cleaner.livingRoomCleaning(); //엄마는 거실청소기능 사용
			}catch(Exception e) {
			}
			
		}
	}
}
class Papa extends Thread{
	private Cleaner cleaner;

	public Cleaner getCleaner() {
		return cleaner;
	}
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) { //20번 정도
			try{
				cleaner.roomCleaning(); //아빠는 방청소기능 사용
			}catch (Exception e) {}
		}
	}
}

public class Ex07_synchronized {
	public static void main(String[] args) {
		//Cleaner 1개
		Cleaner cleaner = new Cleaner();
		
		Mama mama = new Mama();
		Papa papa = new Papa();
		
		//스레드 2개..
		mama.setCleaner(cleaner); //엄마 청소기 들고
		mama.start(); //청소 시작
		papa.setCleaner(cleaner); //아빠 청소기 들기? 엄마가 들고 잇는데~
		papa.start(); //청소 시작?
		
		/* join도 안된다.. 왜 안되느냐? 
		 * mama가 papa보다 시작을 먼저 하는지 아닌지도 모름
		 * 아까 adder도 누가 먼저 하는지 모르는데 누가먼저 하는지 상관 없고
		 * 그냥 같이 끝나기만 하면 되서 join 가능했는데 지금은 상황이 다르다..
		 * 스레드도 아까는 1개였는데 지금은 2개 됐고..(?)
		 */
		
		
	}

}
