package ex03_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex02_HashMap {

	public static void main(String[] args) {
		//어떤 사람의 정보(이름, 나이, 키, 성별)를 Map으로 생성
		Map<String, String> person = new HashMap<String, String>();
		
		person.put("name", "alice");
		person.put("age", 20 + "");
		person.put("height", 175.5 + "");
		person.put("gender", "여");
		
		//Map의 또 다른 용도 : 클래스, 객체 대신 간단하게 사용 가능
		//맵으로 만든 person데이터와 클래스 안에 데이터 넣어서 만든 객체랑은 DB에서 똑같이 취급됨.. K 값이 필드로 처리됨
		
		/* 순서가 없어서 일반 for문으로 순회를 할 수 없엉..
		 * */
		
		
		//순회1. keySet() 메소드 .. 골치아파..
		//1. key 만 뺀다
		//2. key들은 Set을 저장해야만 한다..(?) key는 set으로 저장한다..?
		//3. get()메소드에 Set에서 뺀 키를 전달하면 value가 나온다.
		
		//1) Iterator 
		Set<String> set = person.keySet(); //set에 현재 저장된 것 = ["name", "age", "height", "gender"]
		//person에서 key만 빼서 또 다른 set으로 저장한 것
		//이 set에서 key 하나씩 꺼내기
		Iterator<String> itr = set.iterator(); //iterator는 new가 아니다, set에서 데이터 꺼낼 손 itr
		//set에 있는거 꺼낼 때는 itr을 써야한다
		
		while(itr.hasNext()) { //잡히는게 뭐가 있는지
			String key = itr.next(); //있음 꺼내셈.. itr.next() = "name" -> "age" -> .. 식으로 바뀜 (순서는 모름) 
																// ==> itr.next() == key
			String value = person.get(key);
			System.out.println(key + ": " + value);
		}
		
		// 2) 향상 for
		for (String key : person.keySet()) {
			String value = person.get(key);
			System.out.println(key + ": " + value);
		}
		
		/* 순회 2. entrySet() 메소드
		 * entry: key 와 value 를 묶어 부르는 말. (person은 entry 4묶음 있음)
		 * entry로 key 뺀 다음 getKey로 키 빼고 get value로 값 얻고 할 수 있음..
		 * key: getKey() 메소드로 키 뺀다
		 * value: getvalue() 메소드로 value 얻는다
		 */
		// 1) 향상 for문
		for (Map.Entry<String, String> entry : person.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		} 
		// 2) Iterator
		Set<Map.Entry<String, String>> set2 = person.entrySet();
		Iterator<Map.Entry<String, String>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) itr2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
				
	}

}
