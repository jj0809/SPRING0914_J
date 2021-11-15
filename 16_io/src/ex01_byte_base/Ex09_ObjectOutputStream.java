package ex01_byte_base;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* ObjectOutputStream 클래스
 * : 객체(Object)를 파일에 출력하는 클래스
 * - 객체를 스트림으로 입출력 처리하려면 해당 객체를 직렬화 해야함..
 * - 직렬화 하려면 Serializable 인터페이스를 구현하면 된다.
 *   직렬화: 객체를 각 데이터별로 분리하는 과정
 *   Serializable: 줄 세우기
 */

//객체를 스트림 입출력 처리 하고 싶다.
//=> Serializable을 해라

//데이터를 주고받는 입출력에서 Serializable이 사용될 수 있음

class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3296197331300114753L;
	//serializable을 하려면 id를 붙여야한다(필수는 아니다)
	//여기까지가 있기 때문에 데이터를 스트림에 입출력 할 수가 잇다..
	private String userNo;
	private int userPoint;
	
	
public User(String userNo, int userPoint) {
		super();
		this.userNo = userNo;
		this.userPoint = userPoint;
	}
//user 객체 출력
//	syso(user) // syso(user.toString)
//	user.info()
	
	public void info() {
		System.out.println("회원번호: " + userNo + "(" + userPoint + "점)");
	}

}


public class Ex09_ObjectOutputStream {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("user.dat")));  
			//우리가 만들 파일: user.dat : 유저 정보를 갖고 있는 data 파일
			//buffered 추가해서 빠르게 만들었음..!
			//user.dat 파일로 보낼 객체
			User user1 = new User("1234", 1000);
			User user2 = new User("6789", 2000);
			User user3 = new User("1357", 3000);
			
			//user.dat 파일로 객체 보내기
			//1. 따로 보내는 법
//			oos.writeObject(user1);
//			oos.writeObject(user2);
//			oos.writeObject(user3);
			//2. 합쳐 보내는 법 - 유저 3개를 배열/리스트를 통해 합침: ArrayList
			List<User> userList = new ArrayList<User>();
			userList.add(user1);
			userList.add(user2);
			userList.add(user3);
			oos.writeObject(userList);
			
			System.out.println("user.dat 파일이 생성되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos !=null) {
					oos.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
