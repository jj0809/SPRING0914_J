package ex05_Quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//ArrayList 해보자

//문제. 임의의 User를 3명 저장하는 ArrayList를 생성하시오
//회원번호를 입력받아 검색하여 일치하는 회원을 삭제하시오

class User{
	//field
	private int no; 	//회원번호
	private String id; 	//아이디
	private Date date;	//가입일
	
	//constructor
	public User(String id){
		this.id = id;
		date = new Date();
		no++;
	}
	
	//method
	
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
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("james"));
		users.add(new User("amanda"));
		users.add(new User("park"));
		System.out.println("현재 회원 수: " + users.size() + "명");
		
//		나는 번호가 자동으로 생성되게 해놨기 때문에 
//		번호가 범위에 있는지 없는지 정도만 알면 지울 수 있음
//		샘꺼는 처음에 add할 때 번호를 지정해 넣었기 때문에 인덱스를 찾아서 풀어야 함
		
		System.out.print("삭제할 회원번호를 입력 >>> ");
		int n = sc.nextInt() - 1; 
		System.out.println(users.get(n) + "의 가입일: " + users.get(n).getDate());
		System.out.println("삭제하시겠습니까?(Y/N) >> ");
		String x = sc.next();
		if (x.equalsIgnoreCase("Y")) {
			System.out.print(users.get(n) + "을 삭제합니다.");
			users.remove(n);
		}else {
			System.out.println("삭제되지 않았습니다.");
		}
		System.out.println(users);
		sc.close();
	}

}
