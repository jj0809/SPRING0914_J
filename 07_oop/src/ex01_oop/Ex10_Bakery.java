package ex01_oop;

//고객과 빵집 사이 포스기계 역할을 하는 클래스를 따로 만드는 ㄳ...

class BreadAndChange{ //데이터 보관용 클래스 다른 목적 없음./. 2가지 이상의 데이터를 저장하기 위함
	//field
	int breads;
	int change;
	
	//constructor
	BreadAndChange(int breads, int change){
		this.breads = breads;
		this.change = change;
	}
}

class Bakery{
	//field
	int bread;
	int price;
	int money;
	
	//constructor
	Bakery(int bread, int price, int money){
		this.bread = bread;
		this.price = price;
		this.money = money;
		
	}
	//method - 두 가지 만들 것
	//1. sell (판매 메소드)
	//2개 이상의 데이터를 저장하는 방법 1. 배열 2. 클래스
	//빵과잔돈 sell(고객돈) { }  형식의 클래스를 만들자 - 위에 있는 BreadAndChange 사용
	//빵과 잔돈을 반환해서 BreadAndChange로 보냄
	BreadAndChange sell (int customerMoney) { //빵집에서 빵 팔 때 고객으로부터 돈만 받음
		//판매할 빵 개수
		int sellBread = customerMoney/price;
		//잔돈
		int change = customerMoney%price;
		//고객에게 돌려줄 BreadAndChange 객체 생성
		BreadAndChange bnc = new BreadAndChange(sellBread, change); //36 - 40에서 만든 내용을 bnc에 저장
		
		//베이커리의 상황
		bread -= sellBread;
		money += (customerMoney - change);
		
		return bnc; //bnc 객체를 반환하여 고객에게 전달 될 수 있도록..
	}
	//2. info 
	void info() {
		System.out.println("빵 " + bread + "개, 자본금 " + money + "원");
	}
	
}

class Customer{
	int cash;
	int customerbread;
	//constructor
	Customer(int cash){
		this.cash = cash;
	}
	//method
	//buy - 출력까지
	//1) 결과타입: void
	//2) 메소드명: buy
	//3) 매개변수: Bakery bakery, int cash
	void buy (Bakery bakery, int cash) { //고객이 돈을 주고 받는 것들
		//bakery에 cash를 주고 빵과 잔돈을 받아옴....
		//buy와 sell이 동시에 같이 진행되어야 하므로 buy만 호출해도 내부에서 sell 동작하게끔 만든다
		BreadAndChange bnc = bakery.sell(cash); //cash를 bakery의 sell에서 계산한 결과를 bnc로 보낸다 나중에 반환..
		
		//리턴 받은 빵과 잔돈 처리
		this.customerbread += bnc.breads;
		this.cash += bnc.change; //잔돈 받기
		
		//고객의 돈을 쓰는 작업
		this.cash -= cash;
		
		System.out.println("가진 빵 " + this.customerbread + ", 남은 돈 " + this.cash);
	}
}

public class Ex10_Bakery {

	public static void main(String[] args) {
		
		Bakery paris = new Bakery(100, 500, 10_000); //빵 100개, 가격 500원, 자본금 10_000원
		Bakery tour = new Bakery(50, 1000, 10_000);
		
		Customer customer = new Customer(20_000); //가진 돈 20_000원
		// 첫 번째 빵집 방문
		customer.buy(paris, 10_000); //파리 빵집에서 10_000원 사용, 가진 빵 20개 남은 돈 10,000원
		// 두 번째 빵집 방문
		customer.buy(tour, 10_000); // 가진 빵 30개, 남은 돈 0원
		
		//첫 번째 빵집 상황
		paris.info(); // 빵 80개, 자본 금 20_000원
		
		//두 번째 빵집 상황
		tour.info(); //빵 40개, 자본 금 20_000원
		
		
		
		
		
	}

}
