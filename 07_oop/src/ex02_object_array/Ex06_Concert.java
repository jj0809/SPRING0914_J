package ex02_object_array;

import java.util.Scanner;


class Seat{ //좌석 1개
	
	//field
	String name;
	
	//constructor
	Seat(){	} //Seat 생성 모습: new Seat(), 빈 좌석을 만든다는 뜻
	//쓸데없어 보이지만 실제로 제일 많이 쓰이는 생성자의 모습이다
	
	//method
	//1. 좌석 예약자 이름 확인
	String getName() {
		return name;
	}
	//2. 좌석 예약
	void reserve(String name) {
		this.name = name; //예약자 이름
	}
	//3. 예약 취소
	void cancel() {
		this.name = null;
	}
	//4. 좌석 예약 여부 확인
	boolean isOccupied () {
		if (name == null) {
			return false; //비어있다
		}else{
			return true; //비어있지 않다
		}
		//boolean은 약간 양자택일일 때 많이 쓰는 듯... 있다/없다, 맞다/아니다...
	}
	//5. 좌석 예약자 확인 - 같은 이름도 같이 취소됨... 이게 싫으면 좌석 번호로 확인..
	boolean match(String name) { 
		return this.name.equals(name); //같으면 트루 아니면 펄스 리턴
	}
	
}//Seat

//등급별 좌석 (S, A, B) 
class SeatGroup{
	//field
	char seatType; //S, A, B
	Seat[] seats; //좌석들(배열)
	Scanner sc = new Scanner(System.in);
	//constructor
	SeatGroup(char seatType, int nSeats){ //시트 타입과 개수
		this.seatType = seatType;
		seats = new Seat[nSeats]; //seats의 길이, 좌석의 개수만 설정..
		for (int i = 0; i < seats.length; i++) {
			System.out.print("" + seatType + (i+1) + " "); //그냥 seatType과 i만 하면 연산이 돼서 스트링을 먼저 배치시킴
			seats[i] = new Seat(); //seat i개로 seats 배열 채우기
		}
	}
	//method
	//1.좌석예약
	//1)결과타입: boolean(성공하면 true, 실패하면 false)
	//2)메소드명: reserve
	//3)매개변수: 없음
	boolean reserve() {
		//전체 좌석 에약 현황 출력
		seatGroupInfo();
		//시트번호seatNo는 seats 배열의 인덱스보다 1 크다..
		System.out.print("시트번호 입력 >> ");
		int seatNo = sc.nextInt();
		//시트번호 검사 1자리부터 seats.length자리까지 맞게 입력했느냐
		if (seatNo < 1 || seatNo > seats.length) {
			System.out.println(seatNo + "번 좌석은 없는 번호입니다. 예약을 마칩니다.");
			return false;
		}//시트번호의 유효번호 : isOccupied 메소드 호출
		if(seats[seatNo-1].isOccupied()) {
			System.out.println(seatNo + "번 좌석은 이미 지정된 좌석입니다. 예약을 마칩니다.");
			return false;
		}
		//예약 진행 : 예약할 좌석 (Seat 객체)는 seats[seatNO- 1]이다.
		System.out.print("예약자명 입력 >> ");
		String name = sc.next();
		seats[seatNo - 1].reserve(name); //seat class의 reserve 호출
		System.out.println("예약이 완료되었습니다.");
		return true;
	}
	//좌석 예약 취소
	//1)결과타입: boolean
	//2) 결과타입: boolaan
	//3) 매개변수: 업음
	boolean cancel (){
		//전체 좌석 에약 현황 출력
		seatGroupInfo();
		//이름으로 취소하기
		System.out.print("예약 취소자의 이름 입력 >>> ");
		String name = sc.next();
		for (int i = 0; i <seats.length; i++) {
			if(seats[i].getName() != null) { //이름이 입력된 자리만 취소가 가능하다!
				if (seats[i].match(name)){
					seats[i].cancel();
					System.out.println("예약 취소가 완료되었습니다.");
					return true;
				} else {
					//동일한 예약자가 없는 곳??? No 여기 아님
				}
			}
		}//for
	//	for 문 끝난후 필요한 코드? : 동일한 예약이름이 없는 경우의 코드
		System.out.println("동잃한 예약자가 없습니다");
		return false;
		}//cancel
	
	//3. 예약 현황 출력
	void seatGroupInfo() {
		System.out.print(seatType + ": ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) { //예약자 시트인 경우
				System.out.print(seats[i].getName().substring(0, 1) + "*  ");
			}else { //예약 안된 시트
				System.out.print((i+1) + (i < 9 ? "   " : "  "));
			}
		}
		System.out.println(); //줄바꿈
	}
}//SeatGroup

//콘서트장
class ConcertHall{
	//field
	String hallName;
	SeatGroup[] seatGroup = new SeatGroup[3]; //seatGroup의 길이만 설정
	Scanner sc = new Scanner(System.in);
	char[] seatTypes = {'S', 'A', 'B'}; //SeatGroup seatType, seatCount 하나씩 빼서 만들기 위함  for 134줄
	int[] seatCount = {10, 10, 10};
	
	//constructor
	ConcertHall(String hallName){
		this.hallName = hallName;
		for (int i = 0; i < seatTypes.length; i++) { // 이 작업 위함
			seatGroup[i] = new SeatGroup(seatTypes[i], seatCount[i]);
		}
		System.out.println();
	}
	
	//method
	//1. 예약
	void reserve() {
		//좌석타입 입력받아서 예매 진행..
		System.out.print("예매할 좌석 타입 입력 (1: S , 2: A, 3: B) >> ");
		int choice = sc.nextInt();
		//choice의 유효범위는 1 ~ 3(seatGroup.length)
		if (choice < 1 || choice > seatGroup.length) {
			System.out.println("없는 좌석 타입입니다.");
			return; //reserve 메소드 종료
		}
		//choice == 1 : seatGroup[0] ....
		//choice - 1 이 seatGroup 배열의 인덱스이다..
		seatGroup[choice - 1].reserve();
	}
	//2. 예약 취소
	void cancel() {
		//좌석타입 입력받아서 예매 취소 진행..
		System.out.print("취소할 좌석 타입 입력 (S: 1 , A: 2, B: 3) >> ");
		int choice = sc.nextInt();
		//choice의 유효범위는 1 ~ 3(seatGroup.length)
		if (choice < 1 || choice > seatGroup.length) {
			System.out.println("없는 좌석 타입입니다.");
			return; //cancel() 메소드 종료
		}
		seatGroup[choice - 1].cancel();
	}

	//3. 전체 예매 현황 출력
	void concertHallInfo() {
		for(int i = 0; i <seatGroup.length; i++) {
			seatGroup[i].seatGroupInfo();
		}
		System.out.println(); //줄바꿈
	}
	
	
	//4. 종료
	void exit() {
		System.out.println(hallName + " 예약 시스템을 종료합니다.");
		sc.close();
	}
	
	//5. 실행 (메뉴)
	void run() {
		System.out.println(hallName + " 예약 시스템입니다.");
		while (true) {
			System.out.print("1. 예약 2. 취소  3. 출력  4. 종료 >> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: reserve(); break;
			case 2: cancel(); break;
			case 3: concertHallInfo(); break;
			case 4: exit(); return; //run 메소드를 반환하겠다... run 메소드의 실행 종료
			default: System.out.println("존재하지 않는 명령입니다. 다시 시도하세요");
			}
		}
	}
	
}//ConcertHall

public class Ex06_Concert {

	public static void main(String[] args) {
		ConcertHall hall = new ConcertHall("체조경기장");
		hall.run();
	}//main

}
