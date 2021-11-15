package ex02_inheritance_quiz;


//super 클래스
class name {
	//field
	String name;
	//constructor
	name(String name){
		this.name = name;
	}
	name(){
		name = "없음";
	}
	void info() {
		System.out.println("(주인: " + name + ")");
	}
}


//sub 클래스
class Cat extends name{
	//field
	String catname;
	//constructor
	Cat(String catname, String name){
		super(name);
		this.catname = catname;
	}
	Cat(String catname){
		super(); //name(){...} 을 호출 (2번째 생성자), 생략 가능!!!!!!
		this.catname = catname;
	}
	
	@Override
	void info() {
		System.out.print("고양이: " + catname +" ");
		super.info();
	}
} 


public class Quiz01 {

	public static void main(String[] args) {
		//서브 클래스
		Cat cat1 = new Cat("야옹이", "제임스");
		cat1.info();//이름: 야옹이 (주인:제임스)
		Cat cat2 = new Cat("냥냥이");
		cat2.info(); //이름: 냥냥이 (주인: 없음)
	}

}
