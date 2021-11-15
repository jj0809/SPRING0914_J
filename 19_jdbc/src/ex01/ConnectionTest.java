package ex01;

import java.sql.Connection;
import java.sql.SQLException;

import connection.DBConnect; //내가 만든 패키지

public class ConnectionTest {

	public static void main(String[] args) {
		
		/*DBConnect 클래스의 getConnection() 메소드는
		예외를 던지는 메소드라서 그냥 쓰면 오류가 나게 되어있음.
		예외 처리를 위해 try-catch 처리 블록을 추가한다.
		*/
		
		Connection conn = null;
		
		try {
			conn = DBConnect.getConnection(); //아까만든 DBConnect 패키지의 getConnection메소드 사용
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException e) {
			//DBConnect의 주석 1번 오류 시 실행
			System.out.println("jdbcDriver를 확인하거나, Bulid Path를 확인하세요");
		} catch(SQLException e) {
			//DBConnect의 주석 2번 오류 시 실행
			System.out.println("url, user, password 정보를 확인하세요.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally { //접속 성공 유무 상관 없이 처리하는 블록
			//conn close 처리 해야함
			try { //Connection 객체 conn을 사용하려면 예외처리(try블록)이 필요하다.
				//이건 커넥션 성공했을 때니까
				if(conn != null) {
					conn.close();
				} 
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		/*접속 성공 했으니 쿼리를 스트링으로 짜서 db에 날리면 된다......  */
		
	
	
	}

}
