package ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;
import vo.JobVO;

public class Ex03_insertTest {
	public static void main(String[] args) {
		
		Connection conn = null; //접속 담당
		PreparedStatement ps = null; //쿼리 담당
		String sql = null; //쿼리문
		int result = 0;
		
		//JobVO 객체 생성
		//JobVO: JOB테이블에 데이터를 보내기 위함..
		//DB와의 통신용으로 사용됨
		JobVO jobVO = new JobVO();
		jobVO.setJob_id("SW");
		jobVO.setJob_title("사원");
		jobVO.setMin_salary(3000);
		jobVO.setMax_salary(4500);
		
		try {
			//1. 접속
			conn = DBConnect.getConnection();
			
			//2. 미리 준비한 쿼리
			sql = "INSERT INTO JOB VALUES (?, ?, ?, ?)";
			
			//3. 쿼리 담당 PS
			ps = conn.prepareStatement(sql);
			
			//4. 쿼리문 변수 처리
			ps.setString(1, jobVO.getJob_id()); //객체로 바꼈기 때문에 getter 사용
			ps.setString(2,	jobVO.getJob_title());
			ps.setInt(3, jobVO.getMin_salary());
			ps.setInt(4, jobVO.getMax_salary());
			
			//5. 쿼리문 실행
			result = ps.executeUpdate();
			//확인문 출력
			if(result > 0) {
				System.out.println(jobVO.getJob_id() + "이(가) 추가되었습니다.");
			}else {
				System.out.println(jobVO.getJob_id() + "이(가) 추가되지 않았습니다.");
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null){
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//main
}
