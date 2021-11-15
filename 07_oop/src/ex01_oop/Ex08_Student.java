package ex01_oop;

class Exam{
	//field
	String examName; //중간 ,기말..
	int kor, eng, math; // 0 - 100 사이
	double ave;
	char grade; //A 90 B 80 C 70 D 60 F 60미만
 	
	//constructor
	Exam(String examName){
		this.examName = examName;
	} //시험 이름만 정함
	//method
	void setScore() {
		kor = (int)(Math.random()*101) + 0; //0 - 100까지 정수 중 1
		eng = (int)(Math.random()*101);
		math = (int)(Math.random()*101);
		setAverage(); //여기다 넣으면 setScore에서 모든 작업이 이루어짐
		setGrade();
	}
	void setAverage() {
		//평균 계산
		ave = (kor+eng+math)/3.0;
	}
	void setGrade() {
		//학점 계산
		int x = (int)(ave / 10);
	/*	if (x >=9) {
		 grade = 'A';
		}else if( x>= 8) {
			grade = 'B';
		}else if(x>= 7) {
			 grade = 'C';
		}else if(x>= 6) {
			grade = 'D';
		}else { grade = 'F';
		}*/
		switch (x) {
		case 9 : grade = 'A'; break; //switch문에 break; 꼭 넣기~!!!ㅇ
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F'; break;
		}
	}
	void info() {
		System.out.println(examName + " 결과");
		System.out.println("국, 영, 수: " + kor +", "+ eng + ", " + math);
		System.out.println("평균: " + ave + " (" + grade + ")");
	}
	
}//exam

class Student{
	//field
	String name;
	Exam exam;
	//constructor
	Student(String name){
		this.name = name;
	}
	//method
	void setExam(Exam exam) {
		this.exam = exam;
	}
	void setScore() {
/*		exam.setScore();
		exam.setAverage();
		exam.setGrade(); //호출 순서 바뀌면 계산 안됨*/
		exam.setScore(); //위에서 setScore에 setAverage와 segGrade를 넣어 다 불러내지 않아도 된다.
	}
	void info() {
		System.out.println("이름: " + name);
	//	setScore(); //setScore를 한번에 넣어 따로 호출할 필요 없게 함
		exam.info();
		
	}
}//student
public class Ex08_Student {

	public static void main(String[] args) {
		Exam exam1 = new Exam("중간고사");
		Exam exam2 = new Exam("기말고사");
//		Student student1 = new Student("영희", exam1); 아래버전 내용으로 수정함
		Student student1 = new Student("영희");
		
		student1.setExam(exam1);
		student1.setScore(); //마찬가지로 info에 setScore 넣어 정리할 수 있음, 
		//					그런데 의미가 다르니까 점수와 정보로 나눠서 출력하는 것이 보기 좋음
		student1.info();

		student1.setExam(exam2);
		student1.setScore();
		student1.info();
		
	}

}
