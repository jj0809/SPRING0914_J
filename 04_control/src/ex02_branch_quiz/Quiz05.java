package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		/* 문제. 권한을 정수(1-3) 입력받아서 구분하여 출력
		 권한 1: "실행, 쓰기, 읽기"
		 권한 2: "쓰기, 읽기"
		 권한 3: "읽기"
		*/

		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 입력하시오 >>> ");
		int cmd = sc.nextInt();
/* 내 코드
 * 		String auth = "권한 없음";
		
		switch (cmd) {
		case 1: auth = "실행, 쓰기, 읽기"; break;
		case 2: auth = "쓰기, 읽기"; break;
		case 3: auth = "읽기";
		}*/
	
		//샘코드
		switch (cmd) {
		case 1 : System.out.print("실행, "); //break 없음! 
		case 2 : System.out.print("쓰기, ");
		case 3 : System.out.println("읽기");
		}
		  
		//  "권한이 1이면 실행부터 읽기까지 쭉 출력함"
		 
		//System.out.println(auth);
		
		sc.close();
		
	}

}
