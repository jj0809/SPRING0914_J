package ex02_object_array;

class Gun{
	//field
	String model;
	int bullet;
	//constructor
	Gun(String model, int bullet){
		this.model = model;
		this.bullet = bullet;
	}
	
	//method
	void shoot() {
		if (bullet > 0) {//총알이 있으면
			bullet--;
			System.out.println(model + " 빵야! (" + bullet + "발 남음)");
		} else if (bullet == 0){ //그냥 else { } 로 박아도 되지만 안전하게 하고 싶을 경우 else if 사용하면 됨
			System.out.println(model + " 총알이 없습니다.");
		}
	}

	void info() {
			System.out.println(model + " (" + bullet + "발)");
	}
	
}//gun

class Soldier{
	//field
	String name;
//	int gunCount; 없어도 됨..
	Gun[] gunList;
	int i; //gunList의 인덱스 (실제로 저장된 Gun의 개수/gunCount와 숫자가 다름)
	
	Soldier(String name, int gunCount){
		this.name = name;
//		this.gunCount = gunCount; 불필요한 작업
		gunList = new Gun[gunCount];
	}
	
	void addGun(Gun gun) {
		//gunList[i] = gun;
		//i++;
		gunList[i++] = gun; // 한 줄로 합쳐도 상관없음
	}
	void shoot() { //모든 총을 한 발씩 쏜다
/*		 for( int i = 0; i < gunList.length; i++ )>>이거는 만약에 총 한 개만 있을 때 쏴버리면 에러가 생김.. 
 * 								스미스웨슨 선언 전에 shoot 호출하면 총 2개만 슈팅될 수 있도록.. 이상한 얘기 들은듯....  */
		//슛을 호출하는 시점에 총이 몇 개가 있는지? 가 중요 -> i개 
		for (int j = 0; j < i; j++) {
			gunList[j].shoot();
		} //soldier의 shoot은 gun의 shoot이다
	}
	void shoot(int num) {
		gunList[num-1].shoot();
		//gunList[인덱스] == gunList[num-1] 배열은 0부터 시작하니까..
	}
	void shoot(String name) {
		/*for (int j = 0; j < i; j++) { //위와 마찬가지로 gunList.legnth 가 아니라 i로 설정한다
			if(gunList[j].model.equals(name)){
				gunList[j].shoot();
			}
		}*/
		//향상for문 써보기
		for (Gun gun : gunList) {
			if (name.equals(gun.model)) {
				//gun.model이 배열에 따라서 3번 변하고 이를 name과 비교함
				gun.shoot(); //해당하는 gun을 쏨
			}
		}
	}
	void info() {
		System.out.println("이름: " + name );
		for (Gun gun : gunList) {
			gun.info();
		}
	}
	
}//soldier


public class Ex03_Soldier {

	public static void main(String[] args) {
		
	Soldier soldier = new Soldier("람보", 3); //Gun을 3개 가질 수 있는 람보	
	
	soldier.addGun( new Gun("콜트", 10));
	soldier.addGun( new Gun("베레타", 10));
	soldier.addGun( new Gun("스미스웨슨", 10));
	
	//총쏘는 방법 3가지
	soldier.shoot(); //모든 총을 한 발씩 쏜다
	soldier.shoot(1); //1번째 총만 1발 쏜다 shoot(2), shoot(3)
	soldier.shoot("베레타"); // 베레타만 한 발 쏜다	
	
	soldier.info();
	//이름: 람보
	//콜트(8발)
	//베레타(8발)
	//스미스웨슨(9발)
		
		
		
	}//main

}
