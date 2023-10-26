package jdbcPrj05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	//sington : 개발자가 한번만 만들어서 공유 (아무나 new를 이용해서 객체 생성 x)
	//1.객체 생성 1번만 작성 : private static
	private static DBConnect db = new DBConnect();
	
	//2. 객체생성 (생성자)도 1번만 그리고 아무나 접근 private
	private DBConnect() {}
	
	//1,2 만들어 놓은 객체 접근하려면 public 이용해서 singleton 접근 메소드 생성
	public static DBConnect getInstance() {
		return db;
	}
	
	//4. 사용할 메소드 작업 하기 : Connection
	Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/mydb";
		String uid ="root";
		String pwd ="0000";
		
		Connection conn = DriverManager.getConnection(url, uid,pwd);
		
		
		return conn;
	}
	
}
