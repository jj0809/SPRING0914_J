package ex02_exception_class;

import java.util.Scanner;

class NameException extends Exception{
	//constructor
	public NameException(String message) {
		super(message);
	}
}

class Human {
	//field
	private String name;
	//constructor
	public Human(String name) {
		super();
		this.name = name;
	}
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameException {
		if(name.length() <2 || name.length() > 6) { //name의 길이가 2보다 작거나 6보다 클 경우
			NameException e = new NameException("이름은 2 - 6자만 가능");
			throw e; //e를 던지면 p.setName(name)으로 가서 try 안의 오류가 나타나 catch, e.getMessage를 실행함
					//이 e.getMessage가 26라인에서 설정한 메시지
		}
		this.name = name;
	}
}

public class Ex02_NameException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			Human p = new Human("홍길동");

			//이름 수정
			System.out.print("이름을 입력하세요 >>> ");
			String name = sc.next();
			p.setName(name); //예외가 생기면 여기서 생겨서 바로 49줄로 넘어감!
			System.out.println("변경된 이름: " + p.getName());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
