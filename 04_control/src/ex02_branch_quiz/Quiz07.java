package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		/*
		 * 문제. 가위바위보
		 * 실행
		 * 가위 바위 보 >>> 가위
		 * 당신은 가위, 컴퓨터는 보, 이겼습니다
		 * 
		 * 숫자만 랜덤 생성이 가능하므로 가위바위보를 숫자로 정의하기 바람...
		 * 가위: 0 바위: 1 보: 2
		 */
		
	
		int a = (int)(Math.random()*3);
		String com = "";
		switch (a) {
		case 0: com = "가위"; break;
		case 1: com = "바위"; break;
		default: com = "보"; break;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보 >>> ");
		String user = sc.next();
		int b=2;
		
		switch (user) {
		case "가위" : b = 0; break;
		case "바위" : b = 1; break;
		default : b =2; break;
		}

		switch (a-b) {
		case 0: System.out.println("당신은 " + user + " 컴퓨터는 " + com + " 비겼습니다"); break;
		case 1: case -2: System.out.println("당신은 " + user + " 컴퓨터는 " + com + " 졌습니다"); break;
		default: System.out.println("당신은 " + user + " 컴퓨터는 " + com + " 이겼습니다");break;
		}
		
		sc.close();
		
		/*
		 //선생님용 코드
		 //컴퓨터: player1
		 String player1 = null;
		 int gbb1 = (int)(Math.random()*3);
		 switch(gbb1) {
		 case 0: player1 = "가위"; break;
		 case 1: player1 = "바위"; break;
		 case 2: player1 = "보"; 
		 }
		 
		 //사용자 player2
		 Scanner sc= new Scanner(System.in);
		 System.out.println("가위바위보 >>> ");
		 String player2 = sc.next();
		 int gbb2;
		 
		 switch (player2) {
		 case "가위" : gbb2 = 0; break;
		 case "바위" : gbb2 = 1; break;
		 case "보" : gbb2 = 2; 
		 }
		 
		 String result = null;
		 switch (gbb2-gbb1) {
		 case 0: result = "비김"; break;
		 case 1: case -2: result = "이김"; break;
		 default: result = "짐"; break;
		 }

		System.out.println("컴퓨터는 "+ player1 + "당신은 " + player2 + ", "+ result);

		 */

		 
		  
		 
	}

}
