package ex01_oop;

/* 겹쳐서 전체주석처리함*/

//class 하나로 전체설계~!
/*class BankAccount{
	
	String account;
	long money; //돈이니까 long타입..
	
	//생성자
	BankAccount(String account, long money){
		this.account = account;
		this.money = money;
	}
	
	//method
	void deposit(long money) {
		if(money <= 0) {
			return; //void일 때만 return 가능!!
		}
		this.money += money;
	}
/*	void deposit(String account, int money) {
		if(money <= 0) {
			return;
		}
		account.money += money;
	}*/
	
/*	void withdraw(long money) {
		if(money <= 0) {
			return;
		}
		if(this.money < money) {
			return;
		}
		this.money -=money;
	}
	
	//또 if쓰니까 소모적인 방법입니다!
	void transfer(BankAccount account, long money) {
		if(money <= 0) {    
			return;
		}
		if(this.money < money) {
			return;
		}
	//	this.money -= money;
		this.withdraw(money); // 이걸루 써두 댕!!
		account.deposit(money);
	}
	
	void inquiry() {
		System.out.println("계좌번호: " + account + " 잔액: " + money +"원");
	}
	
}

public class Ex09_BankAccount {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1234", 10_000); //계좌번호와 잔액 초기값
		BankAccount mom = new BankAccount("4321", 100_000);
		
		//1단계
		me.deposit(10_000); //내 계좌에 10,000원 입금
		me.deposit(-100); //내 계좌에 -100원 입금 (불가)
		me.withdraw(20_000); //20,000원 출금
		me.withdraw(100); //잔액보다 큰 금액 출금(불가)
		
		me.inquiry(); //계좌번호: 1234, 잔액: 0원 출력
		
		//2단계
		mom.transfer(me, 50_000); //엄마가 나한테 50,000원 이체:잔액 나는 50,000원 엄마는 50,000원 
		mom.transfer(me, -100); //실패
		mom.transfer(me, 100_000_000); //엄마 잔액보다 큰 돈 보내서 실패
		me.inquiry();  //잔액 50_000원
		mom.inquiry(); //잔액 50_000원
	}

}*/
