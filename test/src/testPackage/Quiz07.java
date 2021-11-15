package testPackage;

import java.util.Scanner;

class Phone{
	//field
	String name;
	String tel;
	String tell;
	
	Phone (String name, String tel){
		this.name = name;
		this.tel = tel;
		tell = tel.substring(0, 3) + "-" + tel.substring(3, 7) + "-" + tel.substring(7);
	}
}

class Phonebook{
	
	Phone[] phoneList;
	Scanner sc = new Scanner(System.in);
	Phonebook(int length){
		phoneList = new Phone[length];
	}
	void saveinfo() {
		for (int i = 0; i < phoneList.length; i++){
			System.out.print("이름, 전화번호 (빈칸없이 입력) >> ");
			String info = sc.next();
			sc.nextLine();
			String name = info.substring(0, 3);
			String tel = info.substring(3);
			phoneList[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.");
		
	}
	
	void search() {
		while (true) {
			System.out.print("검색할 이름 >> ");
			String nam = sc.next();
			sc.nextLine();
			for (int i = 0; i < phoneList.length; i++) {
				if(nam.equals(phoneList[i].name)) {
					System.out.println(nam + "번호는 " + phoneList[i].tell + "입니다."); break;
				}else if (nam.equals("그만")) {
					System.out.println("프로그램을 종료합니다."); return;
				}else {
					System.out.println(nam + "없습니다"); continue;
				}
			}
			
		}
	}
}//class

public class Quiz07 {

	public static void main(String[] args) {
		/*
		 * 이름 전화번호 필드를 가지는 phone 클래스 작성
		 * phone[] phonelist 배열을 필드로 가지는 phonebook 클래스 작성
		 * 이름과 전화번호 저장 후 이름을 입력받아 해당 전화번호 출력
		 * 이름에 그만을 쓰면 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명의 정보를 저장하시겠습니까? >> ");
		Phonebook s = new Phonebook(sc.nextInt());
		s.saveinfo();
		s.search();
		
		
		sc.close();
		
	}

}
