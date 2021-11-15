package ex01_exception;
import java.util.Scanner;

/*고전 예외처리 방법의 단점
 *1. 개발자의 역량에 기대는 경우가 많음
 *	개발자가 이미 문제점을 예상하고 있어야만 처리 가능 
 *2. 예상 못한 문제점에 대한 대비책이 전무함...
 * 
 */


public class Ex01_legacy_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 >>> ");
		int a = sc.nextInt();
		System.out.println("두 번째 정수 >>> ");
		int b = sc.nextInt();
		
		if(b==0) { //여태까지 우리가 실행하는 예외처리, 고전 예외처리 방법!!
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println(a + "+" + b + "=" + (a + b));
			System.out.println(a + "-" + b + "=" + (a - b));
			System.out.println(a + "*" + b + "=" + (a * b));
			System.out.println(a + "/" + b + "=" + (a / b));
		}
		
		sc.close();
	}

}
