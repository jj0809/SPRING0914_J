package ex02_api;

import java.math.BigDecimal; //BigDecimal 패키지 import
import java.math.BigInteger; //BigInteger 패키지 import

public class Ex03_BigNumber {

	public static void main(String[] args) {
		//int (integer) 타입의 최대값
		System.out.println("Integer 최대값: " + Integer.MAX_VALUE);
		
		//long (Long)타입 최대값
		System.out.println("Long 최대값: " + Long.MAX_VALUE);
		
		//long보다 큰 숫자는 BigInteger. 클래스 사용
		BigInteger a = new BigInteger("12345678901234567890"); //대부분 문자열로 넘겨 처리된다.
		BigInteger b = new BigInteger("98765432109876543210");
		//사칙연산 진행 가능 - 기호 대신 메소드 사용
		System.out.println("a + b " + a.add(b));
		System.out.println("a - b " + a.subtract(b));
		System.out.println("a * b " + a.multiply(b));
		System.out.println("a / b " + a.divide(b));
		System.out.println("a % b " + a.remainder(b));
		
		//BigInteger의 필드값
		System.out.println(BigInteger.ZERO); //0
		System.out.println(BigInteger.ONE);  //1
		System.out.println(BigInteger.TEN);  //10
		
		//실수
		//정확한 소수 자릿수를 위해서 BigDecimal 클래스를 사용함
		double c = 1.1234567890123456789;
		BigDecimal d = new BigDecimal("1.1234567890123456789");
		System.out.println(c); //데이터 전부 다 안나옴
		System.out.println(d); //그대로 다 나옴
	}

}
