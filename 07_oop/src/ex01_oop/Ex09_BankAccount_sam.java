package ex01_oop;

//내꺼랑 다른 점은 그냥 잔액을 balance로, 그리고 거래하는 돈을 money로 표현한 것

/* 겹쳐서 전체주석처리함*/
//class 하나로 전체설계~!
class BankAccount{
	
	String account;
	long balance; //돈이니까 long타입..
	
	//생성자
	BankAccount(String account, long money){
		this.account = account;
		balance = money;
	}
	
	//method
	void deposit(long money) {
		if(money <= 0) {
			return; //void일 때만 return 가능!!
		}
		balance += money;
	}
/*//transfer가 실패하는 withdraw
	void withdraw(long money) {
		if(money <= 0 || balance < money) {
			return;
		}
		balance -=money;
	}*/
/*//완성된 withdraw
 * 출금
 * 1) 결과타입: long (실제로 출금된 금액)
 * 2) 메소드명: withdraw
 * 3) 매개변수: long money (출금해야하는 금액)*/
	long withdraw(long money) {
		if(money <= 0 || balance < money) {
			return 0; //실제로 출금된 금액 없음
		}
		balance -= money;
		return money; 
	}
	//boolean을 withdraw에서 결과로 하여 인출에 성공할 경우 이체도 가능하다고 만들거나
	
	//만들어보세요
	
	
	
	
	void transfer(BankAccount account, long money) {
		//이체
		//1. 내 계좌 출금: withdraw(money);
		//2. account 계좌 입금: account.deposit(money);
		//withdraw(money); //실패
		//account.deposit(money); //성공해버림 없는돈을 보내버림
		
		//boolean을 withdraw에서 결과로 하여 인출에 성공할 경우 이체도 가능하다고 만들거나
		//withdraw에서 long타입 결과 반환
		
		long withDrawMoney = withdraw(money); //withdraw결과를 long타입 withDrawMoney에 받음
		account.deposit(withDrawMoney);
		//=
		//to.deposit(withdraw(money)); //축약
		
	}
	
	void inquiry() {
		System.out.println("계좌번호: " + account + " 잔액: " + balance +"원");
	}
	
}

public class Ex09_BankAccount_sam {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1234", 10_000); //계좌번호와 잔액 초기값
		BankAccount mom = new BankAccount("4321", 100_000);
		
		//1단계
		me.deposit(10_000); //내 계좌에 10,000원 입금
		me.deposit(-100); //내 계좌에 -100원 입금 (불가)
		me.withdraw(20_000); //20,000원 출금
		me.withdraw(100); //잔액보다 큰 금액 출금(불가)  //여기서 return된 money는 처리해주는 애가 없어서 처리 안되고 사라진다!
		
		me.inquiry(); //계좌번호: 1234, 잔액: 0원 출력
		
		//2단계
		mom.transfer(me, 50_000); //엄마가 나한테 50,000원 이체:잔액 나는 50,000원 엄마는 50,000원 
		mom.transfer(me, -100); //실패
		mom.transfer(me, 100_000_000); //엄마 잔액보다 큰 돈 보내서 실패
		
		me.inquiry();  //잔액 50_000원
		mom.inquiry(); //잔액 50_000원
	}

}

