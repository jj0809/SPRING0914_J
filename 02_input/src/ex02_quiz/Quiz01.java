package ex02_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		//문제. 국어, 영어 점수를 사용자로부터 입력받아서 
		//평균을 출력하시오
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하시오 >>> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하시오 >>> ");
		int eng = sc.nextInt();
		
		//double ave = ((double)kor+eng)/2; //형변환은 캐스팅 필수!
		double ave = (kor+eng)/2.0; //형변환은 캐스팅 필수! 답이 소수점이고 싶을 때는 오른쪽에 소수 꼭 있어야함~!
		System.out.println("두 점수의 평균: " + ave);
		
		sc.close();

	}

}
