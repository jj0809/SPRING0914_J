package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//field - 접속 정보
	private static String user = "HR";
	private static String password = "1111";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//thin: 경량버전 	@127.0.0.1: oracle이 설치된 경로 = localhost로 써도 된다(내 pc이다)
	private static String jdbcDriver = "oracle.jdbc.driver.OracleDriver"; 
	//접속을 담당하는 Oracle 클래스 지정		      ~패키지~		클래스
	//-> 그 이름이 jdbcDriver 이다..
	//패키지는 앞글자 소문자, 클래스는 앞글자 대문자!
	
	//method - connection 객체 생성 및 반환
	public static Connection getConnection() throws Exception {
		//모두 static 처리를 함.. 결과타입 connection: 자동완성해야함(java.sql)
		
		//1. jdbcDriver를 사용할 수 있도록 메모리에 로드한다.
		Class.forName(jdbcDriver); //Class 클래스로 클래스를 로드한다....
		//메모리가 부족해서 안될 경우가 있으므로 빨간 줄이 계속 생겨있음.. > 예외처리 필요
		
		//2. DriverManager 클래스가 접속 정보를 이용해서 접속(Connection)을 생성한다.
		//user,password,url 이용해서 접속 생성 	 	Drivermanager 자동완성필요
		Connection conn = DriverManager.getConnection(url, user, password);
			//connection의 객체 이름은 conn, con 중 하나
			//class를 new 없이 쓰는 것은 static 처리가 되어있다는 것
		//접속도 못 가져올 수 있으므로 빨간 줄.. > 예외처리 필요
		
		//3. 접속 객체 conn 반환
		return conn;
		
		//4. 예외처리
		//Class, DriverManager 클래스는 예외처리를 필수로 해야한다
		//getConnection() 메소드에서 처리하지 말고
		//getConnection() 메소드를 호출하는 영역으로 예외를 던질 것 > 이게 효율적이다...
									//여기서 예외처리 해도 이따 또 예외처리해야해서,, 몰아서 처리하게끔
		/*메소드가 예외 던지는 방법(방법만 제공하면 됨, 반드시 try-catch일 필요는 없다)
		public 결과타입 메소드명() throws Exception {   }
		//어떤 예외일 지 모를때 Exception을 적고, 아니면 예외이름을 적어줌
		*/
		
	}
	

}
