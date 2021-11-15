package ex03_array_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/*
		 * 두 번째 방법!
		 * 
		 * 문제. 성적 관리 프로그램
		 * 학생 3명의 이름은 "타요", "띠띠뽀", "뽀로로"
		 * 각 학생의 성적은 1명 당 임의의 정수 1개이다.  <<<< 바뀐 내용!
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
	
		double average = 0; //사실 의미 없는 초기화.
		int total = score[0]; // 첫 번째 점수로 초기화 
		int max = score[0];  // 모두 통일해야 한다.
		int min = score[0];  // 통일...
		
		//평균을 구하기 위한 합계 구하기
		for (int i = 1; i < score.length; i++) { //<<< total 이 score[0]으로 초기화 되었기 때문에 
												// int i = 1;부터 시작
			total += score[i];
		}
		//합계 구하기
		average = (double)total / score.length; //total 이 정수이므로 캐스팅 필요, 캐스팅은 작은범위에서 큰범위로
		
		//최고, 최저 구하기
		for (int i = 1; i < score.length; i++) { // 위와 마찬가지....
			//사실 이 for문은 없어도 되고 위의 total 구하는 for문에 아래 if문들을 같이 넣으면 됨...
			
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
