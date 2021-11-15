package ex03_method;

import java.util.Date;

class User{
	
	//field
	String id;
	String pw;
	Date date; //Data 타입의 data 객체
	//Date: 날짜를 기입하는 클래스   - 가입한 날짜

	//method
	/*1. 필드 정보 저장
	 * 1) 결과타입: void
	 * 2) 메소드명: setInfo
	 * 3) 매개변수: String uId, String uPw;
	 *    Date는 만들어지는 시점을 자동으로 입력받게 한다..
	 */
	
	void setInfo(String uId, String uPw) {
		id = uId;
		pw = uPw;
		date = new Date(); //new Date() 는 실행되는 날짜와 시간을 의미한다.
		//Date date = new Date(); 와 같은 작업임....
	}
	
	/*2. 출력
	 * 1) 결과타입: void
	 * 2) 메소드명: info
	 * 3) 매개변수: 없음
	 */
	
	void info() {
		System.out.println("아이디: " + id); //substring(0 , 2) = > 0<= pw < 2, substring도 메소드에 속함
		System.out.println("비밀번호: " + pw.substring(0, 2) + "******"); //비밀번호의 1 번째 글자부터 2번째 글자까지만 보여줌
		System.out.println("가입일: " + date.toString()); //toString - date를 문자열로 바꿔주는 메소드
		//subString, toString - 내장되어 있는 메소드들...
		
	}



}

/*
 * 대부분 메소드를 만들 때 결과타입을 void 처리함 
 * 결과가 깔끔하게 나오기 때문...ㅎㅎ....
 */



public class Ex01_User {
	public static void main(String[] args) {
		
		User user = new User(); //User라는 클래스로 user라는 객체 만들기
		user.setInfo("admin", "123456");
		user.info();
	}

}
