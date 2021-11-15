package ex02_user_type;

/*
 * 메소드
 * 1. 클래스 내부에 추가하는 함수임
 * 2. 메소드를 만드는 것을 메소드 정의라고 함
 * 3. 메소드 정의
 * 	   결과타입 메소드이름(매개변수) { //매개변수: 메소드로 전달되는 데이터 
 *            본문
 *            return 결과; //결과가 없을 경우 문장 생략 가능
 *    }
 */


public class Computer {
	//필드
	String model;
	String manufacturer;
	int price;
	
	//메소드
	//1. 필드 정보를 출력하는 메소드
	//   1) 결과타입: void (없다)
	//   2) 메소드 이름: info (개발자 맘대로 지정)
	//   3) 매개변수: 없음 (외부에서 전달되는 값 없음)
	void info() {
		System.out.println("컴퓨터 모델: " + model);
		System.out.println("컴퓨터 제조사: " + manufacturer);
		System.out.println("컴퓨터 가격: " + price);
	}
	
	//2. 외부로부터 컴퓨터 정보를 받아서 필드에 전달하는 메소드
	//   1) 결과타입: void 
	//   2) 메소드명: save
	//   3) 매개변수: String mo, String ma, int p (외부에서 save를 호출할 때 String 2개와 int 1개를 순서대로 전달해야함)
	void save(String mo, String ma, int p) {
		model = mo;
		manufacturer = ma;
		price = p;
	}

}
