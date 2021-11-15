package ex01_branch;

import java.util.Random;

public class Ex03_if_elseif {

	public static void main(String[] args) {
		
		/*
		 * if-else if문
		 * 1. 조건식이 다수 존재할 때 사용
		 * 2. 형식
		 *    if (조건식 1) {
		 *    	  실행문 1;
		 *    } else if (조건식 2) {
		 *    	  실행문 2;
		 *    } else if (조건식 3) {
		 *    	  실행문 3;
		 *    } ...
		 * 
		 */
		
		int a = (new Random()).nextInt(); //정수 범위에서 랜덤으로 1개
		
		if (a > 0) {
			System.out.println(a + "는 양수이다");
		} else if(a == 0) {
			System.out.println("0이다");
		} else if (a < 0) { //양수와 0을 뺀 나머지는 음수이므로 조건식이 굳이 안들어가도 됨,, 효율적인 코드 아니다
			System.out.println(a + "는 음수이다");
		}
		
		/*
		 * if - else if - else 문을 모두 활용하는 것이 효율적인 코드로 가는 지름길
		 * 
		 */

		//이상적인 코드
		
		if (a > 0) {
			System.out.println(a + "는 양수이다");
		} else if(a == 0) {
			System.out.println("0이다");
		} else  { 
			System.out.println(a + "는 음수이다");
		}

	}

}
