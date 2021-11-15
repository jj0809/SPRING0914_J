package ex03_method;


/*
 * 메소드의 재귀 호출
 * = recursive call
 * = 메소드 내부에서 자신을 호출하는 것 : class a void b(){}내에서 b();... loop와 비슷
 * = 메소드의 반복문의 개념..
 */

class Counter {
	//field = 값
	int count; //지금 안썼음.. 
	//method = 기능
	void countDown(int count) {   // 5, 4, 3, 2, 1, ..: 0에서 끝나는 메소드
		if (count == 0) { //전달받은 숫자 count가 0일 때
			return;
		/*메소드 실행 중지
		   결과 타입이 없을 때 메소드 실행 중지 가능
		   방법 >>
			return;
		
		(cf)System.exit(0);//자바가 제공하는 시스템 종료 방식, 메소드 종료 방식과는 다름..
		*/
			
		}
		System.out.println(count);
		countDown(count - 1); //count에 - 1 한 값으로 다시 countDown 메소드 실행
	}
	
}//Counter
public class Ex06_recursive {

	public static void main(String[] args) {
		Counter counter = new Counter();
		//클래스: 타입: Counter  (int)
		//객체: 변수: counter    (number)
		
		//메소드: cuntDown
		counter.countDown(3); //countDown이 3 번 실행됨

	}//main

}
