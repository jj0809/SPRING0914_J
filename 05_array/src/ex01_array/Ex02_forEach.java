package ex01_array;

import java.util.Scanner;

public class Ex02_forEach {

	public static void main(String[] args) {
		
		/*
		 * 일반 for문
		 * for (int i = 0; i < a.length; i++) 
		 *     배열 요소: a[i]
		 * 향상 for문 - 배열에서 사용하는 특수한 for문
		 * for (int n : a) ... 알아서 해줌
		 *     배열 요소 : n
		 * 
		 */
		
		//향상 for문 (for-each)   //JavaScript에서 반복문의 이름 each... 나중에 배운다..
		int[] a = new int[5];
		for (int n : a) {
			System.out.println("배열의 요소: " + n);
		} 
		
		//향상 for문으로 배열에 데이터 저장
		for (@SuppressWarnings("unused") int n : a) {
			n = 10;   //배열의 요소에 10을 모두 저장..?
		} //배열이 아닌 n이라는 변수에 10을 저장하게 됨, 배열의 요소는 변화 없음...
		//향상 for문으로 모든 배열 for문을 대체할 수는 없음
		
		//저장된 내용 확인
		for (int n : a) {
			System.out.println("배열의 요소: " + n);
		}
		
		// 배열 요소의 읽기용 : 향상 for문
		// 배열 요소의 쓰기용 : 일반 for문 ... 둘 다 읽을 줄 알아야 함
		
		// 문제. 취미를 3개 입력 받아서 
		// hobbies라는 배열에 저장하고 출력
		
		Scanner sc = new Scanner(System.in);
		//입력 (쓰기: 일반 for문)
		String[] hobbies = new String[3];
		for (int i = 0; i < hobbies.length; i++) {
			System.out.print((i+1) + "번째 취미를 입력하시오 >>> ");
			hobbies[i] = sc.next();
		}
		//출력 (읽기: 향상 for문)
		for (String n : hobbies) {
			System.out.println(n);
		} //i+1번째는 i가 없어서 당연히 안됩니다.. 어쩔 수 없습니다.

		
		
		sc.close();
		
	}

}
