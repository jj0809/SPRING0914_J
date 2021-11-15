package ex02_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_SimpleDateFormat {

	public static void main(String[] args) {
		/*Simple Date Format 간단한 날짜 형식~
		 * 일반 Date 형식이 너무 복잡하니 간단하게 바꿔보자!
		 */
		
		/*SimpleDateFormat 클래스에서 사용하는 pattern
		 *1. 년도 
		 *   1) yy
		 *   2) yyyyy
		 *2. 월
		 *   1) M
		 *   2) MM
		 *3. 일
		 *   1) d
		 *   2) dd
		 *4. 요일: 일 ~ 토(한글)
		 *   1) E 
		 *5. 오전/오후 (한글)
		 *   1) a
		 *6. 시
		 *   - 12시간
		 *     1) h
		 *     2) hh
		 *   - 24시간
		 *     1) H
		 *     2) HH
		 *7. 분
		 *   1) m
		 *   2) mm
		 *8. 초
		 *   1) s
		 *   2) ss
		 **/
		
		//pattern 없는 날짜 형식
		System.out.println("일반 Date => " + new Date()); //일반 date
		System.out.println("SQL Date => " + new java.sql.Date(System.currentTimeMillis())); //sql date
		
		//pattern 있는 날짜 만들기
		//pattern: 2020년 10월 13일 화요일 오후 12:30
		String pattern = "yyyy년 MM월 dd일 E요일 a H:mm"; //보통 H는 1자리, mm은 2자리
		Date today = new Date(); //일반 Date. SQl date도 가능함
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String patternToday = sdf.format(today);
		
		System.out.println("패턴 날짜 => " + patternToday);
	}

}
