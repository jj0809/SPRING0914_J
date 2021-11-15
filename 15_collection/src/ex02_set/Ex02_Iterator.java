package ex02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Iterator 인터페이스
 * 1. 컬렉션을 순회할 때 사용함
 * 2. 인터페이스기 때문에 new로 생성할 수 없음
 * 3. 순회할 컬렉션에 iterator() 메소드를 붙여 생성함
 * 4. 인덱스 유무와 상관 없이 사용할 수 있음
 * 
 * 재활용 불가! 한 번 사용하면 더 이상 사용할 수 없음
 * 다시 순회 하려면 컬렉션에 재부착 해야 한다..
 */
public class Ex02_Iterator {

	public static void main(String[] args) {
//		Iterator: 반복자
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 5; i++) {
			set.add((int)(Math.random()*10)+1);
			//중복이 생기면 들어가지 않으므로 몇 개가 얼마나 들어갈 지모름
		}
		
		//반복자 Iterator
		Iterator<Integer> itr = set.iterator(); //itr: set에 넣을 수 있는 손이다..
		
		//손에 잡히는 것이 있으면(hasNext() 메소드).. 꺼내라(next() 메소드)..! ->의 형태로 반복문짜기
		while(itr.hasNext()) {// 손에 잡히는게 잇으면
			System.out.println(itr.next()); //꺼내라
		} //데이터 최대 5개, 최소 1개 나옴 : 3개가 나오면 2번의 중복이 있었다는 얘기가 된다..
		
		//itr 재부착
		itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println("다시 반복 가능~" + itr.next());
		}
	}

}
