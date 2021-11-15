package ex04_constructor;

import java.util.Arrays;

class Student{
	
	//field
	String name;
	String school;
	int[] score;  //나중에 score = new int[3]; 만들어주기
	double average;
	boolean isPass;
	
	//1 construct, 2 method
	Student (String name, String school){
		this.name = name;
		this.school = school;
	}
	
	void doExam() {
		int total = 0;
		score = new int[3];
		for (int i = 0 ; i < score.length ; i ++) { //int [] score; 인 상태에서 해결할 수 없음. 길이작업을 거쳐야한다
			score[i] = (int)(Math.random()*50) + 51;
			total += score[i];
		}

//		(int)(Math.random()*51) + 50;
		average = (double)total / score.length; 
		isPass = average >= 80 ;
	}
	
	void info() {
		System.out.println("이름: " + name);
		System.out.println("학교: " + school);
		System.out.println("점수: " + Arrays.toString(score)); //Arrays.toString(score) 배열 출력해주는 함수
		
		//점수를 함수 없이 출력하기
		System.out.print("["); 
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
			if (i == score.length -1) {
				System.out.println("]");
			}else {
				System.out.print(", ");
			}
		}
		//소모적이다... 굳이~~
		System.out.println("평균: " + average);
		System.out.println(isPass ? "합격" : "불합격");
	}
	
	
	
}

public class Ex05_Student {

	public static void main(String[] args) {
		
		//클래스, 메소드의 소스 코드를 확인하려면,
		//ctrl 키를 누르고 클릭
		
		Student student = new Student("제임스", "서강대");
		
		student.doExam(); //시험봄, 점수는 50점 ~ 100점 사이 랜덤 3개 생성
		
		student.info();
		
		/*결과
		 * 이름: 제임스
		 * 학교: 서강대
		 * 점수: [50, 75 100]
		 * 평균: 75.0점
		 * 불합격 // 평균 80이상 합격 
		 */

	}

}
