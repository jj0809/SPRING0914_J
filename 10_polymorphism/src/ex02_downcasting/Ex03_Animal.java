package ex02_downcasting;

/* ********꼼꼼히 볼 것********** */

class Animal{ //모든 동물이 Animal에 속하게 하고 싶어서 만들었다..
	public void whoAmI() {
		//아직 알 수 없음, 
	}
	
}

class Lion extends Animal{
	@Override
	public void whoAmI() {
		System.out.println("나는 사자다.");
	}
}

class Shark extends Animal{
	@Override
	public void whoAmI(){
		System.out.println("나는 상어다.");
	}
}

class Eagle extends Animal{
	@Override
	public void whoAmI() {
		System.out.println("나는 독수리다.");
	}
}

class Zoo{
	//field
	private Animal[] animals;
	private int idx;
	//constructor
	public Zoo() {
		animals = new Animal[10];
		idx = 0;
	}
	//method
	public void addAnimal(Animal animal) { //알게모르게 업캐스팅했음..
		animals[idx++] = animal;
	}
	public void info() {
		for (Animal animal : animals) {
			if (animal != null) {
				animal.whoAmI(); //동물이 들어있으면 동물 소개를 실행한다.
				//다형성: polymorphism! : 동일한 코드가 실행이 다르다
			}
		}
	}
}

public class Ex03_Animal {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Lion()); //Animal animal = new Lion() 의 형태로 41줄에 들어가는것~!
		zoo.addAnimal(new Shark());
		zoo.addAnimal(new Eagle());
		
		zoo.info();
		
	}

}
