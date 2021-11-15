package ex01_oop;

class Gun {
	//field
	String model;
	int bullet; // 0 - FULL_BULLET 개
	final int FULL_BULLET = 6; //총알은 최대 6개밖에 안들어간다
	//constructor
	Gun(String model, int bullet){
		this.model = model;
		this.bullet = bullet; 
//		this.bullet = bullet > FULL_BULLET? FULL_BULlET : bullet;
		//여기다가 bullet > 6 일 경우 결과를 넣어놔도 될드.ㅅ..
	}
	//method
/*	void reload(int bullet) { //장전    버림! 첫 장전이 6을 넘을 경우 이상해짐!
		this.bullet += bullet;
		if (this.bullet <= FULL_BULLET) {
			System.out.println((bullet) + "발이 장전되었다. 현재" + this.bullet + "발");
		}else {
			System.out.println((6 - (this.bullet % 6)) + "발이 장전되었다. 현재" + FULL_BULLET + "발");
			this.bullet = FULL_BULLET;
		}
	}*/
/*	선생님 코드 */
	void reload (int bullet) {
		if (this.bullet + bullet <= FULL_BULLET) {
			this.bullet += bullet;
			System.out.println(bullet + "발 장전되었다. 현재 " + this.bullet + "발");
			}
		else {
			int realBullet = FULL_BULLET - this.bullet; //int bullet을 아예 안써버림
			this.bullet = FULL_BULLET;
			System.out.println(realBullet + "발 장전되었다. 현재" + FULL_BULLET + "발");
		}
	}
	void shoot() { //발사
		if(bullet <= 0) {
		//	bullet = 0; //얘를 지우고
			System.out.println("헛빵!");
		}else {
			bullet -= 1; //이렇게 내려도 된다..
			System.out.println("빵야! " + bullet +"발 남았다.");
		}
	}
	void info() {
		System.out.println(model + " (" + bullet + ")");
	}
}//gun


class Soldier{
	//field
	String name;
	Gun pistol;
	//constructor
	Soldier(String name, Gun pistol){
		this.name = name;
		this.pistol = pistol;
	}
	//method
	void reload(int bullet) {
		pistol.reload(bullet);
	}
	void shoot() {
		pistol.shoot();
	}
	void info() {
		System.out.print(name + ", ");
		pistol.info();
	}
	
}//soldier
public class Ex06_Soldier {

	public static void main(String[] args) {
		Gun gun = new Gun("K-2", 2);
		Soldier soldier = new Soldier("람보", gun);
		
		soldier.shoot(); //빵야! 1발 남았다
		soldier.shoot(); //빵야! 0발 남았다
		soldier.shoot(); //헛빵
		
		soldier.reload(3); //3발이 장전되었다. 현재 3발
		soldier.reload(6); //3발이 장전되었다. 현재 6발.
		soldier.reload(6); //0발이 장전되었다. 현재 6발.
		
		soldier.info(); 
	}//main

}
