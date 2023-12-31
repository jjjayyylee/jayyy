package jdbcPrj01;

import java.sql.DriverManager;

public class JdbcPrj01Ex {

	public static void main(String[] args) {
		// 데이터 입출력 : try ~ catch() 또는 메소드 이름 옆에 throws
		JdbcPrj01Ex jdbc = new JdbcPrj01Ex();
		jdbc.mysqlConnect();
		
	}
	
	void mysqlConnect() {//mysql 접속 동작
		try {
			// 1. jdbc 연결 : Class.forName();
			// ver 5 : Class.forName("com.mysql.cj.jdbc.Driver")
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 연결정보 Conection
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd ="0000";
			
			
			DriverManager.getConnection(url,id,pwd);
			
			// 3. 확인
			
			System.out.println("데이터베이스 연결 완료");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
