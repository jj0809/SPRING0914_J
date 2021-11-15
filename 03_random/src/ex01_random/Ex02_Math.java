package ex01_random;

public class Ex02_Math {
	public static void main(String[] args) {
		
		//Math.random(); : 0에서부터 1 사이의 실수
		// 0 <= Math.random() < 1.0
		
		//확률 . 30%의 확률로 비가 온다. 나머지 확률로 비가 오지 않는다.
		System.out.println(Math.random() <= 0.3 ? "비가 온다" : "비가 안온다");
		
		//난수 값. 1 ~ 6 사이 주사위
		/*
		 * Math.random() : 0.0 이상 1.0 미만
		 * Math.random() * 6 : 0.0 이상 6.0 미만
		 * (int)(Math.random() * 6) : 0 이상 6 미만의 정수 등장
		 * (int)(Math.random() * 6) + 1: 주사위 범위
		
		 * 일반적으로..
		 * 원하는 난수 범위 : (int)(Math.random() * 개수) + 시작값
		 */
		
		System.out.println((int)(Math.random()*6)+1);
		
		
	}

}
