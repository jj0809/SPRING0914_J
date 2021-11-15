package ex03_array_quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		/*
		 * 문제. 영한 사전
		 * 4 계절을 영어로 묻고 답하기
		 * 실행 예:
		 * 봄을 영어로 하면? >>> spring
		 * 정답
		 * 여름을 영어로 하면? >>> summer
		 * 정답
		 * 가을을 영어로 하면? >>> fall
		 * 정답
		 * 겨울을 영어로 하면? >>> walter
		 * 오답
		 * 
		 */
		String[][] dictionary = {
				{"봄", "여름", "가을", "겨울"}, //dictionary[dictionary.length-2][j]
				{"spring", "summer", "fall", "winter"} //dictionary[dictionary.length-1][j]
		};
		
		//dictionary.length = 2
		//dictionary[i].length = 4 이고
		//각 항목은 dictionary[0][0] 부터 ~ [1][3] 까지 있으니까 헷갈리지 말 것!!!!
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		for (int i = 0; i < (dictionary.length-1); i++) {
			for (int j = 0; j < dictionary[i].length; j++) {
				System.out.print(dictionary[i][j] + "을 영어로 하면? >>> ");
				answer = sc.next();
				if(answer.equalsIgnoreCase(dictionary[dictionary.length-1][j])) {
					System.out.println("정답");
				}else {
					System.out.println("오답");
				}
			}
		}

		/*//샘코드 - 이게 한글과 영어단어를 짝지어놔서 더 편한듯!!!!!!
		String[][] dic = {
				{"봄", "spring"},
				{"여름", "summer"},
				{"가을", "fall"},
				{"겨울", "winter"}
		};
		//dic[i][0]: "봄" ~ "겨울"
		//dic[i][1]: "spring" ~ "winter"
		 
		//dic.length = 4
		
		for (int i = 0; i < dic.length; i++) {
			System.out.print(dic[i][0] + "을 영어로 하면? >>> ");
			String ans = sc.next();
			if (ans.equalsIgnoreCase(dic[i][1])) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		}
		*/
		sc.close();
	}

}
