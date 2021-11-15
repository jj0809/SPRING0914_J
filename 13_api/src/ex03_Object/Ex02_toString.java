package ex03_Object;

/*
 * toString: 뭐든 String으로 바꿔준당
 */




public class Ex02_toString {

	public static void main(String[] args) {
		Integer money = 1_000_000;
		System.out.println("money의 글자수: " + money.toString().length());
//		글자 수 => length 메소드 (= String 클래스 소속) 
		
		int len = money.toString().length();
		System.out.println("글자 수: " + len + "자");
		
		/* Object - toString
		 *  ↑(상속)
		 * Integer - toString : 메소드 오버라이드
		 * 
		 * String도 Object를 상속, toString 메소드를 가짐
		 * 거의 모든 클래스에 toString이 있다. toString의 기능은 모두 문자열로 바꿔주는 것이다
		 * 그런데 클래스마다 활용하는 방법이 조금 다르다(?)
		 * 모든 클래스는 문자열로 바꿀 때 toString을 사용해야 한다!
		 * Object의 toString을 쓰지는 않고(이상한거 나온다고 함) 각자 오버라이딩 되어있는 toString을 사용함
		 * 
		 *   우클릭 - Source - Generate toString()...있음! 편하게 오버라이딩 하자!
		 *   
		 * (equals, hashCode도 마찬가지)
		 */
		
		
	}

}
