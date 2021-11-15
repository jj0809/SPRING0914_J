package ex04_quiz;

abstract class Fighter{
	private String name;
	private int energy; //에너지(0 ~ 100)
	private boolean isAlive;
	private int power; //공격력 (0 ~ 9)
	//constructor
	public Fighter(String name, int energy, int power) {
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = this.energy >= 0; //요건 초기값
	}
	//method
	abstract public void attack(Fighter fighter); 
		//내용 없음, 코리안파이터랑 외국인파이터 내용 다르게 만들기
		//코리안파이터는 20% 확률로 한 방에 죽임 - setEnergy(0)으로 만들기
		//외국인파이터는 10%확률로 한 방에 죽임

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
		this.energy = this.energy < 0 ? 0 : this.energy; 
		setAlive(this.energy > 0);
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) { //setAlive의 경우 energy와 연관을 지어주자..!
		this.isAlive = isAlive; //energy가 변할 때 isAlive도 같이 변할 수 있도록~
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
		
		
	}
	
}


class KoreanFighter extends Fighter{
	//constructor
	public KoreanFighter(String name) {
		//내가 얼마의 power를 갖게되고
		super(name, 100, (int)(Math.random()*10)); //일케 넣으면 된대..
	}

	@Override
	public void attack(Fighter fighter) { //fighter는 상대방
		//20퍼센트 확률로 100의 에너지를 갖게 되는데...
		if(Math.random() < 0.2) { //Math.random()의 값은 실수 0.0 <=~ < 1.0 사이로 자동 생성 
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + ", 한 방에 죽었다."); return;
		}else {
		//fighter의 energy에서 power를 빼야함..
		// 얼마의 상대편 energy를 줄일 수 있는가? 내 파워만큼 줄일 수 있음..! 
		//결론: 상대편 에너지 = 자기 에너지 - 내 파워
		fighter.setEnergy(fighter.getEnergy() - this.getPower());
		System.out.println(fighter.getName() + "의 남은 에너지: " + fighter.getEnergy());
		}
	}
}

class ForeignFighter extends Fighter{

	public ForeignFighter(String name) {
		super(name, 100, (int)(Math.random()*10)); 
	}

	@Override
	public void attack(Fighter fighter) {
		//20퍼센트 확률로 100의 에너지를 갖게 되는데... -> setEnergy(0)으로 만들기
	//	this.setPower(((int)(Math.random()*10)+1)*5);
	//	System.out.println(this.getName() + "의 현재 파워: " + this.getPower());
		if(Math.random() < 0.1) { //Math.random()의 값은 실수 0.0 <=~ < 1.0 사이로 자동 생성 
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + ", 한 방에 죽었다."); return;
		}else {
		//fighter의 energy에서 power를 빼야함..
		// 얼마의 상대편 energy를 줄일 수 있는가? 내 파워만큼 줄일 수 있음..! 
		//결론: 상대편 에너지 = 자기 에너지 - 내 파워
		fighter.setEnergy(fighter.getEnergy() - this.getPower());
		System.out.println(fighter.getName() + "의 남은 에너지: " + fighter.getEnergy());
		}
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("정찬성");
		Fighter fighter2 = new ForeignFighter("에드가");
		
		System.out.println("fighter1: " + fighter1.getName() + ", 에너지: " + fighter1.getEnergy() + ", 파워: " + fighter1.getPower());
		System.out.println("fighter1: " + fighter2.getName() + ", 에너지: " + fighter2.getEnergy() + ", 파워: " + fighter2.getPower());
		
		System.out.println("싸움 시작");
		
		//공격 차례
		boolean myTurn = Math.random() < 0.5 ? false : true;
		
		do { //둘 다 살아있으면 진행
			if (myTurn) {
				System.out.println(fighter1.getName() + "의 공격");
				fighter1.attack(fighter2);
				myTurn = false;
			} else {
				System.out.println(fighter2.getName() + "의 공격");
				fighter2.attack(fighter1);
				myTurn = true;
			}
		} while(fighter1.isAlive() && fighter2.isAlive()); //둘 다 살아있으면 반복
		
		System.out.println("싸움 끝");
		//누가 이겼는가
		if (fighter1.isAlive()) {
			System.out.println(fighter1.getName() + " 승! 남은 에너지: " + fighter1.getEnergy());
		} else {
			System.out.println(fighter2.getName() + " 승! 남은 에너지: " + fighter2.getEnergy());
		}
		
	}//main

}

