package ex02_exception_class;

import java.util.Scanner;

//이미 만들어진 예외클래스: Exception 상속 받음
//개발자가 만드는 예외클래스: Exception 상속 받음


/*Exception 클래스의 생성자 정보

 * class Exception{
	
	//constructor
	public Exception() {}

	public Exception(String message) {
		super(message);
	}
}*/
class Person{
	//field
	private String name;
	private int age;
	//constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	
	//매개변수 int age로 전달되는 값에 따라서
	//예외가 발생할 수 있는 메소드      ┌여기에 메소드 에외처리 방법(throws)을 작업
	public void setAge(int age) throws AgeException {
		if(age < 0 || age > 150) {
			AgeException e = new AgeException("나이는 0 ~ 150만 가능");
			throw e; //개발자가 만든 예외는 직접 던짐
		}
		this.age = age;
	}
	
}
//나이가 0 ~ 150 범위가 아닌 경우
//생성할 예외 클래스
class AgeException extends Exception{ //노란 불 뜨는 이유는 나중에.. 나중에 설명해준다고 함ㅎㅎ

	//constructor
	public AgeException(String message) {
		super(message);
	}
	
}

/*
 * 메소드가 예외를 처리하는 방법
 * 1. 직접 try - catch 문을 작성한다 (지금 고려할 대상이 아님)
 * 	 void a() {
 * 	  	try{
 * 		} catch{}
 * 	 }
 * 	 void b() {
 *	 try{} catch{}
 *	 }
 *	 ...
 * => 아 복쟙쓰
 * 
 * 2. 메소드를 호출하는 곳으로 예외를 토스함! (넘겨버림) throws!
 * 		메소드들을 호출하는 곳에서 모두 모아 예외 관리함.. 
 *	 void a() throws ArithmeticException{  }  <- 예외가 발생해서 던지면 던지면
 * 
 *	 try{
 * 		a();  <- 예외가 일루 가서
 * 		b();
 * 	 } catch(Exception e) {   } <-여기에 맞춰 처리됨
 * 
 * 2번 방법 기억하고 있으면 된다~
 */



public class Ex01_AgeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("나이를 입력하시오 >>> ");
			int age = sc.nextInt();
			
			Person p = new Person("홍길동", 20);
			
			//나이 수정
			p.setAge(age);
			System.out.println("변경된 나이:" + p.getAge());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
