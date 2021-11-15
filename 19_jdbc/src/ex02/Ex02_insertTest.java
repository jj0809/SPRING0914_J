package ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;

public class Ex02_insertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		int result = 0;
		
		//INSERT 쿼리문에 전달할 변수
		String job_id = "CJ";
		String job_title = "차장";
		int min_salary = 6000;
		int max_salary = 7500;
		
		try {
			//1. 접속
			conn = DBConnect.getConnection();
			
			//2. 쿼리문 준비
			// !중요! 변수처리할 부분은  '?' 로 처리함
			sql = "INSERT INTO JOB VALUES (?, ?, ?, ?)";
			
			//3. 쿼리 담당 ps 생성
			ps = conn.prepareStatement(sql);
			
			//4. 변수 처리(물음표 채우기)
			//1) 정수: setIne()
			//2) 실수: setDouble()
			//3) 문자열: setString() 메소드 사용
			ps.setString(1, job_id);	 //1번째 ?에 job_id 넣는다
			ps.setString(2, job_title);	 //2번째 ?에 job_title 넣는다
			ps.setInt(3, min_salary);	 //3번째 ?에 min_salary 넣기
			ps.setInt(4, max_salary); 	 //4번쨰 ?에 max_salary 넣기
			
			//5. 쿼리 담당 ps가 쿼리 실행함
			//실행 -> executeUpdate, execute query
			//1) INSERT, UPDATE, DELETE 이고
			//	 int result = ps.executeUpdate();
//				 if (result> 0) [성공]  else [실패]
			//2)  SELECT
//			Result rs = ps.executeQuery();
//			if(rs!=null) {성공}  else [{             ")"]
			result =  ps.executeUpdate();
			if(result > 0) {
				System.out.println(job_id + "이(가) 추가되었습니다.");
			}
			else {
				System.out.println(job_id + "가 추가되지 않았습니다.");
			}
	
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
