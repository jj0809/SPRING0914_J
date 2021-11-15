package ex02_interface;

interface Animal{
	//모든 동물들이 하는 일
	
	void eat(); //public abstract void eat(); 으로 자동처리됨
	//아무것도 없는 상태에서 먹는다는 동작이 만들어질 수 없으므로 인터페이스 처리한다..
}


class Lion implements Animal{ //extends 아니라 implements 'cause of interface!
	//반드시 구현해야하는 추상 메소드 eat
	@Override
	public void eat() {
		System.out.println("사자가 먹는다.");
	}
	//Lion만 가지고 있는 일반 메소드
	public void run() {
		System.out.println("사자는 달린다.");
	}
}

class Shark implements Animal{
	//반드시 구현해야하는 추상 메소드 eat
	@Override
	public void eat() {
		System.out.println("상어가 먹는다.");
	}
	//일반메소드 - only Shark
	public void swim() {
		System.out.println("상어는 헤엄친다.");
	}
}

class Eagle implements Animal{
	//반드시 구현해야하는 추상 메소드 eat
	@Override
	public void eat() {
		System.out.println("독수리가 먹는다.");
	}
	//일반 메소드 - Eagle only
	public void fly() {
		System.out.println("독수리는 하늘을 난다.");
	}
}
//모아서 관리하는 클래스 zoo
class Zoo{
	//field
	private Animal[] animals;
	private int idx;
	//constructor
	public Zoo() {
		animals = new Animal[3]; //3으로 내가 개수지정, 변수선언하면 main에서 지정할 수 있다.
	}
	//method
	public void addAnimal(Animal animal) {
		animals[idx++] = animal;
	}
	public void animalListInfo() {
		for (Animal animal : animals) {
			if (animal != null) {
				animal.eat(); //구현한 메소드, 모두 가지고 있음
				//일반메소드는 당장 넣을 수 없음.. instanceof 거쳐서
				if (animal instanceof Lion) {
					((Lion)animal).eat(); //animal이 Lion의 객체이므로 animal.만 누르면 eat 자동완성가능
				}else if(animal instanceof Shark) {
					((Shark)animal).swim();
				}else if(animal instanceof Eagle) {
					((Eagle) animal).fly();
				}
			}
		}
	}
}

public class Ex02_Animal {
	
	public static void main(String[] args) {
		//main에서는 이제 Zoo에 대한 내용만 실행하면 됨
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Shark());
		zoo.addAnimal(new Eagle());
		
		zoo.animalListInfo();
		

	}

}
