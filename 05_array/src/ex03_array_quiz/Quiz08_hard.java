package ex03_array_quiz;

public class Quiz08_hard {

	public static void main(String[] args) {
		/*
		 * 문제. 0 - 9 사이 정수인 난수를 100개 생성하고,
		 * 각 숫자들의 생성 횟수(빈도수, 0이 몇 번 나왔다)를 그래프화 하여 출력하시오 
		 * 
		 * 실행 예)
		 * 0: ##### 5
		 * 1: ########## 10
		 * 2: ### 3
		 *...
		 * 9: #### 4
		 */
		
		/*
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //new int[10];
		String[] arr2 = new String[10]; //초기화가 null로 되어있다고 한다.. {"",""...,""}; 로 바꾸면 null 이 나타나지 않음
		for (int i = 0; i < 100; i++) {
			int a = (int)(Math.random()*10);
			if (arr[a] == a) {
			arr2[a] += "#";
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i + ": " + arr2[i]);
		}
		이 방법은 #의 개수를 셀 수가 없음.......... 
		*/ //null 이 왜 나오지...?
		
		/* 설명
		1. a 배열
		 {5, 3, 6, 6, ....,0} 
		a[0] = 5, a[1] = 3 ... a[99] = 0;
		=> 인덱스를 100번 생성함
		a[0] ~ a[99] : 0 ~ 9
		
		2. 10개 요소를 가지는 counter 배열
		{7, 5, 10, .... 13}
		counter[0]: 7 (0이 7개)
		counter[1]: 5 (1이 5개)
		...
		counter[9]: 13 (9가 13개)
		생성된 인덱스를 같은 것 끼리 정리하기
		 */
		int[] a = new int[100];
		int[] counter = new int[10];
		//100개 랜덤 생성, 인덱스 역할
		//counter 배열의 인덱스 a[i] 요소를 증가
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10); //a[i]는 0 에서부터 9 까지의 결과만 있음, 개수는 100개
			counter[a[i]]++; //counter[a[i]] 의 자리에 1 증가
		}
		
		//출력
		for (int i = 0; i < counter.length; i++) {
			String graph = "";
			// counter[i] 만큼 # 이어붙이기 반복
			for (int j = 0; j < counter[i]; j++) {
				graph += "#";
			}
			System.out.println(i+ ": " + graph + " " + counter[i]);
		}
		
		//만약 배열을 하나 없앤다면 a배열을 없앨 수 있음
		//a 배열의 역할은 그저 보기 편하게 랜덤 생성된 숫자를 저장해둔 용도
		/*
		 * for (int i = 0; i <100; i++){
		 * 	counter[(int)(Math.random()*10]++;
		 * } 
		 * 이렇게 바꿔도 된다.... 
		 */
	}//end

}
