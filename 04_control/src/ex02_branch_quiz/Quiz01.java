package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 문제. 국어와 영어 점수를 정수로 입력받아서 
		// "합격", "불합격" 구분하여 출력하시오
		// 국어와 영어 점수가 모두 80점 이상이고, 평균이 85점 이상이면 "합격"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력하시오 >>> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력하시오 >>> ");
		int eng = sc.nextInt();
		
	//	double avg = (kor + eng)/2;
		
		if (kor >=80 && eng >=80 && (kor+eng)/2.0 >=85) { //이렇게 해야 계산을 안 할 수도 있음. 더블이 나올수 잇으므로 2.0으로 기재
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		sc.close();
		
	}

}
