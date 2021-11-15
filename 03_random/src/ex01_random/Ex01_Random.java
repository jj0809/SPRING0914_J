package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		/*
		 * java.util.Random -> import 필요
		 * 
		 */

		//랜덤 정수 만들기
		Random rand = new Random();
		int rand1 = rand.nextInt();
		int rand2 = rand.nextInt(10); //bound값 = 10
		System.out.println("int 범위 중 하나: " + rand1); //±21억 범위
		System.out.println("10개 정수(0~9) 중 하나: " + rand2); //0부터 9까지 10개, 0고정
		
		//랜덤 실수 만들기
		double rand3 = rand.nextDouble();
		System.out.println("0 ~ 1 사이 실수 중 하나: " + rand3);
		

	}

}
