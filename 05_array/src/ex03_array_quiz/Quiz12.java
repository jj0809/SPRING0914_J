package ex03_array_quiz;

import java.util.Scanner;

public class Quiz12 { 
	public static void main(String[] args) {
		/*
		 * ★★★★★★★ 다시 연습할 것 ★★★★★★★
		 * Quiz04 참조 
		 * 문제. 성적 관리 프로그램
		 * 학생 3명 + 과목 3과목
		 * 학생 3명: "타요", "띠띠뽀", "뽀로로"
		 * 과목 이름: "국어", "영어", "수학"
		 * 입력받은 성적들을 합계와 함께 출력하시오
		 * 
		 * 실행 예:
		 * 타요의 국어 점수 >>> 10
		 * 타요의 영어 점수 >>> 10
		 * 타요의 수학 점수 >>> 10
		 * ...
		 * 성적 결과
		 * 		 국어 영어 수학 총점
		 * 	타요   10  10  10  30
		 * 띠띠뽀  10  10  10  30
		 * 뽀로로  10  10  10  30
		 *  합계   30  30  30  90
		 */

		//String[][] students = {{"타요", "띠띠뽀", "뽀로로", "합계"}, 
		//		{"", "국어", "영어", "수학", "총점"} };
		//}
		String[] students = {"타요", "띠띠뽀", "뽀로로", "루피", "합계"};
		String[] objects = {"국어", "영어", "수학", "총점"};
		int[][] scores = new int[students.length][objects.length];
		Scanner sc = new Scanner(System.in);
		
		//입력과 합계, 총점 계산
		for (int i = 0; i < scores.length-1; i++) {
			for (int j = 0; j < scores[i].length-1; j++) {
				System.out.print(students[i] + "의 " + objects[j] + "점수 >>> ");
				scores[i][j] = sc.nextInt();
				//각각의 점수: score[i][j];
				//개인별 총점: score[i][objects.length-1];  뒷자리 고정
				//과목별 합계: score[students.length-1][j]; 앞자리 고정
				//전체    합계: score[students.length-1][objects.length-1]; 맨 마지막 숫자
				scores[i][objects.length-1] += scores[i][j];
				scores[students.length-1][j] += scores[i][j];
				scores[students.length-1][objects.length-1] += scores[i][j];
				}
		}
		System.out.println("성적 결과");
		// 과목, 총점 출력
		System.out.print("\t");
		for(int i = 0; i <objects.length; i++) {
			System.out.print(objects[i] + "  ");
			}
		System.out.println();
		
		// 이름 및 성적, 합계 출력
		// i와 j를 scores.length / scores[i].length 로 지정해야 
		// students, objects의 수가 변해도 지장없이 결과물 출력 가능
		for(int i = 0; i <scores.length; i++) { 
			System.out.print(students[i] + "\t"); // 학생 출력
			for (int j = 0; j < scores[i].length; j++) { //
				System.out.print(scores[i][j] +"   "); //score 출력
			}
			System.out.println();
		}
		sc.close();
		
		
	}//end

}
