package ex03_polymorphism_quiz;

class Elec{
	//field
	private String model;
	private int price;
	//Constructor
	public Elec(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
class TV extends Elec{
	//Constructor
	public TV(String model, int price) {
		super(model, price);
	}
	
}

class Radio extends Elec{
	public Radio(String model, int price) {
		super(model, price);
	}
}
class Customer {
	private int money;
	private double bonusPoint;
	public Elec[] cart;
	private int idx;
	//constructor
	public Customer(int money) {
		this.money = money;
		cart = new Elec[5]; //카트의 크기 꼭 챙겨주어야 함!!!
	}
	//method
	public void buy(Elec product) { //TV, Radio는 둘 다 Elec의 자식들이므로 매개변수 Elec
		/*cart에 product 추가, product의 금액 만큼 money 사용  + bonusPoint 추가
		FOA! 내가 가진 돈과 product 금액 비교해야함...
		product의 가격 확인하기 읽어오기 - getter 사용! ★★★★★★★★ */
		if (money < product.getPrice()) {
			System.out.println("돈이 " + (product.getPrice() - money) + "만원 부족합니다.");
			return; //method 종료
		}
		cart[idx++] = product;
		money -= product.getPrice();
		bonusPoint += (product.getPrice() * 0.05);
	}
	
	public void buyList() {
		if (idx == 0) { 
		System.out.println("구매한 제품이 없습니다.");
		return;
		}
		int total = 0;
		for (Elec product : cart) {
			if (product != null) {
				System.out.println(product.getModel() + "\t" + product.getPrice() + "만원");
				total += product.getPrice();
			}
		}
		System.out.println("=========================");
		System.out.println("총 구매금액\t" + total + "만원");
		System.out.println("보너스 포인트\t" + bonusPoint + "만원");
		System.out.println("남은 돈\t" + money + "만원");
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		
		Customer customer = new Customer(1000);
		
		customer.buy(new TV("LGTV", 200)); 
		customer.buy(new Radio("삼성Radio", 10));
		customer.buyList();
		
		//LGTV ------ 200만원
		//삼성Radio ------ 10만원
		//---------------------
		//총 구매금액      210만원
		//보너스 포인트 10.5만원
		//남은 돈           790만원
	}
}
