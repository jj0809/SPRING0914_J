package ex04_loop_quiz;

public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 문제. 369게임
		 * 1 ~ 99 사이 369 게임 결과 출력하기
		 * 1	2	짝		4	5	짝		7	8	짝		10
		 * 11 	12	짝		14	15	짝		17	18	짝		20
		 * ...
		 * 짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝(99)
		 */
		

		/*
		int num; int n;
		for (num = 1; num < 100; num++) {
		switch ((num/10)) {
		case 3: case 6: case 9 :System.out.print("짝짝\t"); break;

		}
		switch (num%10) {
		case 3: case 6: case 9: System.out.print("짝\t"); break;
			}
			
		}  모르겟음 망했음
		*/ 
		//조건문은 true false를 중심으로 움직이니까 불린을 쓰자....!!!
		
		//String은 null로 시작, 변수는 0으로 시작..... boolean은 false
		// 0은 false, 1은 true를 의미함
		boolean condition1 = false; //1의 자리가 3, 6, 9 일 때 true
		boolean condition2 = false; //10의 자리가 3, 6, 9 일 떄 true
		
		// 1 ~ 99
		for (int n = 1; n <100; n++) {
			
			//1의 자리와 10의 자리 분리
			int units = n % 10;
			int tens = n / 10;
			
			//condition1 = units == 3 || units == 6 || units ==9;
			condition1 = units % 3 == 0 && units != 0; 
			//0은 안되고 3으로 나눴을 때 값이 0이면 condition1이 true가 됨
			
			//condition2 = tens == 3 || tens == 6 || tens ==9;
			condition2 = tens % 3 == 0 && tens != 0; 
		
			//출력
			if (condition1 && condition2) { // 둘 다 true일 때
				System.out.print("짝짝\t");
				
			}else if (condition1 || condition2) { //둘 중 하나 true일 때
				System.out.print("짝\t");
			}else { // 둘 다 false 일 때
				System.out.print(n + "\t");
			}
			
			//줄바꿈
			//n이 10의 배수 일때 줄바꿈을 넣어줌
			if(n % 10 == 0) { //n이 10의 배수일 때
				System.out.println();
			}
			
			
		}// for문
		
		
		
	}//main꺼

}//클래스꺼
