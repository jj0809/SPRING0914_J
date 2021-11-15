package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		/*
		 * 문제. 임의의 양수를 입력받아 
		 * 짝수면 "짝수", 홀수면 "홀수", "3의 배수" 구분하여 출력
		 * 
		 * 
		 * 
		 * 순서를 잘 고려할 것: 6의 경우 짝수이면서 3의 배수
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 >>> ");
		int a = sc.nextInt();
		
		if (a%3 == 0) {
			System.out.println("3의 배수");
		} else if (a%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		sc.close();

	
	}

}
