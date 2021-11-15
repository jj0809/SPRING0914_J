package ex03_array_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		/*
		 * ★★★★★★★ 다시 연습할 것 ★★★★★★★
		 * 문제. 5000원 짜리 로또
		 * 1에서 45사이 숫자 6개를 1줄에 입력 총 5줄
		 * 
		 * 
		 */
		/*
		int[][] lotto = new int[5][6];


		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				
				int x = (int)(Math.random() * 45) + 1;
				lotto[i][j] = x;
				//중복을 어떻게 없애지..
					
				}
		}
		
			
		
		Arrays.sort(lotto);

		for (int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "  ");
			}
			System.out.println();
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("얼마? >>> ");
		int money = sc.nextInt();
		
		int[][] lotto = new int[money/1000][6];
		
		for (int i = 0; i < lotto.length; i++) {
			int ballCount = 45; //45개 숫자 중 랜덤하게 빼서 lotto[i][j]에 저장
			int[] ball = new int[ballCount];
			for (int j = 0; j < ball.length; j++) { //1 ~ 45 순차적으로 생성
				ball[j] = j + 1;
			}
		//ball 배열에서 랜덤하게 6개를 lotto[i][j]로 보내기
		for (int j = 0; j < lotto[i].length; j++) {
			int rnd = (int)(Math.random()*ballCount); //ball 배열의 인덱스(0 ~ ballCount-1)
			/*
			 * lotto[i][j]=ball[rnd] ball 배열에서 rnd번에 있는 수를 lotto[i][j]에 넣는다.
			 * lastidx = 44-j; 변수 생성... 배열 ball의 마지막 넘버
			 * ball[rnd] = ball[lastidx]; 위에 넣은 ball[rnd] 값을 ball의 마지막 숫자로 바꾸고,
			 * ballCount--; 마지막 숫자를 전체 범위에서 지운다. 배열 ball은 0부터 ballCount-1 까지 이기 때문..
			 */
			lotto[i][j] = ball[rnd];
			int lastIdx = 44-j;
			if (rnd != lastIdx) { //맨 마지막 숫자가 나오면 의미가 없으므로...? 
				ball[rnd] = ball[lastIdx]; //교환을 해도 괜찮을 것 같음..! => 변수를 하나 더만들어야하니까 오히려 효율적이지 못함?
			}
			ballCount--; //배열 ball은 0부터 ballCount-1 까지 이기 때문.. 마지막 숫자를 범위에서 제거한다...
		}
			//중복된 데이터가 알아서 들어오지 못하게 하는 동작이 있다... 나중 코드...
		}
		
		//출력 향상 for 문 이용
		for (int[] line : lotto) { //lotto 의 행 : line의 개수 만큼 반복
			//line 오름차순 정렬
			Arrays.sort(line);
			for (int n : line ) { //한 line에 있는 열 : n의 개수 만큼 반복
				System.out.print(n + "\t"); //한 line에 있는 열 n을 출력
			}
			System.out.println();
		}
		
		sc.close();
		
	}//end

}