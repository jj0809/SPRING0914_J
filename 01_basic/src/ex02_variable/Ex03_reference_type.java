package ex02_variable;

public class Ex03_reference_type {

	public static void main(String[] args) {
		/*
		 * 참조 자료형 (reference type) (c언어의 포인터에 해당한다......
		 * - 값이 저장된 참조(주소)를 저장하는 변수
		 * 
		 * 변수:값을 저장할 수 있는 메모리 공간의 이름
		 *      이 때 메모리 공간은 1바이트마다 분할되어 
		 *      각각 고유의 번호(주소=참조)로 분리되어 있음
		 * 
		 *	    256바이트 크기의 메모리의 경우 0 ~ 255까지의 주소가 있고
		 *	    보통 주소는 16진수로 표현, 0x: 16진수의 prefix값........
		 * 	    16진수: 0 ~ 9 ABCDEF 까지 16개.
		 * 
		 * 1. 문자열
		 *    1) String: 첫 글자 대문자로 작성=클래스
		 *       (1) 문자열을 저장하지 않음
		 *       (2) 문자열이 저장되어 있는 참조(주소)를 저장
		 *       (3) 사용 방법
		 *       	 - String s = new String("Hello"); //대부분의 참조 자료형 처리방식
		 *           - String s = "Hello"; //자주 사용되므로 자바가 특별히 지원함
		 *				(s는 Hello가 저장되어 있는 주소값=참조값이 저장되어 있음)
		 *				(s를 사용하면 Hello가 나온다고 함.....)
		 *       */
	
		//int a = 10;
		//int b = 10; //a 와 b는 10으로 같음......(1)
		
		String s1 = new String("Hello");// s1을 객체, 인스턴스라고 부릅니다...
		String s2 = "Hello";
		
		System.out.println(s1); //출력하면 둘 다 Hello 나오지만
		System.out.println(s2); //s1와 s2는 참조형 자료이므로 다름.......(2)
		
		// 메모리에는 2개의 Hello가 저장되어 있다.
		// 각 Hello의 저장 위치(참조, 주소)가 s1과 s2에 저장되어 있으므로 s1과 s2는 다른 값

		System.out.println(s1==s2); //s1과 s2가 같은가요?? F 출력
		// 첫 글자가 대문자인 자료형은 다 참조자료형이다
	}

}
