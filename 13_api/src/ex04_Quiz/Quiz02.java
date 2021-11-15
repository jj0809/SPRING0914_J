package ex04_Quiz;

import java.util.Calendar;
import java.util.Date;

public class Quiz02 {
	public static void main(String[] args) {
		//기념일 계산하기
		
		/* Calendar 클래스 이용해 특정 기념일로부터
		 * 며칠이 지났는지 출력하시오
		 */
		
		Calendar cal = Calendar.getInstance(); 
		cal.set(2019, 10, 2); //특정 기념일로 바꾸기
		Calendar today = Calendar.getInstance(); //오늘 날짜
		
		//두 날짜 차이 구하기
		long elapseTime = today.getTimeInMillis() - cal.getTimeInMillis();
		//getTimeInMillis: calendar 타입의 날짜를 long타입 밀리초로 바꿔줌
		
		//밀리초 -> 초 -> 분 -> 시 -> 일 로 바꿔줘야함
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		System.out.println("오늘까지 " + elapseDay +"일");
	}

}
