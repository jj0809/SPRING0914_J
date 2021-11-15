package ex02_2d_array;

public class Ex01_2d_array {

	public static void main(String[] args) {
		/*
		 * 고정형 2차원 배열
		 * 1. 2차원 배열은 "테이블(표)" 형태로 이해할 수 있음
		 * 2. 고정형이란 행과 열이 고정된 2차원 배열을 의미함. 가로 세로 일정
		 * 3. 선언 방법
		 *    int[][] a = new int[3][2];  //[]붙일 수록 다차원이지만 거의 사용하지 않음
		 *    					//3행 2열의 테이블 형태
		 *    일반적으로 a[i][j]로 칭함
		 */
		
		//2차원 배열 선언
		int[][] a = new int [3][2]; //자동으로 0으로 초기화(일반변수와 다름)
		
		
		// 2차원 배열의 접근(순회) 방식은 "행 우선(row major)"이다
		// 행 인덱스: i,
		// 열 인덱스: j (국제 표준)
		// 행 순회
			//열 순회
		
		for(int i = 0; i < a.length; i++) { //a.length: 행의 갯수
			for (int j = 0; j < a[i].length; j++) { //a[i].length: 열의 갯수
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();//줄바꿈 용도
		} //2중 for 문으로 2차원 배워볼 수 있어.. Quiz09, Quiz10 확인
		
		
		
	}//end

}
