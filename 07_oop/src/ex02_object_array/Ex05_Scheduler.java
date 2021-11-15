package ex02_object_array;

import java.util.Scanner;

//하루
class Day{
	//field
	String schedule; //기본값 null
	//constructor
	Day(){} //할 일이 없음
	//method
	//지금은 아닌데 나중에 반드시 써야하는 메소드로 바뀌는 메소드를 알려드림
	//1. 스케줄 확인
	String getSchedule() {
		return schedule;
	}
	//2. 스케줄 저장
	void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	//3. 스케줄 출력
	void printDaySchedule() {
		if (schedule == null || schedule.isEmpty()) {
			System.out.println("없음");
		}else {
			System.out.println(schedule);
		}
	}
}

//일주일
class WeekScheduler{
	//field
	int nthWeek; //1주차 ~ n주차
	Day[] week;
	String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
	Scanner sc;
	//constructor
	WeekScheduler(int nthWeek){
		this.nthWeek = nthWeek;
		//week 배열의 길이(크기) 결정하기
		week = new Day[7];
		//Day 객체 7개 생성해두기 //스케줄이 없는 7개....
		for (int i = 0; i < week.length; i++) {
			week[i] = new Day();
		}
		//sc 생성해두기 
		sc = new Scanner(System.in);
	}
	
