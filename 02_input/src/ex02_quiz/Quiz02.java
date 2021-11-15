package ex02_quiz;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		//문제. 두 개의 실수를 입력 받아 두 실수의 값을 교환하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 a 입력 >>> ");
		double a = sc.nextDouble();
		
		System.out.print("실수 b 입력 >>> ");
		double b = sc.nextDouble();
		
		double temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("교환 결과\na: "  + a + " b: " + b );
		
		sc.close();
	
	}
}
