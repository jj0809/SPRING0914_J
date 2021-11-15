package ex04_hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Member{
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	
// 사용자가 hashCode() 메소드를 만들면 Object클래스의 hashCode() 메소드는 사용되지 않음
	//=> 오버라이드 하겠다는 말
	
	@Override
	public int hashCode() {
	//	return 1; //모든 멤버의 해시값이 1이므로 같은 멤버일 가능성 있다고 판단함 (최악의 해시코드가 된다)
//		return id.length();	//id의 길이가 같으면 같은 해시코드로 묶임.. 글자수가 같으면 비교해보겟다! 여기선 '3'
		return id.charAt(0); //id의 첫번째 글자가 같으면 같은 해시코드로 묶음 좀더 세분화되어 찾기 더 수월해짐
	}// Step 1 통과
	//해시코드 결과가 같으면 Step 2 equals() 메소드를 호출해서 같은지 비교함
	//cf: equals를 우리가 만들지 않으면 Object의 eqauls를 사용함.. (주소비교, 서로 다름)
	
	//equals() 메소드를 만들면 Object 클래스의 equals()는 사용되지 않는다.
	@Override
	public boolean equals(Object obj) { //m1.equals(m2) 매개변수를 Member 로 바꾸면안돼요? 안됨. 오버라이드가 아니게 됨
		//this의 id와 obj의 id를 비교
		//this = m1, obj = m2 임
		return this.id.equals( ((Member)obj).id );
	}// 여기까지 하면 56라인 결과가 1개로 등장
	
	//소스에 제너레이트 hashCode, equals 있음!
	
}

public class Ex02_HashSet {

	public static void main(String[] args) {
		/* HashSet 클래스는 중복 저장이 불가능
		 * HashSet의 중복 체크 방법
		 * Step 1: HashCode 값을 비교한다. (HashCode 값이 같을 경우 같은 객체일 가능성 있음)
		 * Step 2: equals로 비교한다
		 */
		
		Member m1 = new Member("abc");
		Member m2 = new Member("abc");
		Member m3 = new Member("xyz");
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(m1);
		set.add(m2); 	//동일한걸 2개 넣었다
		System.out.println(set); //2개 등장... 왜냐면 둘의 주소(해시코드)가 다르기 때문..
		
		/*사용자정의 클래스의 주소값 확인: hashCode (object의 hashCode임)
		사용자가 만든 클래스는 HashCode 안만들면 없고 그러면 object의 hashCode를 사용한다
		기존에 존재하던 애들이 중복 처리가 된 것은 이미 구현되어 있었기 때문이고,, 사용자 정의는 내가 구현해야한다..
		*/
		
		/* HashMap 의 활용
		 * 회원(Member)별 포인트(Integer) 관리
		 */
		
		Map<Member, Integer> map = new HashMap<Member, Integer>();
		
		map.put(m1, 5000); //m1의 포인트 5000
		map.put(m1, 6000); //m1의 포인트를 6000으로 수정
		map.put(m3, 10000);
		
		System.out.println(map); //2개 나옴 6000짜리, 10000짜리
		
		//Hash가 들어가는 애들은 다 똑같다...
		
		
		
	}

}
