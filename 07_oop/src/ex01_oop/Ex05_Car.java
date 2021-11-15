package ex01_oop;

class Engine{
	//field
	String type; //가솔린, 디젤
	int cc; //배기량
	int hp; //마력
	//constructor
	Engine(String type, int cc, int hp){
		this.type = type;
		this.cc = cc;
		this.hp = hp;
				
	}
	//method
	void info() {
		System.out.println(", 유형: " + type + ", 배기량: " + cc + ", 마력: " + hp);
	}
}
class Car{
	//field
	String model;
	Engine engine;
	double fuelEfficiency; //연비
	//constructor
	Car(String model, Engine engine, double fuelEfficiency){
		this.model = model;
		this.engine = engine;
		this.fuelEfficiency = fuelEfficiency;
	}
	Car(String model, String type, int cc, int hp, double fuelEfficiency){
		this.model = model;
		this.engine = new Engine(type, cc, hp);
		this.fuelEfficiency = fuelEfficiency;
	}
	//method
	void info() {
		System.out.print("모델명: " + model + ", 연비: " + fuelEfficiency);
		engine.info();
		
	}
	
	
}

public class Ex05_Car {

	public static void main(String[] args) {
		//2개의 자동차를 생성하시오.
		Engine engine = new Engine("가솔린", 3000, 260);
		Car car1 = new Car("e-class", engine, 10.5);
		Car car2 = new Car("530i", "가솔린", 3000, 260, 10.5);
		car1.info();
		car2.info();
	}

}
