package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		/*
		 * 문제. 비밀번호 "1234"로 가정
		 * 비밀번호를 입력받아서 "1234"와 같으면 "성공"
		 * "1234"가 아니면 다시 입력받음. 
		 * 최대 5번까지 가능함
		 * 최종적으로 "실패"
		 * 
		 */

		/*int pw = 1234;
		int answer;
		int count = 0; */
		Scanner sc = new Scanner(System.in);
		
		/* 나의 코드..
		while (true) {
			System.out.print("비밀번호를 입력하시오 >>> ");
			answer = sc.nextInt();
			count++;
			if (answer == pw) {
				System.out.println("성공");
				break;
			} else if (count >= 5) {
				System.out.println("실패");
				break;
			}
		}
		*/
		
		String pwd = "1234";
		boolean success = false; //boolean 변수 추가.. 성공 안했으니 초기값 false
		//어떤 상태를 의미하는 변수: 플래그 변수
		
		//5번 횟수: 횟수가 정해져 잇어서 for문을 사용하신 듯..
		for (int a = 0; a < 5; a++) {
			
			System.out.print("비밀번호? >>> ");
			String inputPwd = sc.next();
			
			if (pwd.equals(inputPwd)) {
				success = true;
				break;
			}
		}
		
		//5번 입력 끝난 후... 최종~!. 
		//"성공", "실패" 출력
		if (success) { //성공했다면
		System.out.println("성공");
		} else {
		System.out.println("실패");
		}
		
		
		
		sc.close();
		
	}

}
