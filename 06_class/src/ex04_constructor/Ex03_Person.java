package ex04_constructor;


class Person{
	//field
	String name;
	String sn; //주민등록번호(-포함)
	int age; //	주민번호 이용해서 자동 계산 (1, 2, 5, 6: 1900년대. 3, 4, 7, 8: 2000년대) 
	char gender; //주민번호로 자동 계산 (1, 3 ,5, 7: 남. 2, 4, 6, 8: 여)
	boolean isKorean; //주민번호로 자동계산 (1, 2, 3, 4: 한국인. 5, 6, 7, 8: 외국인)
	
	//constructor
	Person(String name, String sn){
		this.name = name;
		this.sn = sn;
		//나이 = 현재년도 - 태어난년도
		switch (sn.charAt(7)) {
		case '1': case '2': case '5': case '6': //char이므로 '숫자' 로 작성해야함 
			age = 2020 - 1900 + 1 - Integer.parseInt(sn.substring(0, 2)); break;
		default :
			age = 2020 - 2000 + 1 - Integer.parseInt(sn.substring(0, 2)); break;
		}
		if (sn.charAt(7) % 2 == 0) { //sn.charsAt(7) 가 코드값으로 보관됨..
			gender = '여';
		}else {
			gender = '남';
		}
		//gender = sn.charAt(7) % 2 == 1 ? '남' : '여';
		isKorean = sn.charAt(7) >= '1' && sn.charAt(7) <='4'; //★★★★★★★★★★★★★
	}
	
	
	
	//method
	void print() {
		System.out.println("이름: " + name);
		System.out.println("주민번호: " + sn.substring(0, 8) + "******");
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println(isKorean ? "한국인" : "외국인");
	}
	
	
	
}//class


public class Ex03_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person man = new Person("철수", "951212-1234567");
		Person woman = new Person("영희", "051212-4567891");
		
		man.print();
		woman.print();
		
		/* 이름 : 철수
		 * 주민번호: 951212-1******
		 * 나이: 26세
		 * 성별: 남
		 * 한국인
		 * 
		 */
	}//main

}
