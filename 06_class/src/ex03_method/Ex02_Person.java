package ex03_method;

import java.util.Date;

class Person{
	
	//field
	String name;
	Date date;
	double height;
	double weight;
	
	//method
	
	/*1. 필드 정보 저장
	 * 1) 결과타입: 없음
	 * 2) 메소드명: setInfo
	 * 3) 매개변수: String n, double h, double w;
	 * 
	 */
	void setInfo(String n, double h, double w) {
		name = n;
		date = new Date();
		height = h;
		weight = w;
	}
	
	/* 2. bmi 정보를 반환(리턴=결과)하는 메소드
	 * 1) 결과타입: double 
	 * 2) 메소드명: getBMI //메소드명을 쓸 때는... 동사+명사 순으로 작성하는 규칙..
	 * 3) 매개변수: 없음 (외부로부터 추가로 받을 정보는 없음, 키랑 몸무게는 setInfo에 저장될 거니까!) >_<
	 * 
	 */
	double getBMI() {
		//결과가 있는 메소드
		// return 문으로 결과를 반환함
		double resultBMI = 0;
		double h = height / 100; //height의 단위가 cm이기 때문에 m단위로 바꿔줌
		resultBMI = weight / Math.pow(h, 2); //Math.pow(h,2): h의 2제곱
		//결과 반환
		return resultBMI;
	} //결과의 resultBMI 파일이 무슨 타입(double)인지 1)결과타입 에 작성!!
	
	//전체코드의 2~30퍼센트 정도가 이렇게 결과타입이 있다.... 대부분 void



//3. 건강 정보를 반환
/*1) 결과타입: String
  2) 메소드명: getHealthInfo
  3_ 매개변수 종료
  건강정보
  과체중 : bmi >=25
  정상: 24 >= bmi >= 20
 저체중 : 20 > bmi
 */

	String getHealthInfo() {
		String gethealth;
		//double bmi = getBMI(); 로 작성하여도 된다...    ..person 클래스에 있기 때문에 그냥 ~~ 로 불러와도 됨
		if ( getBMI() >= 25) {
			gethealth = "과체중";
		} else if ( getBMI() <= 24 && getBMI() >= 20) {
			gethealth = "정상";
		} else {
			gethealth = "저체중"; 
		}
		return gethealth;  
		//이렇게 저장해도 된다! return 값이 무조건 gethealth로 가게 되어 있음.
/*		if ( getBMI() >= 25) {
			return "과체중";
		} else if ( getBMI() <= 24 && getBMI() >= 20) {
			return "정상";
		} else {
			return "저체중"; 
		}
*/
	}
}
public class Ex02_Person {

	public static void main(String[] args) {
		Person person = new Person();
		person.setInfo("순실이", 178.3, 69.2);
//		person.getBMI(); //여기서 실행하면 아무것도 안나옴
		/*
		 * resultBMI 결과는 받았는데 처리를 안했다고 한다...
		 * 
		 * 100; // 어디 저장 안돼서 실행해도 출력이 안됨
		 */
		System.out.print(person.getHealthInfo() + "  "); //person 클래스에 있지 않아서 person.~~ 로 불러옴
		System.out.println(person.getBMI());	//이렇게 넣어주자

	}

}
