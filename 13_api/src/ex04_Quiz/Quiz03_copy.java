package ex04_Quiz;

import java.util.Calendar;
import java.util.Scanner;

/* 문제. 10초 맞히기 
 * 
 * 시작할 때 Enter
 * 
 * 종료할 때 Enter
 * 그 사이 시간을 초로 계산
 * 
 * 2번 진행하여 10초에 가까운 사람이 승리!
 * 
 * 예시)
 * player1의 게임을 시작합니다.
 * 준비되면 Enter를 누르세요. - sc.nextLine();
 * (Enter를 누르면) 현재 50초
 * 10초가 된 것 같으면 Enter를 누르세요.
 * (Enter를 누르면) 현재 58초
 * 
 * player2의 게임을 시작합니다.
 * 준비되면 Enter를 누르세요.
 * (Enter를 누르면) 현재 10초
 * 10초가 된 것 같으면 Enter를 누르세요.
 * (Enter를 누르면) 현재 19초 * 
 * 
 * player1의 결과: 8초, player2의 결과: 9초, player2 승리!
 * */

class GamePlayer{
	//field
	private Scanner sc = new Scanner(System.in);
	private String name;
	//constructor
	public GamePlayer(String name) {
		this.name = name;
	}
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int play() {
		System.out.println(this.name + "의 게임을 시작합니다.");
		System.out.print("준비되면 Enter를 누르세요.");
		sc.nextLine(); //Enter가 입력될 때까지 실행되지 않는 코드
		int start = Calendar.getInstance().get(Calendar.SECOND); //시작 초(0 ~ 59)
		//int start = Calendar.getInstance();
		//cal.get(Calendar.Second); 를 연속해서 호출한것 (method chaining)
		System.out.println("현재 " + start + "초");
		//10초가 흐르는 중
		System.out.print("10초가 된 것 같으면 Enter를 누르세요.");
		sc.nextLine();
		int end = Calendar.getInstance().get(Calendar.SECOND);
		//앗! start가 55초부터 8초뒤면 망하는거얌~!
		if (end < start) {
			end += 60; //end가 start보다 작으면 60을 추가해주자! end 63초가 되엇다 63-55 = 8초!
		}
		System.out.println("현재 " + (end - start) + "초"); 
		return (end - start);
	}
	
	
}//game player

class Game{
	//field
	private GamePlayer[] players;
	private Scanner sc = new Scanner(System.in);
	//constructor
	public Game(int playerCount) { //playerCount: 게임할 인원수
		players = new GamePlayer[playerCount];
	}
	public void setPlayers() {
		for(int i = 0; i < players.length; i++) {
			System.out.print("플레이어" + (i+1) + " 이름 >>> ");
			players[i] = new GamePlayer(sc.next());
		}
	}
	
	public void play() { //GamePlayer들의 play 결과 받아서 비교
		int[] elapseTimes = new int[players.length];
		for(int i = 0; i < players.length; i++) {
			elapseTimes[i] = players[i].play(); //player i 의 결과 시간 입력
		}
		//elapseTimes 배열 비교하기
		//10 - elapseTime 의 절대값으로 비교할 수 있다. - math 클래스에 절대값 있음
		//절대값: Math.abs();
		
		//최소값 알고리즘
		//알고리즘: 배열을 순회하면서 최소값(min)보다 더 작은 배열요소가 나타나면 최소값 갈아타기
		//1. 초기화: 배열의 첫 번째 요소
		int min = Math.abs(10 - elapseTimes[0]);
		int winnerNo = 0; //min 이 저장된 요소의 인덱스
		//2. 순회하며 갈아타기
		for (int i = 1; i < players.length; i++) { 
			//위에 0부터 시작하므로 인덱스를 1부터 시작해준다.. 0부터 시작해도 상관은 없음
			if(min > Math.abs(10 - elapseTimes[i])) {
				min = Math.abs(10 - elapseTimes[i]);
				winnerNo = i;
			}
		}
		//player의 결과: 8초, player의 결과: 9초
		//player2가 이겼습니다!
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].getName() + "의 결과: " + elapseTimes[i] + "초, ");
		}
		System.out.println(players[winnerNo].getName() + "(이)가 이겼습니다!");
		
	}
}

public class Quiz03_copy {

	public static void main(String[] args) {

		Game game = new Game(2);
		game.setPlayers();
		game.play();
		
	
	}

}
