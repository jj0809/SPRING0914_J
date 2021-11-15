package ex01_upcasting;

//super
class Elec{
	//field
	private int watt;
	
	//constructor
	public Elec(int watt) {
		super();
		this.watt = watt;
	}
	//method
	public void info() {
		System.out.println("소비전력: " + watt + "w");
	}
	
} //super

class TV extends Elec{
	
	//field
	private int size;
	
	//constructor
	public TV(int watt, int size) {
		super(watt); //int watt 추가해야 오류나지 않음
		this.size = size;
	}
	
	//method
	@Override
	public void info() {
		System.out.println("크기: " + size + "인치");
		super.info(); //Elec의 info 호출
	}
	
}//TV




public class Ex01_Elec {

	public static void main(String[] args) {
		
		//서브클래스 객체 생성
		//어제까지는
		//TV tv = new TV(200, 65); //200watt, 65inch 티비
		//tv.info();
		
		//오늘부터는 upcasting
		/*upcasting
		 *1. sub class 객체는 super class 타입으로 저장 가능
		 *2. 강제 변환할 필요 없이 자동으로 변환됨
		 */
		
		Elec elec = new TV(200, 65); //sub인 tv가 Elec인 수퍼로 올라감, 자동 변환, 업캐스팅
		elec.info(); //호출 시 elec의 info를 호출하는 것 처럼 보이나 
					//실제로 실행 시 new TV로 생성된 객체.... TV의 info가 호출됨
		
		
		
		
	}

}
