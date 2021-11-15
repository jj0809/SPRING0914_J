package ex02_quiz;

import java.util.Random;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 문제. 아이템 획득하기
		// 10% 확률로 "전설 아이템", 나머지 확률로 "영웅 아이템" 출력하기
		
		Random rand = new Random();
	//	int rand1 = rand.nextInt(99)+1;
		//double rand2 = rand.nextDouble();
		//String stritem = rand1 >= 10 ? "영웅 아이템" : "전설 아이템";
		String stritem2 = rand.nextDouble() >= 0.1 ? "영웅 아이템" : "전설 아이템";
		
	//	System.out.println(rand2 + "%의 확률로 \"" + stritem2 + "\"을 획득하였다");
		System.out.println(stritem2);
		
	}

}
