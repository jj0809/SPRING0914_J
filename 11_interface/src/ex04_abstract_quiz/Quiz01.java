package ex04_abstract_quiz;

abstract class Fighter{
	private String name;
	private int energy = 100; //에너지(100)
	private boolean isAlive;
	private int power; //공격력 (0 ~ 9)
	//constructor
	public Fighter(String name) {
		super();
		this.name = name;
	}
	//method
	abstract public void attack(Fighter fighter); 
		//내용 없음, 코리안파이터랑 외국인파이터 내용 다르게 만들기
		//코리안파이터는 20% 확률로 한 방에 죽임
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
		setAlive(this.energy != 0);
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
		
		
	}
	
}


class KoreanFighter extends Fighter{
	
	public KoreanFighter(String name) {
		super(name);
	}

	@Override
	public void attack(Fighter fighter) {
		//내가 얼마의 power를 갖게되고
		setPower((int)(Math.random()*10));
		//20퍼센트 확률로 100의 에너지를 갖게 되는데...
		//fighter의 energy에서 power를 빼야함..
		fighter.setEnergy(fighter.getEnergy() - getPower());
	}

	@Override
	public int getEnergy() {
		return getEnergy();
	}
	
	
	
}

class ForeignFighter extends Fighter{

	public ForeignFighter(String name) {
		super(name);
	}

	@Override
	public void attack(Fighter fighter) {
		setPower((int)(Math.random()*10));
		//20퍼센트 확률로 100의 에너지를 갖게 되는데...
		//fighter의 energy에서 power를 빼야함..
		fighter.setEnergy(fighter.getEnergy() - getPower());
	}

	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		return super.getEnergy();
	}
	
	
}


public class Quiz01 {
	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("정찬성");
		Fighter fighter2 = new ForeignFighter("에드가");
		
		
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

