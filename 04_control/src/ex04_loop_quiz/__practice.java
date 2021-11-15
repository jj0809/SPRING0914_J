package ex04_loop_quiz;

public class __practice {
	public static void main(String[] args) {
		/*
		 * 문제. 369게임
		 * 1 ~ 99 사이 369 게임 결과 출력하기
		 * 1	2	짝		4	5	짝		7	8	짝		10
		 * 11 	12	짝		14	15	짝		17	18	짝		20
		 * ...
		 * 짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝(99)
		 */
		
		boolean condition1 = false; //1의 자리가 3, 6, 9 일 때 true
		boolean condition2 = false; //10의 자리가 3, 6, 9 일 떄 true
		
		
		for (int n = 1; n < 100; n++) {
			
			int units = n % 10;
			int tens = n / 10;
			
			//switch ()
		
			
		}
	}

}
