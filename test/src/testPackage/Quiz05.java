package testPackage;

import java.util.Scanner;

class RandomGenerator{
	
	//field
	int[] range;
	
	RandomGenerator(int leng){
		range = new int [leng];
		for (int i = 0; i < range.length; i++) {
			range[i] = (int)(Math.random() * 99) + 1;
			for(int j = 0; j < i; j++) {
				if (range[i] == range [j]) {
					range[i] = (int)(Math.random()*99) +1;
				}
			}//FOR2
			System.out.print(range[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	
}//randomgenerator
public class Quiz05 {

	public static void main(String[] args) {
		/*
		 * 난수를 발생시키는 RandomGenerator 클래스를 생성하시오
		 * 사용자로부터 배열의 길이를 입력받아서 ( 0 < 길이 < 100)
		 * 해당 길이를 가진 int 타입 배열을 생성하시오
		 * 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하시오
		 * 같은 값은 생성하지 못하도록 설정하고 생성된 배열을 출력하시오
		 * 중복 방지 대책은 생성된 랜덤 값이 기존에 생성된 적이 있는지 검사해서
		 * 생성된 적이 있다면 다시 생성하는 방식으로 진행하시오
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("배열의 길이를 입력하시오 >> ");
		//int leng = sc.nextInt();
		RandomGenerator r = new RandomGenerator(10);
		sc.close();
	}//main

}
