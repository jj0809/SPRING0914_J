package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
	
		/*
		 * 문제. 10000원 모두 쓰기
		 * 사용할 금액을 입력 받아서 10000원에서 공제
		 * 현재 10000원 있습니다.
		 * 결제금액 >>>> 5000원
		 * 현재 5000원 있습니다.
		 * 결제금액 >>>> 10000원
		 * 5000원이 부족합니다.
		 * 현재 5000원 있습니다.
		 * 결제금액 >>>> 5000원
		 * 현재 0원 있습니다. 종료
		 * 
		 * 
		 * 
		 * ★나중에 평가문제로 나올 예정
		 * >>대신 결제금액에 난수 생성★
		 * 
		 * 
		 */
		
		int money = 10000; 
		Scanner sc = new Scanner(System.in);
		
		/*// 내 코드
		int count=0;
		do {
			System.out.println("현재 "+ money +"원 있습니다.");
			System.out.print("결제금액 >>> ");
			int pay = sc.nextInt();
			if (money < pay) {
				System.out.println((pay - money) + "원이 부족합니다.\n");
				continue;
			} else if (money <= 0 ) {
				System.out.println("0 이하의 돈은 사용할 수 없음");
			}
			money -= pay;
			count++;
		} while (money != 0);
		System.out.println(count + "번 만에 현재 잔액 " + money + "원 있습니다.");
		*/
		while (true) {
			System.out.println("현재 "+ money +"원 있음");
			if (money == 0) {
				break;
			}
			System.out.print("결제금액 >>> ");
			int pay = sc.nextInt();
			if (pay <= 0) {
				System.out.println("0 이하의 돈은 사용할 수 없음");
				continue;
			}else if (pay > money) {
				System.out.println((pay - money) + "원이 부족합니다.\n");
				continue;
			} else {
				money -= pay;
			}
		}
		
		sc.close();
		
	} //

}//
