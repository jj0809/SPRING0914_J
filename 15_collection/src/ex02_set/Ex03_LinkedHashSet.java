package ex02_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03_LinkedHashSet {

	public static void main(String[] args) {
		//LinkedHashSet 클래스는 저장된 요소들의 순서가 유지된다.
		//HashSet이랑 다르네용
		Set<String> set = new LinkedHashSet<String>();
		
		//추가: add() 메소드 사용
		set.add("banana");
		set.add("apple");
		set.add("cherry");
		
		//Iterator 클래스를 이용한 순회
		Iterator<String> itr = set.iterator();
		//Iterator의 <E> 타입은 붙일 Set과 동일한 타입으로 정하라
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		//15,16,17 라인순서대로 출력됨
		
		//오늘 배운 내용들은 모두 객체를 만들어 저장할 때 쓰면 훨씬 편한데.. 아직 안하구 있음
		//이제 퀴즈를 통해서 할 예정.......
		
		
	}

}
