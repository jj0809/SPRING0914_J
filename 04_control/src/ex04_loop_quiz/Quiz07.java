package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		/*
		 * 문제. 퀴즈 맞추기
		 * 대한민국의 수도는? >>> 서울, seoul
		 * 맞히면 "정답입니다" 틀리면 "오답입니다"
		 * 몇 번만에 맞았는지 출력하기
		 * 
		 */

		int count = 0; //0부터 시작하라고.... 
		Scanner sc = new Scanner(System.in);
		String answer;
		while (true) {
			System.out.print("대한민국의 수도는? >>> ");
			answer = sc.next();
			count++;   //여기에 카운트 넣으면 0부터 시작해야하고
			if (answer.equals("서울") || answer.equalsIgnoreCase("seoul")) {
				System.out.println("정답입니다");
				break;
			}System.out.println("오답입니다"); //else { syso(오답입니다)} 작성해도 된다
			
			//여기에 카운트 넣으면 카운트는 1부터 시작함...
		} 
		System.out.println(count + "번 만에 맞았다");
		
		
		
		sc.close();
		
	}

}
