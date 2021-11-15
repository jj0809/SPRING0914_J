package ex03_polymorphism_quiz;

class Staff{
	//field
	private String name;
	private String depart;
	//constructor
	public Staff(String name, String depart) {
		super();
		this.name = name;
		this.depart = depart;
	}
	//method
	public void info() { //name, depart는 확인하는 용도로만 쓰여서 굳이 getter setter 쓰기보단 info로 확인
		System.out.println("직원 이름: " + name);
		System.out.println("소속 부서: " + depart);
	}
	public int pay() { //월급 리턴할 때 쓸건데
		return 0; //지금은 안쓸거고 이따 오버라이딩할예정.
	}
	
}

class SalaryMan extends Staff{
	//field
	private int salary;
	//constructor
	public SalaryMan(String name, String depart, int salary) {
		super(name, depart);
		this.salary = salary;
	}
	//method - info와 pay를 리메이크
	@Override
	public void info() {
		super.info(); //이름과 부서 출력하는 staff의 info
		System.out.println("기본급: " + salary);
	}
	@Override
	public int pay() {
		return salary; 
	}
	
	
}

class Salesman extends SalaryMan{
	//field
	private int salesVolume;
	private double incentive;
	//constructor
	public Salesman(String name, String depart, int salary) {
		super(name, depart, salary);
	}
	//method
	public void setSalesVolume(int salesVolume) {
		if (salesVolume < 0) {
			return;
		}
		this.salesVolume = salesVolume; //salesVolume은 0보다 작은 것 외에 제한 없음..
		if (this.salesVolume < 1000) {
			setIncentive(0.05); //판매량 1000미만은 인센 5퍼
		} else if(salesVolume < 2000) {// 2000미만 10퍼
			setIncentive(0.10);
		} else {
			setIncentive(0.2); //그이상 20퍼
		}
		
	}
	private void setIncentive(double incentive) { //외부에서 incentive를 수정, 호출할 수 없게 private 처리
		this.incentive = incentive;
	}
	public int salesPay() {
		return (int)(salesVolume * incentive);
	}
	@Override
	public void info() {
		super.info(); //이름, 부서, 기본급 출력하는 SalaryMan의 info
		System.out.println("판매 수당: " + salesPay());
		System.out.println("총 급여: " + pay());
	}
	@Override
	public int pay() {
		return super.pay() + salesPay(); //super.pay() - SalaryMan의 기본급 의미
	}
	
	
}

class Alba extends Staff{
	//field
	private int times;
	private double payPerHour;
	//constructor
	public Alba(String name, String depart, double payPerHour) {
		super(name, depart);
		this.payPerHour = payPerHour;
	}
	//method
	public void setTimes(int times) { //setter.. times를 수정할 수 있게 함
		this.times = times;
	}
	@Override
	public void info() {
		super.info(); //이름, 부서 출력
		System.out.println("총 급여: " + pay() + "만원");
	}
	@Override
	public int pay() {
		return (int)(times * payPerHour); //super.pay()는 staff의 pay.. 0 - 안 쓰고 내가 정해서 씀
		
	}
}

class Company{
	//field
	private Staff[] staffList;
	private int idx;
	private int staffCount;
	//constructor
	public Company (int staffCount) { //직원 수 입력.. staffCount: 전체직원수
		staffList = new Staff[staffCount];
		this.staffCount = staffCount;
		
	}
	//method
	public void addStaff(Staff staff) {
		if(idx == staffCount) {
			System.out.println("직원을 더 이상 뽑을 수 없습니다.");
			return;
		}
		if (staff instanceof Alba) { //뽑은 staff이 Alba 타입이면,
			((Alba)staff).setTimes(100); //Staff staff을 Alba staff으로: 다운캐스팅
										//일한 시간을 고정
		}else if (staff instanceof Salesman) {
			((Salesman)staff).setSalesVolume(1000);
		}
		staffList[idx++] = staff;
	}
	
	public void staffListInfo() {
		for (Staff staff : staffList) {
			if ( staff != null) {
				staff.info();
			}
		}
		System.out.println("=======================");
		System.out.println("현재 직원 수: " + idx + "명");
	}
}


public class Quiz02 {
	public static void main(String[] args) {
		
		Company samsung = new Company(5);
		samsung.addStaff(new SalaryMan("앨리스", "총무부", 250));
		samsung.addStaff(new Salesman("아만다", "판매부", 100));
		samsung.addStaff(new Alba("제시카", "홍보부", 0.9));
		samsung.addStaff(new SalaryMan("앨리스", "총무부", 250));
		samsung.addStaff(new Salesman("아만다", "판매부", 100));
		samsung.addStaff(new Alba("제시카", "홍보부", 0.9));
		
		samsung.staffListInfo();
	}

}
