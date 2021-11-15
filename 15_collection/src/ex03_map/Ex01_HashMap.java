package ex03_map;

import java.util.HashMap;
import java.util.Map;

/*
 * HashCode가 어디서 쓰인다~
 * HashMap 클래스
 * : Map 인터페이스를 구현한 클래스
 * : 데이터를 쌍(pair)로 저장하는 클래스
 * - 데이터 구성 (쌍쌍바..)
 *   1) 키(key)		: 중복 저장 불가능 
 *   2) 값(value)	: 중복 저장 가능
 * ex) 1. 아파트 각 호별 인구수
 *     101호 : 3명
 *     102호 : 4명
 *     103호 : 2명
 *     ...
 *     key(일종의 인덱스): value(실제 데이터)
 *     
 *     2. 사전
 *     apple : 사전
 *     banana: 바나나
 *     ..
 *     key   : value
 *     
 *  => JSON 데이터 형식! (나중에 나옴, javascript 때)
 *  
 *   Map <키타입, 밸류타입>
 */

public class Ex01_HashMap {

	public static void main(String[] args) {
		//영한사전 만들기 
			//apple: 사과 ...
		//1. Map <키, 값>
		Map<String, String> dic = new HashMap<String, String>();
		
		//put() 메소드 이용: put(키값, 밸류값);
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("cherry", "체리");
		
		dic.put("apple", "아이폰 만드는 회사"); //기존 apple의 값이 수정됨. 덮어쓰기됨
		
		//2. 요소 가져오기: get(키) 메소드 사용
		System.out.println("apple의 뜻: " + dic.get("apple"));
		
		//3. 삭제: remove(키) 메소드 사용
		dic.remove("cherry");
		
		//4. 포함여부 확인: containsKey(키) 메소드
		if ( dic.containsKey("apple")) { //dic에 apple이 포함되어 있으면
			dic.remove("apple");
		}
		
		//5. 크기: size() 메소드
		System.out.println("dic에 등록된 단어 수 : " + dic.size());
	}

}
