package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 * 문제. 퀴즈 정답 맞추기
		 * 질문: 대한민국의 수도는? >>> 서울, seoul
		 * 맞으면 정답입니다.
		 * 틀리면 오답입니다.
		 */

		Scanner sc = new Scanner(System.in);
		String str = null;
		do {
			if (str != null) { // 오답을 처리하기 위해서 if문 추가 ~~ 원래 break을 쓰면 쉽게 할 수 있다..
			System.out.println("오답입니다");
			}
			
			System.out.print("대한민국의 수도는? >>> ");
			str = sc.next();
		} while(!str.equals("서울") && !str.equalsIgnoreCase("seoul")); 
		
		
		
		System.out.println("정답입니다");
		
		
		sc.close();
	}

}
