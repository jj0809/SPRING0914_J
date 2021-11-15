package ex03_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		/*
		 * for 문
		 * 1. 반복되는 값의 범위가 명확할 때 사용
		 * 2. 주로 배열에서 사용됨
		 * 3. 형식
		 *    for ( 초기값 ; 조건식 ; 증감문 ) { //"초기값; 조건식;"에 "시작; 종료;"를 잡아주는 것이 일반적
		 *    		반복 실행문;
		 *    }
		 *    순서: 초기값 - 조건식 - 반복실행문 - 증감문 - 조건식 ~ 반복
		 *    
		 *    
		 *    
		 *    
		 */

		//1. 1 ~ 3 //반복되는 수가 정해진 경우 for문이 최선이다
		for (int a = 1; a <= 3; a++) {
			System.out.println(a);
		}
		
		//while 문 작성했던 내용과 동일함
		
		//2. 3 ~ 1 출력
		for (int a = 3; a >= 1; a--) {
			System.out.println(a);
		} // int a 는 이번 for 문 안에서만 작동함..
		/*
		 * 변수는 변수가 선언된 위치에서만 사용할 수 있음
		 * 변수의 스코프/변수의 사용 범위
		 * 
		 * 위치의 기준: { }: 같은 중괄호 내에 동일한 명의 변수 있을 수 없다.
		 * { int a; {int a;}  } : 불가
		 * 
		 */
		
		//3. 반복 횟수 정하기 - 이 구조만 연습하자
		int count = 3; //반복 횟수 기준
		for (int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
		
		
		
		
	}

}
