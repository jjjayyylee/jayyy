package jdbcPrj03;

import java.sql.*;

//동작을 별도 클래스 작업
class DBDao {
	void insertDB() throws ClassNotFoundException, SQLException { //i/o
		//1. 연결 - Connection 객체
		//2. 쿼리실행 : Statement 
		//(3. 결과출력 : ResultSet)
		Connection conn = null;
		Statement stmt = null; // 연결객체.state
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://127.0.0.1:3306/grp";
		String uid = "root";
		String pwd ="0000";
		
		//Class.forName()
		//접속정보
		conn = DriverManager.getConnection(url,uid,pwd);
		stmt = conn.createStatement(); //쿼리 실행하기 위한 사전 작업
		//stmt.execute("INSERT INTO member VALUES(NULL,'서울아이티', now(),now());");
		
		String sql = "INSERT INTO member VALUES(NULL,'서울아이티', now(),now())";
		stmt.execute(sql);
		System.out.println("Insert Complete");
		
		//쿼리실행
		//Comment 출력
		
	}
}



public class JDBCPRrj03Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBDao db = new DBDao();
		db.insertDB();

	}

}
