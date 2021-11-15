package ex01_user_type;

/*
 * 클래스 person
 * 이름, 나이, 성별, 키, 성인 유무(나이 20이상: 성인)
 */

class Person {
	String name;
	int age;
	String gender; //한 글자는 char gender;  - 코드값 0(널 문자'\0')으로 초기화 - 출력해도 눈에 안보임..
	double height;
	boolean adult;
	
}

public class Ex03_person {
	public static void main(String[] args) {
		Person jessie = new Person();
		jessie.name = "jessie";
		jessie.age = 20;
		jessie.gender = "여자";
		jessie.height = 160.3;
		jessie.adult = jessie.age >= 20;
		
		System.out.println(jessie.name);
		System.out.println(jessie.age);
		System.out.println(jessie.gender);
		System.out.println(jessie.height);
		System.out.println(jessie.adult ? "성인" : "미성년자");
		
	}

}
