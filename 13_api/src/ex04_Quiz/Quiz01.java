package ex04_Quiz;

import java.util.Scanner;

public class Quiz01 {

	
	//static 메소드 (클래스 메소드)는 static 메소드, static 필드만 호출할 수 있음!!!
	
//	static 메소드 안에서는 일반 메소드는 부를 수 없음
//	+ static이 우선 메모리에 만들어지고 일반 변수나 필드, 메소드가 그 다음에 만들어짐
	
//	inputFullName 메소드 
//	실행 예:
//	성(Last name)을 입력하시오 >>> james 
//	이름(First name)을 입력하시오 >>> dean
	//james dean을 반환하는 메소드 구현
//	StringBuffer 클래스 사용하시오 - append
	private static Scanner sc = new Scanner(System.in);
/*	public static String inputFullName() { //static을 넣어주자
		StringBuffer sb = new StringBuffer();
		System.out.print("성(Last name)을 입력하시오 >>> ");
		sb.append(sc.nextLine());
		sb.append(" ");
		System.out.print("이름(First name)을 입력하시오 >>> ");
		sb.append(sc.nextLine());
		return sb.substring(0);
	} 한글로 했을 때 오류가 났음.. 아물도 StringBuffer로 바로바로 저장해서 그런ㄱ ㅓㅅ 같슴..S
*/	
	//샘
	public static String inputFullName() { //static을 넣어주자
		System.out.print("성(Last name)을 입력하시오 >>> ");
		String lastName = sc.next();
		System.out.print("이름(First name)을 입력하시오 >>> ");
		String firstName = sc.next();
		StringBuffer sb = new StringBuffer();
		sb.append(lastName).append(" ").append(firstName); //!!!
		return sb.toString();
	} //StringBuffer를 쓸 경우 String으로 내용들을 저장하고 StringBuffer에서 합쳐 보여주는 방식을 사용한다...
	
	public static void main(String[] args) {
		String fullName1 = inputFullName(); //inputFullName 메소드를 같은 클래스에 넣으면 된다
		String fullName2 = inputFullName();
		System.out.println("성명1: " + fullName1);
		System.out.println("성명2: " + fullName2);
		if (fullName1.equals(fullName2)) {
			System.out.println("같은 이름이다.");
		}else {
			System.out.println("다른 이름이다.");
		}
	}

}
