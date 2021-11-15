package ex02_quiz;

import javax.swing.JOptionPane;

public class Quiz05 {
	public static void main(String[] args) {
		
		// 문제. 성별을 의미하는 숫자(정수) 1 ~ 4를 입력받아서
		// "남자", "여자" 를 구분하여 출력하시오
		// 1, 3 "남자" 2, 4 "여자"
		
		//Hint. 홀수는 남자, 짝수는 여자
		// 숫자를 2로 나누었을 때 나머지가 1이면 홀수, 0이면 짝수
		
		String strnumber = JOptionPane.showInputDialog("숫자를 입력하세요");
		int number = Integer.parseInt(strnumber);
		System.out.println(number%2 == 0 ? "여자" : "남자");
		
		/*
		 * 스캐너를 사용하는 방법
		 * Scanner sc = new Scanner(System.in);
		 * syso.print("숫자를 입력하세요 >>>>");
		 * int iGender = sc.nextInt();
		 * 
		 * String gender = iGender % 2 == 0 ? "여자" : "남자";
		 * syso(gender);
		 * 
		 * sc.close() 
		 * 
		 */
		
	}

}
