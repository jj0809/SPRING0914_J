package ex01_oop;

//삼항연산자를 통해서도 풀 수 있을 것!

class Driver {
	//field
	String name;
	
	Driver(String name){
		this.name = name;
	}
}//driver

class Bus{
	//field
	Driver driver;
	int speed;
	final int FULL_SPEED = 80;
	//constructor
	Bus(Driver driver){
		this.driver = driver;
	}
	//method
	void speedUP (int speed) {
		if( speed < 0 ) {
			return; //0 이 추가될 경우 아예 거르는 방법
		}
		if(this.speed + speed <=FULL_SPEED) {
			this.speed += speed;
		//	System.out.println("현재 속도" + this.speed + "km/h");
		}else {
			this.speed = FULL_SPEED;
		//	System.out.println("현재 속도" + this.speed + "km/h");
		}
		System.out.println("현재 속도" + this.speed + "km/h"); //합쳐서 일케 해두 댐
	}
	void speedDown (int speed) {
		if (speed <= 0) {
			return;
		}
/*방법1	if(speed - this.speed <= 0) {
			this.speed -= speed;
		}else {
			this.speed = 0;
		} */
		this.speed -= speed;
/*방법2	if (this.speed < 0) {
			this.speed = 0;
		} */
//방법3
		this.speed = this.speed < 0 ?  0: this.speed;
		System.out.println("현재 속도" + this.speed + "km/h");
	}
	
	
}//bus
public class Ex07_Bus {

	public static void main(String[] args) {
		
		Driver driver = new Driver("김기사");
		Bus bus = new Bus(driver); //버스의 속도 0;
		
		bus.speedUP(50); //현재 속도 50km/h
		bus.speedUP(50); //현재 속도 80km/h
		
		bus.speedDown(50); //현재속도 30km/h //출력물이 생기므로 void 작성..
		bus.speedDown(50); //현재속도 0km/h
		

	}//main

}
