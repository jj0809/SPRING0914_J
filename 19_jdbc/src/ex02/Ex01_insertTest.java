package ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;

public class Ex01_insertTest {

	public static void main(String[] args) {
		//JOB 테이블에 정보 넣기!!
		
		Connection conn = null; 		//접속 담당  -> 반납 필요
		PreparedStatement ps = null;	//쿼리 담당 - 쿼리 보내고 쿼리 실행 -> 반납 필요
		//prepare 자동완성 psmt로 줄이기도 함
		//최소 위 2가지는 무조건 있어야 함
		
		String sql = null;				//쿼리문 작성용
		int result = 0;					//쿼리문 실행 결과 - (INSERT, UPDATE, DELETE문: 
														//int 타입 결과 반환)
		
		try {
			//1. 접속하기
			conn = DBConnect.getConnection();
			//2. 쿼리문 미리 준비 (preparedStatement를 사용하므로)
				//statement는 그냥 하나 정해서 그거만 맨날 하면 된다고 한다..
			sql = "INSERT INTO JOB (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) "
					+ "VALUES ('GJ', '과장', 4500, 6000)"; //쿼리문 내에 세미콜론 안붙임, 붙여서 넘기면 오류남
			sql = "INSERT INTO JOB (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) "
					+ "VALUES ('DR', '대리', 3500, 5000)"; //쿼리문 내에 세미콜론 안붙임, 붙여서 넘기면 오류남
			
			//3. 준비된 쿼리문을 이용하여 쿼리담당 ps(preparedStatement)를 생성한다.
			ps = conn.prepareStatement(sql);
			
			//4. 쿼리 담당 ps가 쿼리를 실행한다.
			//실행 메소드
			//1) excuteUpdate(): INSERT, UPDATE, DELETE 실행용
			//2) executeQuery(): select 실행용
			
			//쿼리 실행 결과는 쿼리문(sql)에 따라 다르다.
			result = ps.executeUpdate();
			//실행결과 
			//0: INSERT 된 데이터가 0개이다. -> 실패
			//1: INSERT 된 데이터가 1개이다. -> 성공
			if( result > 0) {
				System.out.println("JOB이 추가되었습니다.");
			}else {
				System.out.println("JOB이 추가되지 않았습니다.");
			}
			
			//커밋은 connection에서 오토 커밋이 되어서 커밋 작성하지 않아도 자동으로 된다..
			//기본적으로 setAutoCommit(true) 상태이기 때문에
			//COMMIT 이 필요하지 않다.
			
			/* 자동 커밋을 끄고 수동으로 커밋을 할 수 있다.
			conn.setAutoCommit(false);
			....~ 
			result = ps.executeUpdate();
			if(result > 0) {
				conn.commit(); //수동 커밋
			}*/
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(ps != null) {
					ps.close(); //쿼리담당 반납, 접속보다 먼저 반납함
				}
				if(conn != null) {
					conn.close(); //접속담당 반납
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			//두 번 세 번 실행 불가함~ GJ(job_id)에 아까 sqldeveloper에서 
			//not null과 unique 추가했기 때문
		}
	}

}
