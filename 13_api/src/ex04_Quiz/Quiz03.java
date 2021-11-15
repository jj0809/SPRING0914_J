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


public class Quiz03 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String[] players = {"Player1", "Player2"};
//		int[] times = new int[2];
//		int max = 0;
//		for (int i = 0; i < 2; i++) {
//			Calendar cal = Calendar.getInstance();
//			System.out.println(players[i] + "의 게임을 시작합니다.");
//			System.out.print("준비되면 Enter를 누르세요");
//			sc.nextLine(); 
//			long start = System.currentTimeMillis();
//			System.out.println("현재 " + cal.get(Calendar.SECOND)+ "초" );
//			System.out.print("10초가 된 것 같으면 Enter를 누르세요.");
//			sc.nextLine();
//			long end = System.currentTimeMillis();
//			long elapseTime = (end / 1000) - (start/1000);
//			System.out.println("현재 " + (cal.get(Calendar.SECOND) + elapseTime) + "초");
//			times[i] = (int)elapseTime; 
//			max = times[i] > max ? times[i]: max;
//		}
//		for(int i = 0; i < 2; i++) {
//			System.out.print(players[i] + ": " + times[i] + "초, " );
//		}
//		for(int i = 0; i < 2; i++) {
//			if (max == times[i]) {
//				System.out.println(players[i] + "승리!");
//			}
//		}
//		sc.close();
	}

}
