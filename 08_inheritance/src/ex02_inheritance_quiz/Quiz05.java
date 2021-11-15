package ex02_inheritance_quiz;
//super
class Staff{
	//field
	String name; //이름
	String depart; //부서
	
	//constructor
	Staff(String name, String depart){
		this.name = name;
		this.depart = depart;
	}
	//method
	int pay() { //공통된 값이므로 pay를 staff에 넣음
		//staff은 급여 없으므로 pay() 메소드 없어야 함..
		//그러나 pay() 메소드 있어야 함. 모든 스탭이 pay를 사용하기 때문
		return 0; //부르면 안됨 , 앞으로는 호출을 막을 예정
	}
	
}

//sub
class SalaryMan extends Staff { 
	//field
	int salary; //기본급여
	//constructor
	SalaryMan (String name, String depart, int salary){
		super(name, depart);
		this.salary = salary;
	}
	
	@Override
	int pay() {
		return salary;
	}
	
}

//sub class 2 
class SalesMan extends SalaryMan {
	//field
	int salesVolume; //판매량
	double incentive; //인센티브(판매량이 100 이상이면 20% 아니면 5%)
	
	//constructor
	SalesMan(String name, String depart, int salary){
		super(name, depart, salary);
	}
	void setSalesVolume(int salesVolume) {
			this.salesVolume = salesVolume;
			this.incentive = salesVolume >= 100 ? 0.2 : 0.05 ;
	}
	
	int salesPay() {
		return (int)(salesVolume * incentive);
	}
	
	@Override
	int pay() {
//		return super.salary + (int)(salesVolume * incentive);
		//추천하는 작업 방식
		//1. salary는 pay() 메소드로 바꾼다  - 기존의 pay메소드는 salary만을 보여줌
		//2. (int)(salesVolume * incentive)는 별도의 메소드로 만든다.
		return super.pay() + salesPay();
	}
	
}

//sub class 3
class Alba extends Staff{
	//field
	int times; //일 한 시간
	int payPerHour; //시급
	Alba(String name, String depart, int payPerHour){
		super(name, depart);
		this.payPerHour = payPerHour;
	}
	
	void setTimes(int times) {
		this.times = times;
	}
	@Override
	int pay() {
		return times * payPerHour;
	}
}

public class Quiz05 {

	public static void main(String[] args) {

		SalaryMan s1 = new SalaryMan("제임스", "총무부", 300);
		System.out.println("s1의 급여: " + s1.pay() + "만원");
		
		SalesMan s2 = new SalesMan("에밀리", "판매부", 100);
		s2.setSalesVolume(200); //판매량 설정
		System.out.println("s2의 급여: " + s2.pay() + "만원"); //140만원
		
		Alba s3 = new Alba("데이빗", "홍보부", 1); //시급 1만원
		s3.setTimes(100); //일 한 시간
		System.out.println("s3의 급여: " + s3.pay() + "만원"); //100만원
		
		
	}

}
