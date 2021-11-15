package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
//													┌아이피 주소가 들어가는 자리
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "HR";
	private static String password = "1111";
	private static String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	
	public static Connection getConnection() throws Exception{
					//ㄴ 자동완성 필요
		Class.forName(jdbcDriver);
		return DriverManager.getConnection(url, user, password);
				//ㄴ 자동완성 필요
		
	}
	
	
	
	
	
}
