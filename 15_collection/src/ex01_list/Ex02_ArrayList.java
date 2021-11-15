package ex01_list;

import java.util.ArrayList;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		//1. 1~10000 모든 정수를 저장한 ArrayList 2개 생성
		ArrayList<Integer> iList1 = new ArrayList<Integer>();
		ArrayList<Integer> iList2 = new ArrayList<Integer>();
		ArrayList<Integer> iList3 = new ArrayList<Integer>();
		for (int idx = 1; idx <= 10000; idx++) {
			iList1.add(idx);
			iList2.add(idx);
			iList3.add(idx);
		}
		//2. 마지막 요소부터 하나씩 전체 삭제 (나노초 단위로 수행 시간 측정) - 보통
		long start = System.nanoTime();
		for (int idx = iList1.size()-1; idx > -1; idx--) {
			iList1.remove(idx);
		}
		long end = System.nanoTime();
		System.out.println("소요 시간: "+ (end - start));
		
		//3. 첫 번째 요소만 계속 지우는 방법으로 전체 삭제(나노초 단위로 수행 시간 측정) - 제일 느림
		start = System.nanoTime();
		for (int idx = 0, size = iList2.size(); idx < size; idx++) {
			iList2.remove(0); //iList2.remove(idx) 가 아니다!! 첫번째 요소 0 만 지우는거다!! 
		}
		end = System.nanoTime();
		System.out.println("소요 시간: "+ (end - start));
		
		//번외 전체 삭제 - 제일 빠름
		start = System.nanoTime();
		iList3.clear();
		end = System.nanoTime();
		System.out.println("소요 시간: " + (end - start)); 
	}

}
