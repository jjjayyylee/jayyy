package exam;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc00 {

	public static void main(String[] args) {
		Jdbc00 jdbc = new Jdbc00();
		jdbc.insertDB();

	}

	private void insertDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/mydb";
			String id="root";
			String pw="0000";
		
			Connection conn = DriverManager.getConnection(url,id,pw);
			String sql="INSERT INTO register Values(101,'이영희',7777);";
			
			java.sql.Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입이 완료 되었습니다.");
			
		}catch(Exception ex) {
			System.out.println("데이터 접속 실패");
		}
		
	}

}
