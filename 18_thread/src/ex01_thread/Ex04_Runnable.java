package ex01_thread;

//이미 상속받은 클래스가 있어 Thread 클래스를 상속받지 못할 때~!

//Runnable 구현(implements)하는 법! it's 더 자주 사용되는 스레드 생성 방법!!
//상속 먼저 구현 나중!


class Clean{ }

//이미 Clean을 상속 받고 있으므로 Thread를 상속 받을 수 없다. (다중상속 금지)
//Runnable 인터페이스를 구현하는 방법을 사용해야 한다.
class RoomClean extends Clean implements Runnable{ 
	//Runnable: Run메소드를 꼭 만들어라!
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); //sleep 메소드는 runnable이 아니라 Thread 거라서 클래스이름호출
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("방 청소중");
		}
	}
	
	
	
}

class ToiletClean extends Clean implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000); //sleep 메소드는 runnable이 아니라 Thread 거라서 클래스이름호출
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("화장실 청소중");
		}
	}
}
public class Ex04_Runnable {

	public static void main(String[] args) {
		RoomClean room = new RoomClean();
		//Runnable 인터페이스를 구현한 클래스는 생성 후 thread로 바꿈!!!!
		Thread roomClean = new Thread(room); //괄호- Runnable Target
		ToiletClean toilet = new ToiletClean();
		Thread toiletClean = new Thread(toilet);
		
		//스레드 시작
		roomClean.start();
		toiletClean.start();
		
		//둘 중 아무나 먼저 시작함.. 스레드는 우선 순위가 있는데
		//최초에는 동등해서 아무나 먼저 시작시킴.. 
		//완전하게 이거 먼저 해라는 안되고 
		//가능하면 이거부터 해달라고는 할 수 있음
		
	}

}
