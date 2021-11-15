package ex05_Quiz;

import java.util.HashSet;
import java.util.Set;

//문제. 로또 발생기
//HashSet 클래스를 이용해서 당첨 번호 6개만 생성하시오
//(math.random으로 생성된 거 저장을 HashSet으로 하시오)

//랜덤 생성 -> HastSet에 저장

public class Quiz02 {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		//2가지 방법..
		//6번 생성 -> 6개가 아니면 다시 생성
		//6개가 아니면 계속 생성
//		lotto.add((int)(Math.random()*45+1));
//		lotto.add((int)(Math.random()*45+1));
//		lotto.add((int)(Math.random()*45+1));
//		lotto.add((int)(Math.random()*45+1));
//		lotto.add((int)(Math.random()*45+1));
//		
//		System.out.println(lotto); //lotto는 int들의 집합으로 주소가 저장되는 것이 아니어서 toString 필요 없다
		
		while(lotto.size() != 6) {
			lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(lotto); //lotto는 int들의 집합으로 주소가 저장되는 것이 아니어서 toString 필요 없다
	}

}
