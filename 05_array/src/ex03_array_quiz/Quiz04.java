package ex03_array_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		 * 문제. 성적 관리 프로그램
		 * 학생 3명의 이름은 "타요", "띠띠뽀", "뽀로로"
		 * 각 학생의 성적은 1명 당 0 ~ 100 사이 정수 1개이다.
		 * 학생의 점수를 입력 받아서, 평균, 최고, 최저 점수를 출력하시오
		 * 
		 * 실행 예:
		 * 타요의 점수 입력 >>> 50
		 * 띠띠뽀의 점수 입력 >>> 55
		 * 뽀로로의 점수 입력 >>> 60
		 * 평균: 55.5 점, 최고: 60점, 최저: 50점
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"타요", "띠띠뽀", "뽀로로"};
		int[] score = new int[students.length];
		
		for (int i = 0; i <students.length; i++) {  //향상 for문은 내용 수정 x, 입력 x
			System.out.print(students[i] + "의 점수 입력 >>>");
			score[i]= sc.nextInt();
		}
		/*
		double avr = (score[0]+score[1]+score[2])/3;
		
		int max = score[0];
		max = max > score[1] ? max : score[1];
		max = max > score[2] ? max : score[2];
		
		int min = score[0];
		min = min < score[1] ? min : score[1];
		min = min < score[2] ? min : score[2];
		*/
		double average = 0;
		int total = 0; // zero
		int max = 0; // 가장 작은 값을 초기화할 때 준다
		int min = 100; //가장 큰 값 
		
		//평균을 구하기 위한 합계 구하기
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		//합계 구하기
		average = (double)total / score.length; //total 이 정수이므로 캐스팅 필요, 캐스팅은 작은범위에서 큰범위로
		
		//최고, 최저 구하기
		for (int i = 0; i < score.length; i++) {
			
			//최고 점수
			if (max < score[i]) {
				max = score[i];
			}
		
			//최저 점수
			if (min > score[i]) {
				min = score[i];
			}
			
		}
		
		System.out.println("평균: "+ average +", 최댓값: "+ max + ", 최소값: "+ min);
		
		
		sc.close();
		
		//end
	}

}
