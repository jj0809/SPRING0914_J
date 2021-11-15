package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * 문제. 평점 (1 - 5)을 3번 입력받음
		 * 1 - 5 사이 입력이 아닐 경우 다시 입력받음
		 * 실행 예시)
		 * 1번째 평점 입력 >>> 0 // 잘못된 값 무시
		 * 1번째 평점 입력 >>> 10
		 * 1번째 평점 입력 >>> 3
		 * 2번째 평점 입력 >>>  
		 * 
		 * 3번 입력받는 아우터 루프
		 * 입력을 여러번 받을 수 있는 이너 루프 존재
		 *  ㄴ 횟수가 정해져 있지 않으므로  while 혹은 do while로 작성
		 *  ㄴ do while이 좀 더 좋을 것...
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/* 내가 작성한 코드
		for (int a = 0; a < 3; a++) {
			System.out.print((a+1) + "번째 평점 입력 >>> ");
			int grade = sc.nextInt();
			while (grade <1 || grade >5) {
				System.out.print((a+1) + "번째 평점 입력 >>> ");
				grade = sc.nextInt();
			}
			
		}
		*/
		
		for (int a = 0; a < 3; a++) {
			int grade;
			do {
				System.out.print((a+1) + "번째 평점 입력 >>> ");
				grade = sc.nextInt();
			} while (grade < 1 || grade > 5);
		}
		
		
		sc.close();
		
		

	}

}
