package ex02_generic_quiz;

class Barret{}

class Marine extends Barret{}
class fireBelte extends Barret{}
class Tank{ }

class Bunker<T> {
	//
	/* 내꺼
	private T t;
	private Marine[] count;
	private int i = 0;
	
	public Bunker(int person){
		count = new Marine[person];
	}
	public T add(T t) {
		count[i++] = (Marine)t;
		return t;
	}
	@Override
	public String toString() {
		StringBuffer x = new StringBuffer();
		x.append("현재 ").append(i);
		x.append("명의 Marine 입장");
		return x.toString();
	}
	*/
	private T[] bunker;	//Marine타입 배열 bunker
	private int count; 	//최대 배열(bunker)의 길이
	private int idx;	//배열 bunker의 인덱스 (입장한 Marine 수)
	//constructor
	public Bunker(int count) {
//		bunker = new T[count]; //이게 안됨..
		/* 안되는 이유: 생성할 때 저장할 데이터의 타입을 전달한다..
		 * 예) int[] x = new Int[3]; 에서 
		 * new는 실행타임, 컴파일 타임 후에 진행됨
		 * 타입은 실행타임에서 결정되는 것
		 * 
		 * 배열의 사이즈(크기)는 컴파일할 때 정해져서 메모리에 저장되는데
		 * 배열의 타입을 알 수 없으니까 메모리에 저장할 수 없어서 에러..
		 * -> 배열의 크기 결정은 컴파일 타임에 진행되어야 하는데,
		 * generic 타입의 결정은 실행 타임에 결정되므로
		 * 컴파일 타임에 generic 타입의 메모리 크기를 알 수 없기 때문!
		 * 
		 * 해결책: Object를 사용한다
		 */
		bunker =(T[])(new Object[count]); 
		//Object 배열 생성 후 나중에 T로 바꾸도록 캐스팅 해둠
		this.count = count;
		this.idx = 0; //생략 가능
	}
	
	public void add(T item) {
		if (idx == count) { //인원수 full일 때
			return;
		} bunker[idx++] = item;
	}
	@Override
	public String toString() {
		//현재 3명의 Marine 입장
		return "현재 " + idx + "명의 Marine 입장";
	}
	
	
}

public class Quiz01 {

	public static void main(String[] args) {
		//스타크래프트
		Bunker<Marine> bunker = new Bunker<>(10); //최대 10명의 Marine이 입장할 수 있음
		
		bunker.add(new Marine());
		bunker.add(new Marine());
		bunker.add(new Marine());
		bunker.add(new Marine());
	//	Bunker <Barret> = new Bunker<>(10);    
				//	bunker.add(new Tank()); 	//막아야하는 작업: 오류 메시지 발생
		
		System.out.println(bunker); //현재 3명의 Marine 입장
		
	}

}
