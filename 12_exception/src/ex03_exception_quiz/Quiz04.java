package ex03_exception_quiz;

//errCode
//1. 마이너스 입금 시: 1000
//2. 마이너스 출금 시: 2000
//3. 잔고보다 큰 출금 시: 2001 
class BankException extends Exception{
	//field
	private int errCode; //errcode의 추가
	//constructor
	public BankException (int errCode, String message) {
		super(message); //super 는 무조건 먼저 호출해줄 것!!!
		this.errCode = errCode;
	}
	//method
	public int getErrCode() { //errCode를 확인할 수 있도록 getter와 setter를 추가함
		return errCode;		  //에러코드 확인 시 호출합니다... 라인 90
	}
	public void setErrCode(int errCode) { //setter는 사실 필요 없으나 그냥 추가함..
		this.errCode = errCode;
	}
	
}

//입금 예외(BankException의 서브)
class DepositException2 extends BankException{
	//constructor
	public DepositException2(String message) {
		super(1000, message); //입금 예외일 때는 에러코드 1000 추가
	}
}

//출금 예외(BankException의 서브)
class WithdrawException2 extends BankException{
	public WithdrawException2(int errCode, String message) {
		super(errCode, message); //출금 에러는 2000, 2001 두 가지가 있으니까 여기서 정할 수 없음..
	}
}

//은행 계좌
class Account{
	//field
	private String accNo;
	private long balance;
	//constructor
	public Account(String accNo, long balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	//입금
	public void deposit(long money) throws DepositException2{
		if (money < 0) {
			throw new DepositException2(money+ "원 입금 불가");
		}else {
			balance += money;
		}
	}
	//출금
	public long withdraw(long money) throws WithdrawException2{
		if (money < 0) {
			throw new WithdrawException2 (2000, money + "원 출금 불가");
		}else if (money > balance) {
			throw new WithdrawException2 (2001, "잔고 부족");
		}else {
			balance -= money;
			return balance;
		}
	}
	//조회
	public void inquiry() {
		System.out.println("\"" + this.accNo + "\" " + this.balance + "원");
		
	}
	//이체
	public void transfer(Account you, long money) throws WithdrawException2, DepositException2{
		you.deposit(withdraw(money));
	}
}

public class Quiz04 {

	public static void main(String[] args) {
		Account me = new Account("123-456", 50000);
		Account you = new Account("654-321", 50000);
		
		try {
			me.transfer(you, 50000);
			me.inquiry();
			you.inquiry();
		}catch(BankException e) { //DepositException2, WithdrawException2 모두 저장
			System.out.println("에러코드: " + e.getErrCode());
			System.out.println("에러 메시지: " + e.getMessage());
		}
		
	}

}
