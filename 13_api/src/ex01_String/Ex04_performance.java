package ex01_String;
//String과 StringBuffer 비교
public class Ex04_performance {

	public static void main(String[] args) {
//		"hello" 와 "world" 합치기
//		1. String: "hello + " world"
	//		str의 메모리: "hello world"
	//		"hello"의 메모리: "hello"
	//		"world"의 메모리: "world"
//		2. StringBuffer: append("helllo").append("world")
//			StringBuffer sb = new StringBuffer();
//			sb.append("helllo").append("world");
//			1) sb의 메모리: "hello" 추가
//			2) sb의 메모리: "world: 추가"
//		최근에는 String의 + 연산자도 많이 개선되었으나
//		 + 연산자가 많이 사용되는 경우라면 되도록 피할 것
		
//		1. String
		String str = "";
		Long start1 = System.nanoTime(); //시스템의 현재 시간(시작 전)
		for (int i = 0; i < 1000; i++) { //숫자 천개
			str += i; //천번의 + 연산자 호
		}
		long end1 = System.nanoTime(); //시스템의 현재 시간(종료 후)
		System.out.println("경과 시간: " + (end1 - start1) + "ns");// ns는 십억의 1초
	
		
//		2. StringBuffer로 동일한 작업 진행 - 성능 향상을 위해 StringBuffer를 사용한다.
		StringBuffer sb = new StringBuffer();
		long start2 = System.nanoTime();
		for (int i = 0; i < 1000; i++) { //숫자 천개
			sb.append(i);
		}
	
		long end2 = System.nanoTime();
		System.out.println("경과시간:" + (end2 - start2) + "ns" );
	
	}

}
