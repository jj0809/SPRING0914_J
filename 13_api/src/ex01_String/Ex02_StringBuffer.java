package ex01_String;

public class Ex02_StringBuffer {

	public static void main(String[] args) {
		//StringBuffer 클래스
		//1. String을 처리하는 내부 Buffer를 가지고 있다.
		//2. String에 비해 성능이 좋음
		//3. MultiThread 환경에서 사용할 수 있음
			/*thread: 작업의 단위
			 * 싱글 스레드: 한 번에 한 작업만 가능 (무전기)
			 * 멀티 스레드: 한 번에 여러 개의 작업 가능, 네트워크 환경(전화기)
			 */
		//1. StringBuffer 객체 생성 - java.lang 소속 기본 클래스로 import하지 않음
		StringBuffer sb = new StringBuffer();
		
		//2. 문자열 추가하기
		sb.append("Hello ");
		sb.append("java ");
		sb.append("world");
		
		//3. 출력
		System.out.println(sb);
		
		//4. 동등비교 - equals
		System.out.println("Hello java world".equals(sb)); //false
		//sb는 String이 아님. StringBuffer임... equlas 동작하지 않음
		//String으로 변환하여 equals 실행..
		System.out.println(sb.toString().equals("Hello java world")); //true
		
	}

}
