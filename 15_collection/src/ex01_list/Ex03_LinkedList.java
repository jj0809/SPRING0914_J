package ex01_list;

import java.util.LinkedList;
import java.util.List;

/* LinkedList
 * 1. List 인터페이스를 구현한 클래스
 * 2. 연결리스트를 만들어 놓은 것
 * 3. 각 요소들이 링크를 이용해 연결되어 있음
 * 4. 장점: 모든 위치에 추가/삭제가 빠름
 * 5. 단점: 전체 순회가 느림(for문 돌릴 때)
 * 
 * 이외 ArrayList와 사용법이 동일함.... List 인터페이스(동일한 인터페이스)를 구현했기 때문
 */

public class Ex03_LinkedList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("james");
		list.add(new String("amanda")); // 이렇게 넣어도 상관 없음. 차이 없음
		list.add("alice");
		if (list.contains("samanda")) {
			System.out.println("samanda가 있다");
		}else {
			System.out.println("samanda가 없다");
		}
		list.remove(0); //첫 번째 요소 james 삭제
		list.remove("alice"); //alice 삭제
		
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.println(list.get(i)); //요소 출력
		}
//		System.out.println(list); //[전체 출력]
		
	}//main
	

}
