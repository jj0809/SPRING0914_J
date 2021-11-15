package testPackage;

import java.util.Scanner;


public class Quiz06 {

	public static void main(String[] args) {
		/*
		 * 사용자가 가위, 바위, 보 중 하나를 입력하고 enter를 입력하면
		 * 컴퓨터는 가위, 바위, 보 중 하나를 랜덤하게 선택해서 누가 이겼는지 판단
		 * 사용자가 가위, 바위 보 대신 "그만"을 입력하면 그 동안의 전적이 출력
		 * (3승 3무 3패) 게임이 종료된다
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int usernum = 0;
		int draw = 0;
		int win = 0;
		int lose = 0;
		String com = "";
		
		while (true) {
			System.out.print("가위 바위 보! >> ");
			String user = sc.next();
			sc.nextLine();
			
			
			if (!user.equals("그만")) {
				
				int comnum = (int)(Math.random()*3) + 1;
			
				switch(user) {
				case "가위" : usernum = 1; break;
				case "바위" : usernum = 2; break;
				case "보" : usernum = 3; break;
				default: System.out.println("가위바위보가 아님"); break;
				}
				switch(comnum) {
				case 1: com = "가위"; break;
				case 2: com = "바위"; break;
				case 3: com = "보"; break;
				default: com = "";
				}
				System.out.println("나는 "+ user + "컴퓨터는 " + com);
				int result = usernum - comnum;
				if (result == 0) {
					draw++; 
				} else if(result == 1 || result == -2) {
					win++; 
				} else {
					lose++; 
				}
			} else {
				System.out.println("최종 전적: " + win + "승 " + draw + "무 " + lose +"패");
				break;
			}
		}
		
		
		sc.close();
		
	}

}
