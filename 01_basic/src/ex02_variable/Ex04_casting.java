package ex02_variable;

public class Ex04_casting {

	public static void main(String[] args) {
		
		/*
		 * 타입 변환 = 형 변환 = casting
		 * (int를 double로, double을 int로..)
		 * 1. 자동 타입 변환 
		 *    1) java가 스스로 타입을 변환
		 *    2) 작은 크기 - > 큰 크기로 변경할 때 주로 일어남
		 *    3) 정수와 실수의 연산 -> 자동 타입 변환(정수->실수) 후 연산
		 *
		 * 2. 강제 타입 변환 - 일시적 형 변환
		 *    1) 개발자가 직접 타입을 바꿔주는 작업 (자주 사용)
		 *    2) 크기 상관 없이 무조건 변환
		 *       ex) 1/2 = 0으로 나옴... 4바이트+4바이트 = 4바이트 -> 강제타입변환 필요
		 *           1이나 2를 1.0 or 2.0으로 바꿔준다(개발자) -> 실수로 자동타입변환(컴)
		 *    3) 사용 방법
		 *       (변경할 타입)변수
		 */

		System.out.println(1+1.5); //1의 3) 1 -> 1.0 변환
		int a = 1;
		int b = 2;
		System.out.println(a / b); //0으로 나옴, 둘 중 하나를 강제로 실수형 변환
		System.out.println((double)a / b ); //a를 double로 강제 변환(casting)
		
		//a는 casting 당시에만 잠시 형변환, 언제나 int로 남아있음
		
	}

}
