package ex01_input;

import java.util.Scanner;

//import java.util.Scanner; //java util의 스캐너 가져다 쓰겠습니다....


public class Ex01_Scanner {

	public static void main(String[] args) {
		/*
		 * Scanner: 입력받을 때 사용하는 클래스
		 * 
		 * 그 동안 사용했던 클래스 //만든 클래스(Ex01 ... 제외)
		 * 모두 동일한 패키지에 저장되어 있음 // 기본패키지
		 * 패키지 이름: java.lang (java language)
		 * 1. String
		 * 2. System
		 * 3. Integer
		 * 4. Boolean
		 * 5. Double
		 * 		 * 
		 * java.lang 패키지에 저장된 클래스들은 import가 필요없음
		 
		 */
		
		/*
		 * Scanner 클래스
		 * 
		 * 1. 콘솔 입력(키보드 입력)을 처리하는 클래스
		 * 2. 패키지: java.util
		 * 	  import가 필요하다(자동완성으로 클래스 입력함)
		 * 3. 생성 방법
		 *    Scanner 객체 = new Scanner(입력스트림);
		 *    //JVM이 키보드에서 JVM에 입력되는 통로를 뚫어주는 역할..
		 * 4. 소멸 방법 // 반납..
		 *    객체.close(); 
		 * 5. 입력 받을 때 사용하는 메소드
		 *    1) 정수 입력
		 *       - nextInt(), nextLong(), nextShort(), nextByte()
		 *    2) 실수 입력
		 *       - nextDouble(), nextFloat()
		 *    3) 논리 입력
		 *       - nextBoolean()
		 *    4) 문자열 입력
		 *       - next() : 공백 문자 전까지 입력 (공백 입력 불가)
		 *       - nextLine() : 엔터 전까지 입력 (공백 입력 가능)
		 *    5) 문자 입력
		 *       - 메소드가 없음(문자열 입력 사용하라... 
		 *       - 문자열 입력 후 첫 번째 글자만 빼서 사용함
		 *       - 첫 번째 글자를 빼는 메소드: charAt(0)  
		 *       
		 *       next(), nextLine(), nextDouble(), nextInt() 알아두자
		 */
		//Scanner sc = new Scanner(System.in); //d입력스트림은 System.in 고정...		
		//import 해야 함. 안하면 java.lang에서 찾느라 빨간 줄 나타난다..

		Scanner sc = new Scanner(System.in); //객체 sc 생성, sc를 통해 입력받을 수 있음
		
		//System.out.println(); //출력 후 줄바꿈, ln:line
		//System.out.print(); //출력 후 줄바꿈 없음
		
		// 1. 이름 입력받기
		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.nextLine(); //nextLine: 이름에 공백이 포함될 수 있음
		
		// 2. 나이 입력받기
		System.out.print("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		
		// 3. 키 입력받기
		System.out.print("키를 입력하세요 >>> ");
		double height = sc.nextDouble();
		
		// 4. 성별 입력받기
		System.out.print("성별을 입력하세요(남/여) >>> ");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height+ "cm");
		System.out.println("성별 : " + gender);
		
		sc.close(); //반납은 생략이 가능함.
		
		
		
	}

}
