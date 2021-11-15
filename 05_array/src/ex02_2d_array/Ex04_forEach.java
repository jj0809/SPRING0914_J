package ex02_2d_array;

public class Ex04_forEach {

	public static void main(String[] args) {
		/*
		 * 2차원 배열은 1차원 배열을 모은 것이다.
		 * 
		 * 2차원 배열의 각 행을 1차원 배열로 생각한다.
		 * 
		 * int[][] a = new int[3][2];
		 * a[0] : 1차원 배열 a[0] = new int[2];
		 * a[1] : 1차원 배열
		 * a[2] : 1차원 배열
		 */
		
		//1차원 배열의 향상 for문(forEach)
		int[] a = new int[3];
		for (int n : a) {
			System.out.println(n);
		}
		//a배열의 모든 요소를 변수 n으로 한 번에 하나씩 넘겨서 사용한다..... 
		System.out.println("--------------------");
		
		//2차원 배열의 향상 for문(forEach) - 자주 사용하지는 않음~
		int[][] b = new int[3][2];
		//2개짜리 요소로 이루어진 배열 3개로 1차 나눔 int[] arr: b
		for (int[] arr : b) {
			//arr에는 b[0], b[1], b[2] 저장되어 있음
			//배열 당 모든 요소를 변수 n으로 한 번에 하나씩 넘겨서 사용 int n: arr
			for (int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
	} //end

}
