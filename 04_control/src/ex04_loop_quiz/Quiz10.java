package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		/*
		 * 문제. UpDown 게임
		 * 
		 * 1 - 10000 사이의 난수를 발생시키고
		 * 해당 난수를 맞히는 게임
		 * 입력마다 "Up!", "Down" 출력
		 * 
		 * 난수: 4500
		 * 입력 >>>> 5000
		 * Down
		 * 입력 >>>> 1000
		 * UP
		 * ...
		 * 정답. 총 5번만에 성공
		 */
		
		Scanner sc = new Scanner(System.in);
		int rannum = (int)(Math.random()*10000)+1;
		int count=0; int num;
		
		/* 내코드
		outer:
		while (true) {
			System.out.print("입력 >>>> ");
			num = sc.nextInt();
			count++;
			if (num < rannum) {
				System.out.println("Up");
			} else if (num > rannum){
				System.out.println("Down");
			} else {
				 break outer;
			}
			
		}
		System.out.println("정답. 총 " + count + "번 만에 성공");
		*/

		//do-while로 풀 것이냐, while무한루프-break로 풀 것이냐
		do {
			//사용자 입력
			System.out.print("입력 >>>> ");
			num = sc.nextInt();
			//입력 횟수 증가
			count++;
			//잘못된 입력 체크
			if (num < 1 || num > 10000) {
				System.out.println("1 ~ 10000 사이의 숫자만 유효함");
				continue;
			}
			//비교하기
			if (num == rannum) {
				System.out.println("정답. 총 " + count + "번 만에 성공"); 
				break; //생략가능
			}else if (num > rannum) {
				System.out.println("Down");
			}else {
				System.out.println("Up");
			}
		}while (num != rannum); //못 맞췄을 때.. 계속 실행하는 조건
		//if의 break 가 필요하지 않은 이유로 여기 num != rannum 이 일치하지 않아 자동 종료되기 때문


		
		
		
		
		
		sc.close();
		
	}

}
