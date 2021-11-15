package ex03_array_quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 문제. 식당 대기표
		 * 5팀 예약
		 * 실행 예)
		 * 1번 손님 좌석 예약 >>> 3명
		 * 2번 손님 좌석 예약 >>> 4명
		 * 3번 손님 좌석 예약 >>> 2명
		 * 4번 손님 좌석 예약 >>> 4명
		 * 5번 손님 좌석 예약 >>> 1명
		 * 
		 * 예약 현황
		 * 1번: 0 0 0 
		 * 2번: 0 0 0 0 
		 * 3번: 0 0 
		 * 4번: 0 0 0 0 
		 * 5번: 0
		 */
		
		int[][] a = new int[5][];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print((i+1) + "번 손님 좌석 예약 >>> ");
			a[i] = new int[sc.nextInt()]; 
			
			/*샘:  int seats = sc.nextInt();
			 *     a[i] = new int[seats]; 로 코드 작성  */
		}
		
		System.out.println("예약 현황");
		for (int i = 0; i < a.length; i++) {
			System.out.print((i+1) + "번: ");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] +"  ");
			}
		System.out.println();
		}
		
		sc.close();
		
	}//end

}
