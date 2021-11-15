package ex02_2d_array;

public class Ex02_2d_array {

	public static void main(String[] args) {
		/*
		 * 2차원 배열의 초기화
		 * 
		 * int[][] a = { {1, 2}, {3, 4}, {5, 6} };
		 * 
		 * 1   2
		 * 3   4
		 * 5   6
		 * 배열 완성 a[3][2]
		 * 다른 방법 있지만 이 방법만 알면 된다
		 */
		
		int[][] a = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
		//츨력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	} //end

}
