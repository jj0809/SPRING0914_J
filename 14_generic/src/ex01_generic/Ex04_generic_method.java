package ex01_generic;

public class Ex04_generic_method {

//	<N extends Number>
//	Number class: Integer, Double 의 수퍼클래스
//	전달되는 타입이 Number 타입이어야 한다는 뜻..
	
	public static <N extends Number> double getTotal(N[] a) {
		double total = 0; //N타입 total의 초기화
		for (int i = 0; i < a.length; i++) {
			total += a[i].doubleValue(); //doubleValue: Number값을 실수값으로 바꿔줌
						//N타입은 Number의 서브타입으로 Number클래스의 메소드 doubleValue 사용 가능
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		Integer[] a = {1, 2, 3, 4, 5};
		Double[] b = {1.1, 2.2, 3.3};
		String[] c = {"나", "너"};
		
		double r1 = getTotal(a); //getTotal의 결과타입이 double이므로 double로 받아야함ㅎㅎ
		double r2 = getTotal(b);
//		getTotal(c); //오류 발생

		System.out.println(r1);
		System.out.println(r2);
	}

}
