package ex04_quiz;

interface Eatable{} //먹을 수 있는 음식에 interface 구현하여 구분하는 역할..

//superclass
class Food{
	//field
	private String foodName;
	private int foodKcal;
	//constructor
	public Food(String foodName, int foodKcal) {
		this.foodName = foodName;
		this.foodKcal = foodKcal;
	}
	//method - getter setter는 사용 여부를 떠나서 모두 추가해준다.
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodKcal() {
		return foodKcal;
	}
	public void setFoodKcal(int foodKcal) {
		this.foodKcal = foodKcal;
	}
//	public void eat(){ //문구를 여기에..... 넣는다.......
	//	System.out.println( foodKcal + "칼로리 " + foodName + "먹는다 옴뇸뇸");
		//여기 안넣어두 되는데 그러면 밑에 eat에서 캐스팅해야해서 불편함..
	//}
}//food


class Apple extends Food implements Eatable{ //상속 먼저 구현 나중
	public Apple(String foodName, int foodKcal) {
		super(foodName, foodKcal);
	}
}
class Burger extends Food{ //먹을 수 없음. implements 하지 않음
	public Burger(String foodName, int foodKcal) {
		super(foodName, foodKcal);
	}
}

class Person{
	//field
	private String name;
	private int calorie;
//	private Food food;
	public Person(String name) {
		super();
		this.name = name;
	}
	//method
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getCalorie() {
		return calorie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void eat(Eatable food) { //Eatable 인터페이스를 구현한 것 만 eat이 가능함
//		((Food)food).eat(); //eatable 타입이므로 Food 타입으로 캐스팅!!!!!!!!! 
		System.out.println(((Food)food).getFoodKcal() + "먹는당 옴뇸뇨");
		setCalorie(this.calorie + ((Food)food).getFoodKcal());
	}
	public void info() {
		System.out.println(this.name + " 현재 " + this.calorie + "kcal");
	}
}
public class Quiz03 {
	
	public static void main(String[] args) {
		Person p = new Person("제시카");
		p.setCalorie(300);
		p.info(); //제시카 칼로리: 현재 300kcal
		
		p.eat(new Apple("청송 사과", 200)); //200칼로리 청송사과 옴뇸뇸
		p.info(); //제시카 칼로리: 현재 500kcal
		
	//	p.eat(new Burger("빅맥", 1000)); //못 먹게 막기
	}

}
