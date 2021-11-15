package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		//문자.  사용자로부터 문자열을 계속 입력받는다.(next 메소드)
//		"종료" 문자열을 입력하면 종료한다.
	//	몇 번 만에 종료되었는지 그 횟수를 마지막에 출력.
		
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("문자열을 입력하시오 >>> ");
		//String bb = null ; //str 자체가 없다는 의미와 비슷함
		String bb = "";  //str은 있는데 안에 내용물이 없다.
		
		int a = 0;
		while (!bb.equals("종료")){ //종료가 아니면 계속 입력받음..
			System.out.print("문자열을 입력하시오 >>> ");
			bb =sc.next();
			a++;
		}

		System.out.println("문자열 입력한 횟수 " + a);
		sc.close();
	}

}
