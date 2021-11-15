package ex01_basic;

public class Ex02_literal { //값 작성 방법

	public static void main(String[] args) {
		/* 1. 문자 표현 방식 - 뭐든 한 글자!
		 * 작은 따옴표 사용(' ')*/
		System.out.println('a');
		System.out.println('한');
		// 2. 문자열 표현 방식 - 단어나 문장과 같이 여러개로 구성
		// 큰 따옴표 사용(" ")
		System.out.println("Hello");
		
		// 3. 정수, 실수
		// 그냥 입력함
		System.out.println(100);
		System.out.println(3.14); //소수점 들어가면 실수로 인식
		
		// 4. 논리 표현 방식
		// true, false(다 소문자)
		System.out.println(true); //키워드라서 색이 다름
		System.out.println(false);
		
		/* 5. 이스케이프 시퀀스 - 일종의 특수문자 개념
		백슬래시(\)로 시작
		\n: 줄바꿈 (엔터)
		\t: 탭(간격 띄움)
		\': 작은 따옴표 출력
		\": 큰 따옴표 출력   
		*/
		System.out.println("Hello\nWorld");
		System.out.println("Hello\tWorld");
		System.out.println("Hello\'World\'");
		System.out.println("Hello\"World\"");
	}
}
