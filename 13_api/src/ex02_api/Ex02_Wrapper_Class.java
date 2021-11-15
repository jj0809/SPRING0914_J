package ex02_api;
/*
 * Wrapper class
 * - 기본 자료형 -> 참조 자료형으로 변경 가능
 * - 종류
 * 	  1) int -> Integer
 *    2) double -> Double
 *    3) char -> Character
 * - 변수를 객체로 변경해줌
 * - 변수와 객체는 자동으로 상호변환 가능
 *   1) Auto Boxing: 변수 -> 객체
 *   2) Auto UnBoxing: 객체 -> 변수
 * - 사용하는 시점: 참조자료형이 반드시 요구될 때 사용 //정수를 넣으라는데 int 를 넣으면 오류가 나.. Integer로 전달
 * 
 */
public class Ex02_Wrapper_Class {

	public static void main(String[] args) {
		Integer a = 10; //10을 객체 a로 만드는 Auto Boxing
		Integer b = new Integer(20); //원래 방식대로
		Integer c = new Integer("30"); //문자열까지 정수라면 넣을 수 있음
		
		int total = a + b + c; //a, b, c 객체를 int 타입 변수로 변환.. Auto UnBoxing
		System.out.println(total);
		//Integer(참조자료형)를 굳이 막 쓸 필요는 없음, 꼭 요구할 때에만 사용하렴
	}

}
