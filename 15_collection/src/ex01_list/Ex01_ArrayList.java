package ex01_list;

import java.util.ArrayList;
   /* ArrayList */
/* 1. List 인터페이스를 구현(implements) 하는 클래스이다.
 *   1) ArrayList<Integer> iList = new ArrayList<Integer>();
 *   2) List<Integer> iList = new ArrayList<Integer>(); 
 *   -> 의 형태로 작성 가능하다. 2번 형태를 자주 볼 수 있다.
 * 
 * 2. 배열을 사용하기 쉽게 만들어 놓은 클래스이다.
 * 3. 장점: 순차적인 접근이 빠르다. 
 * 4. 단점: 중간 위치에 요소가 추가/삭제 될 때 느림(뒤에 요소들 위치를 변경시켜야 함)
 * 
 * 
 * 예전에는 Vector로 많이 짰었다고 함... 지금은 사용하지 않는다.
 */

public class Ex01_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<Integer>();
		
		//길이 지정 없이 그냥 사용하면 됨
		
		//1. 저장: add() 메소드 사용(iList.add())
		iList.add(10);
		iList.add(new Integer(20));
		iList.add(new Integer("30")); //new Integer() 내에는 문자열도 전달 가능
		
//		=> 10, 20, 30 이 ArrayList 배열에 순차적으로 저장됨
		
		//2. 크기: size() 메소드 사용 (iList.size())
		System.out.println("iList의 크기: " + iList.size()); //3개 저장하여 3 출력
		
		//3. 불러오기: get() 메소드 사용 (iList.get(index번호))
		System.out.println("첫 번째 요소: " + iList.get(0));
		System.out.println("마지막 요소: " + iList.get(iList.size()-1)); 
							//마지막 인덱스는 언제나: 배열의 크기 - 1 <-default로 두고 사용하렴
		//4. 전체 순회하는 for 문
		for (int idx = 0; idx < iList.size(); idx++) {
			System.out.println((idx+1) + "번째 요소: " + iList.get(idx));
		}
		/* int[] a = new int[10]; 는
		 * for (int i = 0; i < a.length; i++)
		 * 
		 * a.length: 필드, 변수 참조
		 * iList.size(): 메소드, 메소드 호출 ==> 성능, 효율이 나쁘다
		 */
		
		//5. 개선된 for문 (size() 메소드 호출 횟수를 1번으로 줄임)
		for (int i = 0, size = iList.size(); i < size; i++) {
			//변수 size를 추가하여 size()메소드 호출 한 번 하여 size 변수에 값 저장
			//효율이 좋아졌음!
		}
		
		//6. 삭제: remove() 메소드 사용 (iList.remove(인덱스번호) / iList.remove(Object o))
		//1) 인덱스 지정 삭제
		iList.remove(0); //인덱스 0의 요소 삭제, 뒤에 있는 내용이 앞으로 땡겨옴
		/* -> 10, 20, 30
		 * *10 삭제*
		 * -> 20, 30
		 */
		//2) 요소 지정 삭제
		iList.remove(new Integer(20)); //요소 20 찾아서 삭제
		
		System.out.println(iList);
		//두 remove 는 동일한 타입이지만 리턴 결과도 다르고 동작 방식도 다르다!
		
		//7. 검색: contains() 메소드 (iList.contains(Object o ))
		if (iList.contains(new Integer(30))) {
			System.out.println("30이 있다");
		}else {
			System.out.println("30이 없다");
		}
		
		//8. 출력
		System.out.println(iList); //[30] 
		
		//9. 초기화 (모두 삭제) clear() 메소드 (iList.clear()) 
		iList.clear();
		
		System.out.println(iList);
	}//main

}
