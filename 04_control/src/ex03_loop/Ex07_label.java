package ex03_loop;

public class Ex07_label {

	public static void main(String[] args) {
		/*
		 * label
		 * 1)특정 소스코드의 위치를 지정해 주는 방법
		 * 2)사용법
		 * 		라벨명:
		 * 
		 * 
		 * 
		 * c언어에서 goto : 어디로 보내는 용도 - label의 시초....
		 * 
		 */

		//outer loop 에 outer라는 라벨 달고 사용하기
		//Quiz09 내용

		outer: //outer 라벨
		for (int dan = 2; dan <=9; dan++) {
			
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "x" + num +"=" + (dan*num));
				if (dan ==4 && num == 4) {
					break outer; //outer라벨을 종료한다
				}

			}
		}
		
		
		
		
		
		
	}

}
