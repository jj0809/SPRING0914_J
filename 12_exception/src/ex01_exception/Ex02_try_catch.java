package ex01_exception;

import java.util.Scanner;

/*
 * try {
 * 	코드작성
 * }catch (예외처리 매개변수){
 * 	매개변수
 * }
 * 
 * 
 * 예외 클래스(Exception class)
 * 1. 모든 Exception을 처리할 수 있는 클래스
 * 2. RuntimeException, IOException 등 많은 클래스가 있다.
 * 3. 모든 예외는 'Exception 클래스'를 상속한다.
 */

public class Ex02_try_catch{
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
		}catch(Exception e){ //try 안에서 문제가 발생하면 다 Exception이 잡아(catch)줌
			System.out.println("문제가 발생하였습니다. 다시 시도하세요");
			//무슨 예외가 생기든 다 위에 메시지 뜨고 종료됨
		}
		//나중에 Exception 종류에 대해서 세부적으로 메시지, 동작을 지정할 수 있음.
		//지금 Exception은 모든 Exception... 막상 개발을 할 때는 이렇게 작성하지 않음(문제 확인이 필요하기 때문!)
		//try catch를 하지 않으면 문제가 생기는 경우도 있음..! "네가 짠 코드는 문제가 있으니 try-catch로 묶어라.."

}


}

