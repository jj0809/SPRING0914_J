package ex04_loop_quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		/* 1. 세로로 출력하는 전체 구구단
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 9 x 9 = 81
		*/

		for (int dan = 2; dan <= 9; dan++) {
			for (int num = 1; num <= 9; num++)
			{System.out.println(dan + "x" + num + "=" + (dan*num));
			}
			System.out.println(); //아무것도 안 넣으면 그냥 엔터 처리됨
		}
		
		System.out.println("=================");
		
		/*
		 * 2. 가로로 출력하는 전체 구구단
		 * 2 x 1 = 2    3 x 1 = 3    ... 9 x 1 = 9
		 * 2 x 2 = 4    3 x 2 = 6    ... 9 x 2 = 18
		 * ...
		 * 2 x 9 = 18   3 x 9 = 27   ... 9 x 9 = 81
		 * 
		 */
		
		for (int num = 1; num <= 9; num++) {
			for(int dan = 2; dan <=9; dan++) {
				System.out.print(dan + "x" + num + "=" + (dan*num)+"\t");
			}
			System.out.println();
		}
		
		
	}

}
