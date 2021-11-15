package ex02_interface;

class Pet{
	//field
	private String name;
	//constructor
	public Pet(String name) {
		super();
		this.name = name;
	}
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void feed(String food) {
		System.out.println(name + ", " + food + "먹는다.");
	}
	
}
interface Walkable{
	/*산책할 수 있는 Pet 들에게 Walkable 인터페이스를 구현하자..
	 *Walkable 인터페이스를 구현한 Pet 들은 타입이 2개가 된다.
	 * 1) Pet 2) Walkable
	 * 
	 * => Walkable 인터페이스를 구현하지 않은 Pet은 타입이 1개... Only Pet
	 */
	
	//구현을 할 때 오버라이드를 해야하는데
	//여기는 지금 내용이 없어서 오버라이드를 할 필요가 없음..........?
	
}

class Dog extends Pet implements Walkable{ //산책할 수 있으면 implements Walkable
	//constructor
	public Dog(String name) {
		super(name);
	}
	
}

class Turtle extends Pet{ //얘는 산책 못하니까 implements Walkable 작성하지 않음
	//constructor
	public Turtle(String name) {
		super(name);
	}
}

//Pet을 Walkable 가능한 펫과 그렇지 않은 펫으로 구분할 수 있음.. 인터페이스의 활용 방안 중 하나

class Person{
	//method
	public void feed(Pet pet, String food) {
		pet.feed(food);
	}
	/*내가 만든거였는데 원하는 바가 이게 아니었나봄... 유지보수 귀찮은 방법..ㅎㅎ...
	 * public void walkingWithPet(Pet pet) { //Dog는 되고 Turtle은 안되게..
		if (pet instanceof Turtle) {
			return;
		}else {
			System.out.println(pet.getName() + "랑 산책하기");
		}
	}*/
	public void walkingWithPet(Walkable pet) { //Dog는 되고 Turtle은 안 되게..
		System.out.println( ((Pet)pet).getName() + "랑 산책하기"); //Walkable 때문에 적용이 안되서 캐스팅..
	}
}
public class Ex04_Walkable {

	public static void main(String[] args) {
		Person p = new Person();
		Dog dog = new Dog("멈머");
		Turtle turtle = new Turtle("꼬부기");
		p.feed(dog, "닭가슴살"); 
		p.feed(turtle, "상추");
		
		p.walkingWithPet(dog); 
 //		p.walkingWithPet(turtle); //실행 안되도록 처리 
	}

}
