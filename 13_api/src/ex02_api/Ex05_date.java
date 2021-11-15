package ex02_api;

import java.util.Calendar;
import java.util.Date;

public class Ex05_date {

	public static void main(String[] args) {
		/*
		 * Date 타입
		 * 1. 일반 Date: java.util.Date
		 * 2. SQL용 Date: java.sql.Date (DB용)
		 * 
		 * SQL이 일반의 서브클래스?라고 볼 수 있다??? 모르겠다
		 */

		//일반 Date
		Date date1 = new Date();
		System.out.println("현재: "+ date1);
		
		//Calendar + 일반 Date
		Calendar cal = Calendar.getInstance();
		Date date2 = cal.getTime();
		System.out.println("현재: "+ date2);
		
		//SQL용 Date
		//java.util.Date가 이미 import되어 있으므로 sql을 불러올 때 이렇게 불러와야한다
		java.sql.Date date3 = new java.sql.Date(System.currentTimeMillis());
		System.out.println("현재: "+ date3);
		
		/* DB에서 날짜를 - 나 / 로 구분할 수 있게 하기 때문에 
		 * 자바에서도 sql.date를 출력할 때 2020-10-13 형식으로 나타남
		 * 
		 * sql 날짜가 제일 많이 필요한 내용: 가입일, 작성일, 수정일...
		 * -> 실제로는 일반 데이터를 많이 쓰지 않고 sql 데이터를 많이 쓰게 된다
		 * DB와 링크하여 관리하기 위함....~? 
		 */
		
	}

}
