package ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;
import vo.JobVO;

public class Ex01_updateTest {

	public static void main(String[] args) {
		
		//JOB_ID가 DR인 데이터의 MIN_SALARY를 4000으로 수정하고, 
		//MAX_SALARY를 5500으로 수정하시오
		
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		int result = 0;
		
		//JobVO 객체 생성
		//update 문의 실행에 필요한 정보만 담는다
		// -> default 타입으로 생성해서 필요한 정보만 setter 로 저장한다.
		JobVO jobVO = new JobVO();
		
		jobVO.setJob_id("DR");
		jobVO.setMin_salary(4000);
		jobVO.setMax_salary(5500);
		
		try {
			conn = DBConnect.getConnection();
			sql = "UPDATE JOB SET MIN_SALARY = ?, MAX_SALARY = ? WHERE JOB_ID = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, jobVO.getMin_salary());
			ps.setInt(2, jobVO.getMax_salary());
			ps.setString(3, jobVO.getJob_id());
			
			result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println(jobVO.getJob_id() + "(이)가 수정되었습니다.");
			} else {
				System.out.println(jobVO.getJob_id() + "(이)가 수정되지 않았습니다.");
			}
			//result (수정된 데이터의 개수가 반환된다)
			//1) 0: 수정된 row가 0개이다.(실패)
			//2) 1: 수정된 row가 1개이다.(성공) - 대리 row
			//unique 칼럼이기 떄문에 where 조건을 만족하는 데이터는 오직 1개여야만 한다.
			
			//수정은 한 번에 여러 행이 수정될 수 있다!!
			//대리도 수정하고 과장도 수정하고 그럴 경우.. ~result > 0~
		}catch(ClassNotFoundException e) { 
			e.printStackTrace();
		}catch(SQLException e) { 
			e.printStackTrace();
		}catch(Exception e) {  	//classnotFoundException, sqlException 모두 처리
			e.printStackTrace(); //보통 Exception 이거 하나 작성하면 됨..
		}finally {
			try {
				if(ps != null) {
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
