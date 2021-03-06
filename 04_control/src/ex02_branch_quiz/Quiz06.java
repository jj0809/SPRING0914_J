package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		/*
		 * 문제. 점수를 입력받아서 해당하는 학점을 출력하시오
		 * char grade: 'S', 'A', 'B', 'C', 'F'
		 * char point : '+', '0', '-'
		 * 100  : S
		 * 99-97: A+ 
		 * 96-94: A0
		 * 93-90: A-
		 * 89-87: B+ 
		 * 86-84: B0
		 * 83-80: B-
		 * 79-77: C+ 
		 * 76-74: C0
		 * 73-70: C-
		 * 69-0 : F 
		 * 
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 >>> ");
		int score = sc.nextInt();
		char grade;char point;
		
		
		//point
		switch (score % 10) {
		case 9 : case 8 : case 7: point = '+';  break;
		case 6 : case 5 : case 4: point = '+';  break;
		default : point = '-';
		}
	
		switch (score/10) {
		case 10: grade = 'S'; point = ' '; break;
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'c'; break;
		default: grade = 'F'; point = ' ';
		}
		
		System.out.println("학점: " + grade + point);
	//	System.out.println(grade + point); //이렇게 하면 코드값 합계가 나옴
	
		sc.close();
		
		
	}

}
