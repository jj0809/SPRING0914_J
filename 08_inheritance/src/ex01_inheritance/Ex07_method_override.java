package ex01_inheritance;


//슈퍼클래스
class Pizza{
	//field
	int cheese; //치즈 양
	String dough; //dough... original, thin
	
	//constructor
	Pizza(int cheese, String dough){
		this.cheese = cheese;
		this.dough = dough;
	}
	
	//method
	void info() {
		System.out.println(dough + "("+ cheese + ")");
	}
}//pizza

class BulgogiPizza extends Pizza{
	//field
	String bulgogiOrigin; //불고기원산지
	
	//constructor
	BulgogiPizza(int cheese, String dough, String bulgogiOrigin){
		super(cheese, dough);
		this.bulgogiOrigin = bulgogiOrigin;
	}
	//method
	//피자클래스에 인포 메소드가 있지만 불고기피자 클래스는 인포 메소드를 다시만들어야함(override)
	@Override
	void info() {
		//치즈, 도우, 불고기 원산지 출력
		//치즈와 도우는 이미 피자 클래스 인포 메소드가 처리함
		super.info(); ///<- 피자클래스의 메소드 호출
		System.out.println(bulgogiOrigin);
	}
	
}//bulgogi


public class Ex07_method_override {

	public static void main(String[] args) {
		BulgogiPizza pizza = new BulgogiPizza(100, "오리지널", "국내산");
		pizza.info();
	}

}
