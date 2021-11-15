package ex03_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		/*
		 * continue 문
		 * (continue가 소속된)실행중인 loop로 되돌아감, 첨부터 다시해라
		 * break와 상관 없음. 반대되는 개념은 아니다...
		 * 
		 * 
		 * 제외하고 싶은 것을 continue로 처리!
		 * continue = 제외한다.... 
		 */
		
		
		//1. 1 - 10 사이 정수 중 4 - 6만 제외하고 출력
		for (int a = 1; a <=10; a++) {
			if (a>= 4 && a<=6) {
				continue;
			}
			System.out.println(a);
		}

		
		//2. 애들 밥 먹이기
		//김치 빼고 5번 먹이기  -  a--;를 쓰거나 while문 사용
		//김치는 안먹고, 나머지는 모두 먹는 상황
		
		Scanner sc = new Scanner(System.in);
		
		for (int a = 0; a <5; a++) {
			
			//반찬 입력
			System.out.print("먹을 반찬 입력 >>> ");
			String food = sc.next();
			
			//김치인가 아닌가 
			if (food.equals("김치")) {
				System.out.println("매운 거 안 먹어요~!");
				a--; //김치는 안먹었으니까 횟수에서 제외
				continue;
			}
			System.out.println(food + " 냠냐쩝쩝~~!");
		}
		
		// while문으로 김치 빼고 5번 먹이기
    /*	int a = 0;
		while ( a < 5 ) {
			
			//반찬 입력
			System.out.print("먹을 반찬 입력 >>> ");
			String food = sc.next();
			
			//김치인가 아닌가 
			if (food.equals("김치")) {
				System.out.println("매운 거 안 먹어요~!");
				continue;
			}
			System.out.println(food + " 냠냐쩝쩝~~!");
			a++;
		}     */
		
		
		
		
		
		sc.close();
		
	}

}