/*내꺼
ackage ex03_exception_quiz;

//입금 예외
//마이너스 입금 시 예외 발생
class DepositException extends Exception{
	public DepositException (String message) {
		super(message);
	}
}
//출금 예외
//1. 마이너스 출금 시 
//2. 통장 잔고보다 큰 금액 출금 시
class WithdrawException extends Exception{
	public WithdrawException (String message) {
		super(message);
	}
}

//은행계좌
class BankAccount{
	//field
	private String accNo; //계좌번호
	private long balance; //통장잔고
	//constructor
	public BankAccount(String accNo, long balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	//method
	//1. 입금 deposit
	public void deposit(long money) throws DepositException {
		if (money < 0) {
			throw new DepositException("마이너스 금액은 입금할 수 없음");
		}
		this.balance += money;
	}
	//2. 출금 withdraw
	//1) 결과: 실제로 출금된 금액
	//2) 매개변수: 출금 요청 금액
	
	public long withdraw(long money){
		
		this.balance -= money;
		return balance;
	}
	//3. 조회: inquiry
	public void inquiry() {
		System.out.println("\"" + this.accNo + "\" " + this.balance + "원");
		
	}
	//4. 이체: transfer - you 에게 money 원 보냅니다
	public void transfer(BankAccount you, long money) throws Exception {
		withdraw(money);
		if (money < 0) {
			throw new WithdrawException("마이너스 금액 출금 불가");
		} else if (money > this.balance) {
			throw new WithdrawException("잔고보다 큰 금액 출금 불가");		
		}
		you.deposit(money);
	}
}
public class Quiz03 {

	public static void main(String[] args) {
		BankAccount me = new BankAccount("123-456", 50_000);
		BankAccount you = new BankAccount("654-321", 50_000);
		
		try {
			me.transfer(you, 50_000);// 정상 동작 (예외상황 확인)
			me.inquiry(); //123-456, 0원
			you.inquiry();//654-321, 100_000원
		}catch(DepositException e) {
			System.out.println(e.getMessage());
		}catch(WithdrawException e) {
			System.out.println(e.getMessage());
		}

	}

}*/
