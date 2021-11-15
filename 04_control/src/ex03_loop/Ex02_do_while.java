package ex03_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		/*
		 * do - while 문
		   1. 본문을 반드시 한 번은 실행하는 while 문
		   2. 형식
		      do {
		      		반복 실행문;
		      } while (조건식);
		      
		      
		      일단 반복을 실행하고 조건식을 거쳐서 false면 또 반복....
		      
		 
		 Ex01_while 파일의 4번 예제는 do while에 더 잘 맞는다.
		0일 때 종료하고 그동안 적은 값 다 더하는 것....
		 */
		
		int n = 0; //아까 Ex01_while에서는 표현식에서 걸려서 9999로 바꿨음
		int total = 0;
		Scanner sc = new Scanner(System.in);
		do { //일단 실행되므로 n의 초기값이 0이어도 상관없다!
			System.out.print("더할 값을 입력하세요 >>> ");
			n = sc.nextInt();
			total += n;
		} while (n!=0);
		
		System.out.println("합계: "+ total);
		sc.close();
	}

}
