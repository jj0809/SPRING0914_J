package ex04_hash;

class User{
	
}

public class Ex01_HashCode {

	public static void main(String[] args) {
		
		//내장 클래스들은
		//각자 나름의 hashCode가 있다.
		Integer a = new Integer(10);
		System.out.println(a.hashCode()); //integer의 hashcode
		
		String b = new String("apple");
		System.out.println(b.hashCode()); //String의 hashcode 다름, 눌러서 확인해보기
		
		Double c = new Double(1.5);
		System.out.println(c.hashCode());
		
		
		//사용자 정의 클래스의 hashCode() 값은 
		//객체가 저장된 주소값이다. 
		User user = new User();
		System.out.println(user.hashCode()); // => 여기만 주의깊게 보면 된다
		
	}

}
