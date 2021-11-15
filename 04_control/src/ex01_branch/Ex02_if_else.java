package ex01_branch;

public class Ex02_if_else {

	public static void main(String[] args) {
		
		/*
		 * if-else문 (≒삼항연산자)
		 * 1. 조건식의 결과가 true일 때와 false일 때 코드 작성
		 * 2. 형식
		 *    if (조건식) {
		 *        실행문 1;
		 *    } else {
		 *    		실행문 2;
		 *    }
		 *
		 */

		int genderNum = 1;
		if (genderNum % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
		//안 좋은 코드의 예
		if (genderNum % 2 == 0) {
			System.out.println("여자");
		} 
		if (genderNum % 2 == 1) {
			System.out.println("남자");
		}
		//JVM이 if-else문은 조건식을 한 번만 처리하는데 
		//예문의 경우 조건식 처리를 두 번 해야하기 때문
		
	}

}
