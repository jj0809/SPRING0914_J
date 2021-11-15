package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		 * 문제. 평점 입력 받아서 해당 평점만큼 ★ 출력하기
		 * 평점은 1~5 사이 정수로 입력받는데, 벗어난 범위는 다시 입력받기
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int grade;
		String stars = ""; //문자열 + 연산자로 연결되는 경우 "" 초기화를 한다.
		
		
		do {
			System.out.print("평점(1~5)을 입력하시오 >>> ");
			grade = sc.nextInt();
		} while (grade < 1 || grade > 5);
		
		
		//★ 입력 
		while (grade > 0) {
			stars += "★";   //그냥 syso("★") 해도 됨
			grade--; //평점 수만큼 별이 생김.......
		}
		
	
	
		System.out.print(stars);
		sc.close();
	
	}

}
