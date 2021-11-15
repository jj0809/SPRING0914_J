package ex01_package;

public class Mother {

	public static void main(String[] args) {
		
		Father f = new Father(); //father 생성
		//Father 중 private 인 secret 만 제외하고 다 확인할 수 있음
		
		System.out.println(f.name);
		System.out.println(f.perID);
		System.out.println(f.tv);

	}

}
