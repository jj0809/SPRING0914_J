package ex03_access_modifier;

class Person{
	//field
	private String name;
	private int age;
	private char gender;
	private double height;
	private boolean adult;
	
	//constructor
	public Person() {
		//하는 일 없음. new Person()을 호출할 수 있도록 만들어 둔 것
	}
	public Person(String name, int age, char gender, double height, boolean adult) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.adult = adult;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setGender (char gender) {
		this.gender = gender;
	}
	public void setHeight (double height) {
		this.height = height;
	}
	public void setAdult (boolean adult) {
		this.adult = adult;
	}
	
	
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	public boolean isAdult() { //getAdult 아님 주의~!~!~! 
		return adult;
	}
}//Person


public class Ex03_Person {

	public static void main(String[] args) {
		//1. 이름과 나이만 가진 person
		Person p1 = new Person(); //1번째 생성자 사용
		p1.setName("제임스");
		p1.setAge(20);
		
		
		//2. 모든 걸 가진 person
		Person p2 = new Person("에밀리", 21, '여', 175.2, true); //2번째 생성자 사용
										//이걸쓰면 getter setter 따로 안불러도 되는가봉가..
		System.out.println(p2.getAge());
		//3. 모든 걸 가진 person
		Person p3 = new Person(); //1번째 생성자 사용
		p3.setName("아만다");
		p3.setAge(24);
		p3.setGender('여');
		p3.setHeight(162.5);
		p3.setAdult(true);
		
		
		
		
	}

}
