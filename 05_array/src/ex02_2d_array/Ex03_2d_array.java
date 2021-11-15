package ex02_2d_array;

public class Ex03_2d_array {

	public static void main(String[] args) {
		
		/*
		 * 가변형 2차원 배열
		 * 1. 가변형이란 각 행마다 열의 개수가 다른 2차원 배열을 의미한다
		 * 2. 선언 방법
		 *    int[][] a = new int[3][]; // 열개수 생략 :3행 n열
		 *    a[0] = new int[1]; // 0행에 1개 열
		 *    a[1] = new int[2]; // 1행 2열
		 *    a[2] = new int[3]; // 2행 3열
		 * 
		 *  
		 *  가변형 2차원 배열의 초기화 1차원 배열 초기화랑 동일함..
		 */

		//가변형 2차원 배열의 선언
		int[][] a = new int[3][];
		
		a[0] = new int[1];
		a[1] = new int[2];
		a[2] = new int[3];
		
		//출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
		System.out.println();
		}
		
		
		
	}// end

}
