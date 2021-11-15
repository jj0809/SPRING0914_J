package ex02_inheritance_quiz;
//수퍼클래스
class NameAge{
	//field
	String name;
	int age;
	
	NameAge(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.print("이름: " + name + " 나이: " + age + " ");
	}
}//nameAge

//subclass
class Student extends NameAge{
	//field
	String school;
	
	//constructor
	Student(String name, int age, String school){
		super(name, age);
		this.school = school;
	}
	@Override
	void info() {
		super.info();
		System.out.println("학교: " + school);
	}
}
class Worker extends NameAge{
	//field
	String job;
	
	//constructor
	Worker(String name, int age, String job){
		super(name, age);
		this.job= job;
	}
	@Override
	void info() {
		super.info();
		System.out.println("직업: " + job);
	}
}





public class Quiz02 {

	public static void main(String[] args) {
		//학생과 직장인
		Student student = new Student("에밀리", 21, "서강대"); //이름, 나이, 학교
		Worker worker = new Worker("아만다", 25, "변호사"); //이름, 나이, 직업
		
		student.info(); //이름: 에밀리, 나이: 21, 학교: 서강대
		worker.info(); //이름: 아만다, 나이: 25, 직업: 변호사
	
	}

}
