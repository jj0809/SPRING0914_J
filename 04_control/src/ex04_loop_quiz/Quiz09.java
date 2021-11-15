package ex04_loop_quiz;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		
	
	
	/*
	 *문제. 구구단의 일부만 출력하시오
	 *2x-2 = 2
	 *
	 * 4x 4 =16 
	 * 
	 */
	
	for (int dan = 2; dan <= 9; dan++) {
		int num;
		
		for (num = 1; num <= 9; num++){
			System.out.println(dan + "x" + num + "=" + (dan*num));
			if (dan == 4 && num == 4) {
			break; //if의 안 쪽에 있으므로 inner loop의 종료만 이루어진다.
			}
		}
		if (dan == 4 && num ==4) { //만약에 이게 없으면 4단만 4까지 곱하고 나머지는 다 나오게 됨!
			break;
		}
	}
	


		
	
	
	
	}

}
