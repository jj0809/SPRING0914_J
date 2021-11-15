package ex02_api;

import java.util.Arrays;
//api: application programing interface
public class Ex01_System {

	public static void main(String[] args) {
//		1. 시스템 현재 시간(밀리초) 반환
//		1970년 1월 1일 부터 측정되기 시작한 시간
		System.out.println("현재 시간: " + System.currentTimeMillis() + "밀리초");
//		밀리초: 천분의 1 초. 1초 = 1000밀리초 
	
//		2. 시스템 현재 시간 (나노초) 반환
//		자바가 결정한 어느 시점 이후로 측정.. 언제부터 쟀는지 모름
//		측정용으로 사용됨 - 얼마나 시간이 지났는지 타임기록
//		currentTime도 측정용으로 사용될 수 있지만 나노타임은 오직 측정용으로만 사용됨
		System.out.println("현재 시간: " + System.nanoTime() + "나노초");
//		나노초: 10억분의 1 초
		
//		배열 복사
		int[] src = {1, 2, 3, 4, 5};
		int[] dest = new int[10];
		
//		des : 0 0 0 0 0 0 0 0 0 0 를
//		des : 0 0 1 2 3 4 5 0 0 0 로 만들기
//		for문을 이용한 복사
//		for (int i = 0; i < src.length; i++) {
//			dest[i + 2] = src[i];
//		}
		System.arraycopy(src, 0, dest, 2, src.length);
//		src 0번부터 dest의 2번으로 src.length만큼(5개) 복사해라
//		출력
		System.out.println(Arrays.toString(dest));
		
//		4. 시스템 종료
		//System.exit(0);
		
		
//		문제. i++를 20억번 실행하는데 걸리는 시간을 초 단위로 출력
//		정밀한 시간은 나노타임, 대충 할 때는 커런트타임
		long start = System.nanoTime();
		System.out.println(start);
		for (int i= 0; i <2000000000; i++) ;
//		for문 본문 없을 때 세미콜론 붙이면 된다..
		long end = System.nanoTime();
		System.out.println(end);
		double total = (end - start) / 1000000000.0;
		System.out.println(total + "초");
	}

}
