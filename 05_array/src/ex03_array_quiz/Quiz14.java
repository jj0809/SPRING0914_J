package ex03_array_quiz;


public class Quiz14 {
	public static void main(String[] args) {
		/*
		 * 
		 * 문제. 빙고
		 * 5 * 5 빙고판
		 * 1. 1 ~ 25 사이 정수를 2차원 배열 bingo에 순차적으로 저장
		 * 2. 섞는다...
		 *    1) 총 25번의 교환이 발생된다.
		 *    2) bingo[0][0] <-> 랜덤
		 *       bingo[0][1] <-> 랜덤		 
		 *       .....
		 *       bingo[4][4] <-> 랜덤
		 *       
 		 */
		/* 고친 결과.... 
		int[][] bingo = new int[5][5];
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j <bingo.length; j++) {
				bingo[i][j] = (i*bingo.length)+(j+1);
				}
			}
		
		int temp;
		
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j <bingo[i].length; j++) {
				int n = (int)(Math.random()*5);
				int c = (int)(Math.random()*5);
				temp = bingo[i][j];
				bingo[i][j] = bingo[n][c];
				bingo[n][c] = temp;
			}
		}
		
		for (int i = 0; i < bingo.length; i++){
			for (int j = 0; j < bingo.length; j++) {
				System.out.print(bingo[i][j] + "  ");
			}
			System.out.println();
		}
		*/
		
		final int SIZE = 5; //상수, 상수는 대문자
		int[][] bingo = new int[SIZE][SIZE];
		
		//1. 1 ~ 25 순차적으로 채우기
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = (i*SIZE)+(j+1);
			}
		}
		
	
//		for (int[] a : bingo) {
			//1차원 배열 출력해주는 클래스
//			System.out.println(Arrays.toString(a));
//		}

		//2. 교환하기... 일방적인 값이 아니라 교환을 해야한다...
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				int x = (int)(Math.random() * SIZE);
				int y = (int)(Math.random() * SIZE);
				//bingo[i][j]와 bingo[x][y]의 교환
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		for (int i = 0; i < bingo.length; i++){
			for (int j = 0; j < bingo.length; j++) {
				System.out.print(bingo[i][j] + "  ");
			}
			System.out.println();
		}

	}//end

}
