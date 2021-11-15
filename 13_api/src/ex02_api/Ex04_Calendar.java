package ex02_api;

import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {
//		1. Calendar 클래스 타입의 객체 cal
//		new 사용 대신 getInstance 메소드를 사용한다
		Calendar cal = Calendar.getInstance(); //현재 날짜와 시간 생성
//						클래스를 통해 호출하는 메소드를 클래스 메소드라고 부름
//						class method는 static 처리된다. (getInstace : Static).. singleton pattern
//		오직 하나의 객체로만 처리를 해야하는 경우 singleton pattern으로 만들어서 처리해야하고
//		그때 사용해야할 메소드가 getInstance 이다..나중에 나옴
		
//		2. 년 월 일
		System.out.println(cal.get(Calendar.YEAR) + "년 ");
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월 "); //Calendar.Month: 0 - 11 로 구성
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일 ");

	
//		3. 요일 번호
//		일(1), 월(2) ..... 토(7)
		System.out.println("요일 번호: " + cal.get(Calendar.DAY_OF_WEEK));
	
		//오늘 요일 출력하기: 화요일
		//요일번호 = 인덱스 인 배열 생성
		String[] weekName = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println(weekName[cal.get(Calendar.DAY_OF_WEEK)] + "요일");
	
		
//		4. 오전/오후, 시, 분, 초
		System.out.println("오전/오후: " + cal.get(Calendar.AM_PM)); //오전: 0, 오후: 1
		System.out.println("시(12시각): " + cal.get(Calendar.HOUR)); //0 - 11시
		System.out.println("시(24시각): " + cal.get(Calendar.HOUR_OF_DAY)); //0 - 23시
		System.out.println("분: " + cal.get(Calendar.MINUTE));
		System.out.println("초: " + cal.get(Calendar.SECOND));
		
//		5. 다른 날짜와 시간으로 변경
//		2020년 10월 5일 10시 30분 40초
		cal.set(2020, 9, 5, 10, 30, 40); //월은 0 - 11 까지
		//캘린더 출력은 위에 처럼 하나하나 뽑아서 출력해야 한다~
	}

}
