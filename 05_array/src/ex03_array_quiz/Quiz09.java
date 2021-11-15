package ex03_array_quiz;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		/*
		 * 문제. 2행 3열의 정수(int) 타입 2차원 배열을 선언하고,
		 * 값을 입력받아 저장한 뒤 출력하시오
		 * 실행 예:
		 * 1행 1열의 값 입력 >>>>1
		 * 1행 2열의 값 입력 >>>2
		 * ..
		 * ..
		 * 2행 3열의 값 입력 >>>7
		 * 1   2   3  
		 * 1   5   6
		 */
		
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				System.out.print((i+1) + "행 "+ (j+1) + "열의 값 입력 >>> " );
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(); //줄바꿈
		}
		
		sc.close();
	} //end

}
