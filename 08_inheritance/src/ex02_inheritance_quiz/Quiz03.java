package ex02_inheritance_quiz;
//super
class Elec { //전자제품
	//field
	int watt; //소비전력
	
	Elec(int watt){
		this.watt = watt;
	}
	void info() {
		System.out.println(", 소비전력: " + watt + "w");
	}
}

class Computer extends Elec{
	//field
	String model;
	int price;
	
	Computer(String model, int price, int watt){
		super(watt);
		this.model = model;
		this.price = price;
	}
	@Override
	void info() {
		System.out.print("모델명: " + model + ", 가격: " + price + "만원");
		super.info();
	}
}

//elec의 자손, computer의 자식
class Notebook extends Computer{ 
	
	int battery;
	
	Notebook(String model, int price, int battery, int watt){
		super(model, price, watt);
		this.battery = battery;
	}
	@Override
	void info() {
	//	super.info();
		System.out.print("배터리 용량: " + battery + ", ");
		super.info();
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Computer com = new Computer("알라딘", 200, 500); //모델명, 가격, 소비전력
		com.info(); //모델: 알라딘, 가격: 200만원, 소비전력: 500w
		
		Notebook note = new Notebook("GRAM", 150, 80, 400);
		note.info(); //모델: GRAM 가격: 150만원 배터리용량 80w 소비전력 400w
	}

}
