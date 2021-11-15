package ex01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//catch는 여러개 깔아도 된답니다!
/*
 * try {
 * 	코드작성
 * }catch (예외처리 매개변수){
 * 	매개변수
 * }catch (예외처리 매개변수){
 * 	매개변수
 * }catch (예외처리 매개변수){
 * 	매개변수
 * } 
 * 
 * => 가능하다! multi catch!
 * try에서 예외를 던졌을 때 순서대로 위에서부터 처리 시도.
 * 
 * 예외의 세분화라고 볼 수 있을 듯..
 * 
 * */

public class Ex03_multi_catch {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("첫 번째 정수 >>> ");
			int a = sc.nextInt();
			System.out.println("두 번째 정수 >>> ");
			int b = sc.nextInt();
			System.out.println(a + "+" + b + "=" + (a + b));
			System.out.println(a + "-" + b + "=" + (a - b));
			System.out.println(a + "*" + b + "=" + (a * b));
			System.out.println(a + "/" + b + "=" + (a / b));
			sc.close();
		}catch(InputMismatchException ie) { // int 말고 딴거 입력했을 때 나는 오류
			System.out.println("정수만 입력할 수 있습니다.");
		}catch(ArithmeticException ae) { // 2/0 같은 게 나올 때
			System.out.println("수행할 수 없는 연산입니다.");
		}catch(Exception e){ //try 안에서 문제가 발생하면 다 Exception이 잡아(catch)줌
			System.out.println("문제가 발생하였습니다. 다시 시도하세요");
			}
		
		//개발단계에서는 이렇게 나누기 전에 문제들을 해결해야함.
		
	}//main

}
