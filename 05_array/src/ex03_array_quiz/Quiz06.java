package ex03_array_quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		/*
		 * 문제. 5명의 키를 입력받아서 가장 큰 키를 가진 사람의
		 * 이름을 출력하시오
		 * 실행 예)
		 * james의 키 입력 >>> 155.5
		 * alice의 키 입력 >>> 185.3
		 * amanda의 키 입력 >>> 158.3
		 * jessica의 키 입력 >>> 167.2
		 * emily의 키 입력 >>> 185.2
		 * 
		 * 가장 키가 큰 사람은 alice 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		String[] name = {"james", "alice", "amanda", "jessica", "emily"};
		double[] height = new double[name.length];
		double max = 0; 
		/* 내꺼
		int n = 0;
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+ "의 키 입력 >>> ");
			height[i] = sc.nextDouble();
			
			if(max < height[i]) {
				max = height[i];
				n = i;
			}
		}
		System.out.println("가장 키가 큰 사람은 "+ name[n] + "입니다.");
		*/
		
		String result = null;   //내꺼랑 여기가 다름... 이름을 보관하거나, 번호를 보관하거나~
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 키를 입력 >>> ");
			height[i] = sc.nextDouble();
			
			if(max < height[i]) {
				max = height[i];
				result = name[i]; 
			}
		}

		System.out.println("가장 키가 큰 사람은 "+ result + "입니다.");
		
		sc.close();
		
	}//main end

}
