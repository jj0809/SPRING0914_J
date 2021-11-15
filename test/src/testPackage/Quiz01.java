package testPackage;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		//이름(문자열), 나이(정수), 키(실수), 성별(문자)을 입력받아 출력하는 프로그램을 구현하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.next(); sc.nextLine();
		System.out.print("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 >>> ");
		double height = sc.nextDouble();
		System.out.print("성별을 입력하세요 >>> ");
		String gender = sc.next();
		
		System.out.print(name +", " + age + ", " + height + ", " + gender);
		sc.close();
	}

}
