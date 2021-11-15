package ex02_object_array;
class Person{
	
	//field
		String name;
		int age;
	
		//constructor
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}

		//method
		void info() {
			System.out.println("이름: " + name + ", 나이: " + age + "살");
		}
}//person

public class Ex01_Person {

	public static void main(String[] args) {

		//Person 타입 객체 3개 만드는 방법
		//1. 객체 3개 생성
		//장점: 쉽다 	단점: 반복문 사용이 안된다. 관리가 힘들다.
		Person p1 = new Person("제임스", 20);
		Person p2 = new Person("에밀리", 25);
		Person p3 = new Person("아만다", 30);
		p1.info();
		p2.info();
		p3.info();
		
		//2. 길이가 3인 배열 생성
		
		//1) 길이가 3인 Person 타입의 배열 선언
	//	int[] a = new int[3]; // 일반적인 int 타입 길이 3인 배열
		Person[] p = new Person[3]; 
		//Person이 3 개 생겼다? X
	//	new Person() // 실제 사람 생성
	//	new Person[] ?? 배열만 생겼음
		//실제로 Person의 생성은 생성자를 호출해야만 함..
		
		//2) Person에 저장할 이름과 나이를 각각의 배열에 저장
		String[] names = {"데이빗", "나타샤", "스미스"};
		int[] ages = {40, 45, 50};
		//3) 반복문으로  Person 객체 3개 생성 - 배열 p에 names와 ages 저장
		//p[0] = new Person(names[0], ages[0]);
		//p[1] = new Person(names[1], ages[1]);
		//p[2] = new Person(names[2], ages[2]);
		
		for(int i = 0; i < p.length; i++) {
			p[i] = new Person(names[i], ages[i]);
			p[i].info();
		}
		
		
		
		
		
		
		
		
	}//main

}
