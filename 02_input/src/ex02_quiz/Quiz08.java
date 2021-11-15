package ex02_quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		// 문제. 체질량지수(bmi)를 구하고 건강 상태 출력하기
		// 체질량지수 = 몸무게(kg) / 키(m)의 제곱
		// 건강상태 = 체질량 지수 25이상이면 "과체중" , 24 - 20 " 정상" , 20 미만이면 "저체중"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg)를 입력하시오 >>> ");
		double weight = sc.nextDouble();
		
		System.out.print("키(cm)를 입력하시오 >>> ");
		double height = sc.nextDouble();
		height = height *0.01; //height /=100; 가능하면 소수점을 안쓰는 방향으로 작성해보자....
		double bmi = weight/(height*height);
		String strhealth = bmi >= 25 ? "과체중" : bmi>=20 ? "정상" : "저체중";
		System.out.println("BMI지수 " + bmi + ", 건강상태는 " + strhealth + "입니다");
		
		sc.close();
		
	}

}
