package ex01_generic;


public class Ex03_generic_method {

	//해결하기
	//1. 메소드 오버로딩하기
//	public static void print(Integer[] a) { }
//	public static void print(String[] a) { }
	//다른 형식의 배열이 나올때마다 추가해야함..
	
	//2. 제네릭 사용하기 - 하나만 만들어두면 됨
	//메소드의 제네릭 표기하기 - < > 를 붙이는 위치가 달라진다
	public static <X> void print(X[] a) { //메소드 맨 앞에 붙인다. 메소드: 결과타입, 메소드명, 매개변수로 이루어짐
		//public과 static은 경우에 따라 없어질 수 있으므로 결과타입 앞에 붙이는 것이 메소드 맨 앞에 해당함
		System.out.print("[");
		for(int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		
		System.out.print(a[a.length-1] + "]");
	}
	
	
	public static void main(String[] args) {

		Integer[] a = {1, 2, 3, 4, 5};
		String[] b = {"봄", "여름", "가을", "겨울"};
		
		print(a); //[1, 2, 3, 4, 5]
		print(b); //[봄, 여름, 가을, 겨울]
		//메소드에 제네릭 처리를 하면 바로 메소드명으로 부를 수 있어서 좋다..
	}

}
