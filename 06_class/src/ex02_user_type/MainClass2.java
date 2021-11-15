package ex02_user_type;

public class MainClass2 {

	public static void main(String[] args) {

		//Computer 생성
		Computer myCom = new Computer();
		
		//save 메소드 호출
		myCom.save("GRAM", "LG", 180);
		//필드에 정보 저장
		
		//info 메소드 호출
		//myCom.info();
		//저장된 정보 확인
		
		//Book 생성
		Book myBook = new Book();
		//setInfo 호출
		myBook.setInfo("어린왕자", "생택쥐베리", 15000, 10000);
		//print
		//myBook.print();
		
		
		//사람 생성
		Person p = new Person();
		
		p.save("james", 20, 'f', 165.4, myCom, myBook);

		p.info();

	}

}
