package testPackage;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 돈을 받아서 오만원권, 만원권
		 * 오천원권, 천원건, 오백원 동전, 백원 동전, 오십원 동전
		 * 십원 동전, 오원 동전, 일원 동전이 각각 몇개로 변환되는지
		 * 출력하시오
		 * 이 때 반드시 다음과 같은 배열을 사용하여 반복문으로 처리하시오
		 */
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		System.out.print("금액을 입력하시오 >>> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			System.out.println(unit[i] + "원 짜리: " + (money / unit[i]) +"개");
			money -= (money / unit[i]) * unit[i];
			
			
			sc.close();
		}
	}

}
