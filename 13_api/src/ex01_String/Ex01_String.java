package ex01_String;

public class Ex01_String {

	public static void main(String[] args) {
		/* 스트링 복습 및 추가 내용 */
		
		//1. 동일한 문자열 리터럴은 자바에 의해 최적화 된다.
			//리터럴: 표기법.. 정수는 그냥 적고 실수는 . 을 적고 문자는 'A'라고 적는 법
		//하나의 문자열 리터럴만 생성해서 사용한다.
		String a = "apple";
		String b = "apple";
		System.out.println(a == b); 	//true
		
		//2. new는 무조건 새로 생성된다.
		String c = new String ("banana");
		String d = new String("banana");
		System.out.println(c == d); 	//false
		
		//3. == 참조 값(주소값) 을 비교한다.
		//내용 비교: equals, equalsIgnoreCase 메소드를 사용함
		System.out.println(a.equals(b)); //true
		System.out.println(c.equals(d)); //true
		
		//4. 문자열의 길이는 length 메소드를 이용한다.
		System.out.println("apple은 " + a.length() + "글자이다.");
		
		//5. 문자열의 특정 문자는 charAt 메소드를 이용한다.
		System.out.println("apple의 첫 번째 글자는 " + a.charAt(0) + "이다");
		
		//6. 문자열에서 특정 문자열만 추출할 때는 substring 메소드를 이용한다.
		//- substring 사용법 두 가지 - 인덱스는 항상 0부터 시작함
		//substring(시작인덱스) : 시작인덱스부터 끝까지 추출
		//substring(시작인덱스, 끝인덱스) : 시작인덱스<=부터 끝인덱스 전<까지 추출
		System.out.println("a의 3번째 철자부터 끝까지: " + a.substring(3));
		System.out.println("a의 1번째 철자부터 4번째 철자 전까지: " + a.substring(1, 4));
		
		//7. 특정 문자(문자열)의 인덱스를 반환하는 indexOf 메소드
		//제일 처음으로 나온 문자(문자열)의 인덱스가 반환된다. 
		//indexOf(찾을문자) : 처음부터 검색
		//indexOf(찾을문자, 시작인덱스): 찾을 문자를 시작인덱스부터 검색
		String str = "best of best of best";
		System.out.println("첫 번째 best 인덱스: " + str.indexOf("best")); //0
		System.out.println("두 번째 best 인덱스: " + str.indexOf("best", 1)); //1부터 8까지 모두 가능
		//두 번째 best를 찾고 싶은데
		//만약 첫 번째 best가 언제 나오는지 모르는 경우: 첫 번째 best 인덱스 다음부터 검색할 것...
		System.out.println("두 번째 best 인덱스: " + str.indexOf("best", (str.indexOf("best")+1)));
		//첫번째 bestOf 위치 다음(+1)부터 best 찾기
		
		//8. 거꾸로 찾는 lastIndexOf 메소드
		System.out.println("마지막 best의 인덱스: " + str.lastIndexOf("best"));
		
		//9. 문자열 '앞뒤'의 white space(공백 문자)를 제거하는 trim 메소드
			//중간에 있는 공백은 제거하지 않음!
		String name = "  james "; //공백이 섞인 이름
		System.out.println("name의 글자수(공백포함) " + name.length()); //공백 포함 8자
		System.out.println("name의 글자수(공백제거): " + name.trim().length()); //공백제거 5자 
		
		//10. String으로 변경하는 toString 메소드
		Integer n = new Integer(10); //객체 n(정수)
		System.out.println(n.toString()); //n.toString()의 결과타입: String, 내용은 그대로 10
		System.out.println(n.toString().substring(1)); //string에서 쓸 수 있는 모든 메소드를 사용할 수 있음
		System.out.println(n.toString().equals("10"));//true n이 스트링이 되어 equals 사용 가능
		
		
		

		//문제. 파일명을 파일명과 확장자로 분리해서 저장하기
		//apple.jpg <- . 으로 구분하기
		String fullName = "apple.jpg"; //파일 이름에 . 사용 가능하므로 마지막 인덱스만 활용하세요!!!!
		String fileName = fullName.substring(0, fullName.lastIndexOf('.'));
		String extName = fullName.substring(fullName.lastIndexOf('.')+1);
		System.out.println(fileName + "." + extName);
		
	}
	

}
