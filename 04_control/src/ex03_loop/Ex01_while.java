package ex03_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		/*
		 * while문 - 반복문
		 * 1. 조건식의 결과가 true이면 반복되는 제어문/false 일 때 멈춤
		 * 2. 형식
		 *    while (조건식) {
		 *    		반복 실행문;
		 *    }
		 * 
		 */

		//1. 1 ~ 3 출력하기
		int a = 1;
		while (a <= 3) {
			System.out.println(a);
			a++;
		}
		// 변수 a	조건식 a <= 3	 조건식의 결과 		실행문
		// 1 		1 <=3 	 			t				o syso(1)
		// 2 		2 <=3 				t 				o syso(2)
		// 3 		3 <=3 				t 				o syso(3)
		// 4		4 <=3				f				x 종료
		
		System.out.println("========2번========");
		//2. 3 ~ 1 출력하기
		int b = 3;
		while (b >=1) {
			System.out.println(b);
			b--;
		}
		
		
		// 3. 'A' ~ 'Z' 출력하기 'A'= 65
		// char 타입의 변수는 내부적으로 정수로 처리가 된다
		// char 타입의 변수도 ++ 연산이 가능하다
		char c = 'A';
		while (c <= 'Z') {
			System.out.print(c + " ");
			c++;
		}
		System.out.println("\n");
		
		//4. 사용자가 0을 입력할 때 까지 계속 입력받아서 합계를 구하시오
		// 사용자가 입력하는 값: n 
		// 합계 : total
		Scanner sc = new Scanner(System.in);
		int n=9999; //현재 n에 무엇이 들어있는지 모르지만 빈방은 아니다. 값이 들어오면 덮어쓰기함
		//의도적으로 0이 아닌 값: 최초 while문 진입 가능
		int total=0; //얼마를 넣어도 얼마나 합계가 먹여지는지 알 수 없음.
		//편의를 위해 초기화를 0으로 두고 시작하는 점이 있음
		
	//	System.out.print("더할 값을 입력하시오 >>> ");
		//n = sc.nextInt();
		while (n!=0) { //입력이 0이 아니면 더해주겠다
			System.out.print("더할 값을 입력하시오 >>> ");
			n = sc.nextInt();
			total += n; //total에 n 더한 값 정의 
		}// 만약 반복될 경우 값을 또 입력해야함;;
		
		System.out.println(("합계: "+ total));
		sc.close();
		
	}

}