	//method
	//1.스케줄 만들기 (스케줄이 없으면 만들고, 있으면 취소)
	void makeSchedule() {
		boolean isExist = false; //입력한 요일이 있으면 true, 없으면 false
		System.out.print("스케줄을 등록할 요일 (일~토) 입력 >>> ");
		String weekDay = sc.next(); //String 배열인 weekName과 비교하기 때문에 1글자지만 String으로 받는다, 사용자가 쓴 일~토
		sc.nextLine(); //엔터제거
		//week 배열 순회...
		for(int i = 0; i < week.length; i++) {
			//입력된 요일 찾기 weekDay를 weekName에서
			if (weekDay.equals(weekName[i])) {
				//해당 요일: week[i]
				//해당 요일의 스케줄 확인: week[i].getSchedule
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) { //스케줄비어있는가 
					System.out.print("스케줄 입력 >>> ");
					week[i].setSchedule( sc.nextLine() ); //nextLine이 엔터처리하므로 엔터처리 따로 할필요 없음, 스케줄 공백 작성 가능
					//String schedule = sc.nextLine();
					//week[i].setSchedule(schedule);
					//저장완료 메시지 출력
					System.out.println(weekDay + "요일에 새 스케쥴이 저장되었습니다."); 
				} else {
					System.out.println(weekDay + "요일은 이미 입력된 스케줄이 있습니다.");
				}//else
				isExist = true;
				//for 문 종료 (for 문 종료는 makeSchedule 메소드의 종료)
				break; //return;도 가능
			}//if 1
		}//for
		if (!isExist) {System.out.println(weekDay + "요일은 존재하지 않습니다. 다시 시도 하세요."); return;}
	}//makeSchedule
		
		
	
	//2. 스케줄 수정하기 (기존 스케줄이 있으면 수정, 없으면 새로 등록)
	void changeSchedule() {
		boolean isExist = false;
		System.out.print("스케줄을 수정할 요일 (일~토) 입력 >>> ");
		String weekDay = sc.next();
		sc.nextLine();
		for (int i = 0; i < week.length; i++) {
			//몇요일인지 확인하기
			if (weekDay.equals(weekName[i])) {
				//요일확인하면 스케줄 있는지 확인
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					//비어있으면
					System.out.println(weekDay + "요일은 스케줄이 없습니다.");
					System.out.print("새 스케줄을 등록하시겠습니까(Y/N)? >>>");
					String answer = sc.next();
					sc.nextLine();
					if (answer.equalsIgnoreCase("y")) { //answer.charAt(0) == 'Y' || answer.charAt(0) == 'y' 라고 작성해도 된다 
														//Yes로 작성하거나 yes로 작성해도 처리 가능해짐
						System.out.print("새 스케줄 입력 >>> ");
						String newSchedule = sc.nextLine(); //스케줄은 공백 작성 가능하게 만드세요~ nextLine 사용
						week[i].setSchedule(newSchedule);
						System.out.println(weekDay + "요일에 새 스케줄이 저장되었습니다.");
					}else {
						System.out.println("취소");
					}
				}else { //기스케줄이 있는 경우
					System.out.println(weekDay + "요일의 기존 스케줄: " + week[i].getSchedule());
					System.out.print("수정할까요 (Y/N)? >>> ");
					String editanswer = sc.next();
					sc.nextLine();
					if(editanswer.equalsIgnoreCase("Y")) { //answer.charAt(0) == 'Y' || answer.charAt(0) == 'y' 라고 작성해도 된다 
															//Yes로 작성하거나 yes로 작성해도 처리 가능해짐
						System.out.print("수정할 스케줄 입력 >>> ");
						String editSchedule = sc.nextLine();
						week[i].setSchedule(editSchedule);
						System.out.println(weekDay + "요일의 스케줄이 수정되었습니다.");
					} else {
						System.out.println("스케줄 수정이 취소되었습니다.");
					}
				}
				isExist = true;
				break;
			}//if 1  끝 (사용자가 쓴 요일이 있는 요일일 때)
		}//for
		if (!isExist) {
			System.out.println(weekDay + "요일은 존재하지 않습니다. 다시 시도 하세요.");
		}
		
	}
	//3. 스케줄 삭제하기 (기존 스케줄 있으면 삭제, 없으면 취소) - setSchedule 값에 null을 넣어준다
	void deleteSchedule(){
		boolean isExist = false;
		System.out.print("스케줄을 삭제할 요일(일~토) 입력 >>> ");
		String weekDay = sc.next();
		sc.nextLine();
		for (int i = 0 ; i < week.length; i++) {
			if (weekDay.equals(weekName[i]) ) { //삭제할 요일이 언제인지 확인
				//해당 요일 스케줄 확인 week[i]가 Day임... week[i].getSchedule로 확인 가능..
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName[i] + "요일은 스케줄이 없습니다."); 
				} else { 
					System.out.println("삭제할 스케줄을 확인합니다.");
					System.out.println(week[i].getSchedule());
					//삭제여부 확인
					System.out.print("삭제할까요? (Y/N) >>> ");
					String answer = sc.next();
					sc.nextLine();
					if(answer.equalsIgnoreCase("y")) {
						//스케줄 없애기 스케줄을 null로 저장한다..
						week[i].setSchedule(null);
						System.out.println(weekDay + "요일 스케줄이 삭제되었습니다.");
					}else { //y를 입력하지 않은 경우..
						System.out.println(weekDay + "요일 스케줄이 삭제되지 않았습니다.");
					}
				}
				isExist = true;
				break;
			} //weekDay가 weekName에 있는지는 확인해야함
		}//for
		if (!isExist) {
			System.out.println(weekDay + "요일은 존재하지 않습니다. 다시 시도 하세요.");
		}
	}//deleteSchedule
	
	//4. 일주일 전체 스케줄 출력하기 (요일별 스케줄 출력)
	void printWeekShedule() {
		System.out.println(nthWeek + "주차 스케줄 안내");
		for (int i = 0; i < week.length; i++) {
			System.out.print(weekName[i] + "요일: ");
			week[i].printDaySchedule();
		}
	}
	
	//5. 프로그램 종료
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		sc.close(); //★★★★★★★★★★★★★★
		
	}
	//6. 메뉴 출력
	void menu() {
		System.out.println();
		System.out.println("1. 스케줄 생성");
		System.out.println("2. 스케줄 삭제");
		System.out.println("3. 스케줄 변경");
		System.out.println("4. 스케줄 출력");
		System.out.println("0. 프로그램 종료");
		System.out.println();
	}
	//7. 스케줄러 실행
	void run() {
		while(true) {
			menu(); //메뉴 호출
			System.out.print("메뉴 선택 >>>");
			int choice = sc.nextInt();
			sc.nextLine(); //엔터 스트림 제거용
			
			switch (choice) {
			case 1: makeSchedule(); break; //switch문 종료하는 break;  무한반복은 계속됨
			case 2: deleteSchedule(); break;
			case 3: changeSchedule(); break;
			case 4: printWeekShedule();break;
			case 0: exit();  return; //run 메소드 종료
			default: System.out.println("없는 메뉴이니 다시 입력하세요.");
			}
			
		}
	}
}//WeekScheduler

public class Ex05_Scheduler {

	public static void main(String[] args) {
		WeekScheduler firstWeek = new WeekScheduler(1); //1주차
		firstWeek.run();
		
	}//main

}
