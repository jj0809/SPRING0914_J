package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnect;
import dto.JobDTO;

/* DAO: Database Access Object
 * DB에 접근하는 객체
 * -> CRUD를 처리하는 객체
 * -CRUD-
 * CREATE: INSERT
 * READ	 : SELECT
 * UPDATE: UPDATE
 * DELETE: DELETE
 * 
 * 
 * 다오를 어떻게 만들고 그런건 공부하지 않아도 된다...
 */


public class JobDAO {
	//field
	private Connection con; //자동으로 null 되어 있음
	private PreparedStatement ps;
	private String sql;
	private int result;
	private ResultSet rs;//select 용..
	
	//constructor
	public JobDAO() {
		//접속을 여기서 하면 깔끔하다.. 원래 이렇게 만들지는 않는다..? 외우지 마라!
		//접속만 해 두자..
		//con = DBConnect.getConnection(); //throws exception 때문에 빨간줄이 나와용
		
		try {
			con = DBConnect.getConnection(); //try-catch로 처리
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//method
	
	/* **** 1. 삽입 메소드 **** */
	public int insert(JobDTO dto) {
		//이미 jobmanager의 위에서 다오를 만들었으므로
		//connection이 존재함.. connection을 이 안에서
		//만들 필요가 없음
		try {
			sql = "INSERT INTO JOB VALUES (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getJob_id());
			ps.setString(2, dto.getJob_title());
			ps.setInt(3, dto.getMin_salary());
			ps.setInt(4, dto.getMax_salary());
			
			result = ps.executeUpdate();
			
		}catch( Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				} //conn은 생성도 안했으니까 삭제도 안해도 된다.
			}catch (Exception e) {
				e.printStackTrace();
			}
		}// try-catch
		return result;
	} //insert

	/* **** 2. 업뎃 메소드 **** */
	public int update(JobDTO dto) {
		try {
			sql = "UPDATE JOB SET MIN_SALARY = ?, MAX_SALARY = ? WHERE JOB_ID = upper(?)";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getMin_salary());
			ps.setInt(2, dto.getMax_salary());
			ps.setString(3, dto.getJob_id());
		
			result = ps.executeUpdate();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) {
					ps.close();
				} //con은 DAO의 생성과 더불어 만들었기 때문에 반납 안함
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//try-catch
		return result;
	}//update

	/* **** 3. 삭제 메소드 **** */
	public int delete(String job_id) {
		try {
		sql = "DELETE FROM JOB WHERE JOB_ID = UPPER(?)";
	//	sql = "DELETE FROM JOB WHERE JOB_ID = " + job_id; //도 가능
		ps = con.prepareStatement(sql);
		ps.setString(1, job_id);
		result = ps.executeUpdate();
		}catch( Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) {
					ps.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}//delete
	
	/* **** 4. 검색 메소드 **** */
//	public JobDTO select(String job_id) {
//		JobDTO dto = new JobDTO();
//		try
//		{
//			sql = "SELECT * FROM JOB WHERE JOB_ID = UPPER(?)";
//			
//			ps = con.prepareStatement(sql);
//			ps.setString(1, job_id);
//			result = ps.executeUpdate();
//			dto.setJob_id(job_id);
//		
//			if(result <= 0) {
//				System.out.println("찾는 사람이 없음");
//				dto.setJob_id(null);
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {if(ps != null) { ps.close();}
//			} catch(Exception e) { e.printStackTrace();	}
//		}
//		return dto;
//	}//select
	
	//쌤
	public JobDTO select(String job_id) {
//		JobDTO dto = new JobDTO(); 이렇게 통째로 붙이는 것은 좋지 않음
		//검사 안하고 dto를 그냥 만든 것이라 반환값처리할 때 무조건 만들어진 객체가 넘어가게 된다.
		JobDTO dto = null; //선언만 해둘 것
		try {
			sql = "SELECT * FROM JOB WHERE JOB_ID = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, job_id);
			rs = ps.executeQuery();
			
			if (rs.next()) { //검색된게 있으면
				dto = new JobDTO(); //검색된게 없으면 dto가 생성안됨
				dto.setJob_id(rs.getString(1)); // 컬럼1
				dto.setJob_title(rs.getString(2)); //컬럼2
				dto.setMin_salary(rs.getInt(3));
				dto.setMax_salary(rs.getInt(4));
				
			}
			//검색된거 없으면 dto = null;
			//검색된거 있으면 new jobdto가 나옴
		}catch( Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) { rs.close();}
				if(ps != null) { ps.close();}
			} catch(Exception e) {e.printStackTrace();}
		}//finally
	return dto;	
	}
	
} //dao

