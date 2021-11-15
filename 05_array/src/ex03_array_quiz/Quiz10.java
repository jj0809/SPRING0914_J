package ex03_array_quiz;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * 문제. 전체 구구단의 결과만
		 * 2차원 배열 a에 저장하고 출력하시오
		 * 
		 */
		
		
		int[][] a = new int[8][9];
		//int[9][8]로 바꾸면 i와 j를 바꿔서 계산하면 된다..... 
		
		for (int i = 0; i < a.length; i++) { //i는 단
			for (int j=0; j < a[i].length; j++) { //j는 숫자
				a[i][j]=(i + 2) * (j + 1);
				System.out.print(a[i][j] + "\t");
			}
		System.out.println();
		}

		
		
	}//end

}
