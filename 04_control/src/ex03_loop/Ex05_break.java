package ex03_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {

		/*
		 * break 문
		 * switch문이나 loop문(while, do-while, for)를 종료함
		 * 
		 * 
		 * 무한 루프 ( infinite loop) 방법
		 * 1. while (true) {  } 
		 * 2. for ( ; ; ) {   } //세미콜론 사이 내용을 비움
		 * => 끄고 싶을 때 break를 건다
		 * 
		 */
		
		//1. 1 에서 10 사이 출력
		int a = 1;
		while (true) {
			System.out.println(a);
			if (a == 10) {
				break;
			}
		a++;
		}
		//모든 loop 문을 무한루프-break; 를 사용해 만들 수 있음

		
		//2. 0이 입력될 때 까지 계속 입력받으시오
		Scanner sc =new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("숫자를 입력하세요 >>> ");
			num = sc.nextInt();
			if(num == 0) {
				break;
			}System.out.println();
		}
		//do-while보다 코드는 길지만 이해하기 더 쉽다
		
		
		//3. 1부터 모든 정수의 합을 구하시오
		//합계가 3000이상이면 멈추고 어디까지 더한 결과가 3000이상인지 출력
		int n = 1;
		int total = 0;
		while (true) {
			total += n;
			if (total >=3000) {
				break;
			
			}
			n++;	
			
		}
		System.out.println("1부터 "+ n + "까지 더한 결과는 " + total + "이다");
		
		sc.close();
	}

}
