package ex03_access_modifier;


class Computer{
	//field (private)
	private String model;
	private String manufacturer;
	private int price;
	
	//constructor 생략
	
	//method - 메소드는 모두 퍼블릭
	 //setter는 메소드의 일종이므로 여기서 작업
	 //setters
	public void setModel(String model) {
		this.model = model;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setPrice(int price) {
		if (price < 0) {
			return; //이렇게.. 제한을 걸 수 있음...
		}
		this.price = price;
	}
	 //getters
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getPrice() {
		return price;
	}
	
	//getter와 setter의 이름 형식 꼭 지켜서 사용할 것
}

public class Ex01_Computer {

	public static void main(String[] args) {
		
		//Computer 클래스 타입의 객체 myCom 생성
		Computer myCom = new Computer();
		
		//Computer 클래스 외부에서는 private (field)에 접근 불가
	//	myCom.model = "GRAM";
	//	myCom.manufacturer = "LG";
	//	myCom.price = 180;
		//ㄴ 필드 수정 작업에 해당하므로 setter를 통해서 다시 작성해야함.. method로 이동
		
		myCom.setModel("gram");
		myCom.setManufacturer("LG");
		myCom.setPrice(150);
		
		//직접 넣는 방식이 편할 수 있지만 공개적으로 접근하기 때문에 좋지 않아...
		//현재 : setter라는 중간 다리를 통해 접근... 잘못된 데이터가 들어가지 않도록 setter 에서 막을 수 있음..
		
		
	//	System.out.println(myCom.model); //필드 읽어오는 것도 불가
		//읽기 작업은 getter로 해결
		System.out.println(myCom.getModel());
		System.out.println(myCom.getManufacturer());
		System.out.println(myCom.getPrice());
	}

}
