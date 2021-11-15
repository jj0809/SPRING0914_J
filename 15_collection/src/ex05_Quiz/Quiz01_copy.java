package ex05_Quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//ArrayList 해보자

//문제. 임의의 User를 3명 저장하는 ArrayList를 생성하시오
//회원번호를 입력받아 검색하여 일치하는 회원을 삭제하시오

class Users{
	//field
	private int no; 	//회원번호
	private String id; 	//아이디
	private Date date;	//가입일
	
	//constructor
	public Users(int no, String id){
		super();
		this.no = no;
		this.id = id;
		this.date = new Date();
	}
	
	//method
	//toString 오버라이드
	@Override
	public String toString() {
		return id;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		String pattern = "yyyy년 MM월 dd일 E요일 a H:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String patternToday = sdf.format(date);
		return patternToday;
	}
	public void setDate(Date date) {
		this.date = date;
	}
//	public void delete() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("삭제할 회원번호를 입력 >>> ");
//		int n = sc.nextInt() - 1;
//		System.out.println(id + "의 가입일: " + getDate());
//		System.out.println("삭제하시겠습니까?(Y/N) >> ");
//		String x = sc.next();
//		if (x.equalsIgnoreCase("Y")) {
//		}
//	}
}
public class Quiz01_copy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Users> users = new ArrayList<Users>();
		users.add(new Users(1, "james"));
		users.add(new Users(2, "amanda"));
		users.add(new Users(3, "park"));
		System.out.println("현재 회원 수: " + users.size() + "명");
		System.out.print("삭제할 회원번호를 입력 >>> ");
		int n = sc.nextInt();
		//n을 리스트에서 비교해서 꺼내오는 작업이 필요하다... getter setter 필요!
		//contain 과 remove를 같이 사용하기가 조금 힘들다..
		//for문을 사용하도록 하겠다...
		//저장된 Users의 no와 입력된 no 비교
		int removeidx = -1; //0번이 자칫 지워질 수 있으므로
		for (int i = 0, size = users.size(); i < size ; i++) { //향상for문으로 바꿀 수도 있겠지요..못바꿈! i를 정할 수 없음..!
			if(users.get(i).getNo() == n) {
				//비교를 해야 같은 데이터가 저장된 위치 i를 알 수 있음
				//users.remove(i); 여기서 삭제하면 안되고 인덱스만 저장하자
				//remove가 직접 들어오면 안된다.. if 안에서 지우면 size에 변화가 생겨 for문이 망가짐
				removeidx = i;
			}
		}
		if(n > users.size() || n < 0) {
			System.out.println("회원이 없는 번호임");
		}
		if(removeidx != -1) { //이상한 번호는 지울 수 없도록 처리
			users.remove(removeidx);
		}
		//출력
		//toString 오버라이드 전: [객체, 객체, 객체] 
		//개별 객체 정보를 문자열로 반환하는 toString 메소드 활용해서 출력 예쁘게 하자..
		System.out.println(users); //이제 예쁘게 나옴^^! id만~
		
		sc.close();
	}

}
