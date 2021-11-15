package ex03_array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 * 문제. 길이가 5인 double 타입의 배열을 선언하고
		 * 5개의 키(실수값)를 입력받아서 배열에 저장하고 출력하기
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		/* 내꺼
		double[] a = new double[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("실수 값을 입력하시오 >>> ");
			a[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]의 값: "+ a[i]);
		}
	*/
	
		double[] a = new double [5];
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + "번째 키 입력 >>> ");
			a[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println((i +1) + "번째 키는 "+ a[i] + "cm입니다");
		}
	
	
	sc.close();
	
	}

}
