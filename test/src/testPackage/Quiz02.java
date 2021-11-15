package testPackage;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//1개의 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력하시오
		//4학년인 경우 70점 이상이어야 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요 >> ");
		int grade = sc.nextInt();
		
		if(grade < 4) {
			System.out.println(score >= 60 ? "합격" : "불합격");
		} else {
			System.out.println(score >=70 ? "합격" : "불합격");
		}
		
		sc.close();
	}

}
