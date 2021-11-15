package ex02_set;

import java.util.HashSet;
import java.util.Set;

/* Set
 * 순서 없는 자료구조: index, 즉 순서가 없음 - for 문 사용할 수 없음
 * 중복 없음: 중복이 들어갈 수 없는 '유니크'한 특징을 가짐
 */

/* HashSet 클래스
 * - set 인터페이스를 구현한 클래스
 * - set 인터페이스의 특징을 물려받음
 *    1) 순서 없음
 *    2) 중복 저장 불가 '유니크하다'
 * - HashSet 클래스의 중복 판단 원리
 *    1) hashcode() 비교: 혹시 저장하려는 데이터가 set에 저장된 요소들과 같은 주소를 가지진 않았는지
 *       (1) 값이 같으면 중복 가능성 있음. 1차 판단 -> 2) 호출
 *       (2) 값이 다르면 중복 가능성 없음.
 *    2) eqauls() 비교: 동등 비교. 진짜로 같은가
 * 
 * 
 * equals: 값 비교하는 메소드
 * hashcode 값: 코드값... = 주소값
 *  
 */

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//1. 추가: add() 메소드
		set.add("java");
		set.add("DB");
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("jsp");
		set.add("spring");
		set.add("java");	//중복
		set.add("css");		//중복
		
		//순서가 없어 for문 순회가 안되는데 순회를 어떻게 하지?
		//2. 순회 - 향상 for문
		for (String course : set) { //set에서 하나씩 꺼내 course로 옮긴다
			System.out.println(course); 
		}
		//인덱스 지정이 없어 쓰는데 전혀 지장이 없다.
		//출력 순서는 입력 순서와 전혀 상관 없음
	}

}
