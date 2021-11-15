package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		//문제. 입력받은 구구단만 출력하기
		//2 ~ 9 사이 정수를 입력 받아 해당 구구단만 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 사이 정수를 입력하시오 >>> ");
		int num = sc.nextInt();
		
		int count = 9;
		System.out.println(num + "단");
		for (int a = 1; a <= count; a++) {
			System.out.print(num*a + " ");
//디테일	System.out.println(num + " x " + a +" = " + num*a);
		}
		
		
		
		sc.close();
		
		
	}

}
