package ex02_object_array;

import java.text.DecimalFormat;
import java.util.Arrays;

class Student{
	//field
	String name;
	int[] scores;	 //모든 점수들
	double average;	 //평균
	char grade;		 //학점
	boolean isPass;	 //합격유무 (기준 60점)
	
	//constructor
	Student(String name){
		this.name = name;
	}
	
	//method
	void setScores(int scoreCount) {
		this.scores = new int[scoreCount];
		for (int i = 0; i < scores.length; i++) { //i < scoreCount 사용 가능
			this.scores[i] = (int)(Math.random()*101); //0부터 100까지 101개
		}
		this.average = getAverage();
		this.grade = getGrade();
		this.isPass = isPass();
	}
	double getAverage() {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return (double)total/scores.length;
	}
	char getGrade() {
		if (average >= 90 ) {return 'A'; }
		else if (average >= 80 ) { return 'B'; }
		else if (average >= 70 ) { return 'C'; }
		else if (average >= 60 ) { return 'D'; }
		else { return 'F'; }
	}
	boolean isPass () {
		return average >= 60;
	}
	void info() {
		System.out.print(name + ", ");
		System.out.print(Arrays.toString(scores) + ", ");
		DecimalFormat df = new DecimalFormat("0.00"); //소수점 2자리 강제
		System.out.print(df.format(average) + ", ");
		System.out.print(grade + ", ");
		System.out.println(isPass? "합격" : "불합격");
	}
}

class Lecture{
	//field
	String lectureName;
	Student[] studentList;
	int idx;
	
	//constructor
	Lecture(String lectureName, int studentNumber){
		this.lectureName = lectureName;
		studentList = new Student[studentNumber];
	}
	//method - addStudent, doexam, info
	void addStudent(Student student) {
			studentList[idx++] = student;
		//	idx++;
	}
/*내꺼
 * 	void doExam(int num) {
		for (Student student : studentList)
		student.setScores(num);
	} */
//	double ttl = 0.0;    ttl은 내가 만든 전체 평균!
	void doExam() {
		//studentList[i] : student 1명
		for (int i = 0; i < idx; i++) {
			studentList[i].setScores(3); //학생마다 3개과목
//			ttl += studentList[i].average;
		}
	}
	//샘이 만든 전체 평균
	double getLectureAverage() {
		double total = 0.0;
		for (int i = 0; i < idx; i++) {
			total += studentList[i].getAverage();
		}
		return total/studentList.length ;
	}
	void info() {
		System.out.println("강좌명: " + lectureName + new DecimalFormat("0.00").format(getLectureAverage()) + "점");
		for (Student student : studentList) {
		student.info();}
//		System.out.println("강좌 평균" + ttl / studentList.length);
	}
}
public class Ex04_Student {

	public static void main(String[] args) {
		//학생 5명 이름
		String[] names = {"alice", "emily", "lucia", "david", "james"};
		//강좌 생성
		Lecture lecture = new Lecture("웹개발자 양성과정", names.length); //강좌 이름 "웹개발자 양성과정", 학생 수 : 5
		
		
		//강좌에 학생 5명 등록
//		lecture.addStudent() 를 5번 호출
		for (int i = 0; i < names.length; i++) {
			lecture.addStudent( new Student(names[i]) );
		}
		//강좌 시험 개설
		lecture.doExam();
		//내꺼로 하면 lecture.doExam(3);
		//강좌 시험 결과
		lecture.info(); //학생정보 모두 출력 + 강좌 전체 평균 출력
		
		
	}

}
