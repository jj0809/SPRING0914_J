package testPackage;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		 * 커피 메뉴를 입력받아 가격을 알려주는 프로그램 구현
		 * switch 문 이용
		 * 에스프레소, 카푸치노, 카페라떼는 3500원, 아메키라코는 2000원
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 커피 드릴까요? >> ");
		String menu = sc.next();
		sc.nextLine();
		int price = 0;
		
		switch(menu) {
		case "에스프레소": case "카푸치노" : case "카페라떼" : price = 3500;
		System.out.println(menu + "는 " + price + "원 입니다.");
		break;
		case "아메리카노" : price = 2000; 
		System.out.println(menu + "는 " + price + "원 입니다.");
		break;
		default : System.out.println(menu + "는 메뉴에 없습니다."); break;
		}
		
		
		sc.close();
	} //main

}
