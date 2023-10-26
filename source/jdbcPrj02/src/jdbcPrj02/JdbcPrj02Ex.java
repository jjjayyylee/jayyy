package jdbcPrj02;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcPrj02Ex {

	public static void main(String[] args) {
		JdbcPrj02Ex jdbc = new JdbcPrj02Ex();
		jdbc.insertDB();

	}

	private PreparedStatement pstmt;
	

	public void insertDB() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/kordb";
			String id ="kordb";
			String pwd = "1234";
			
			
			Connection conn =DriverManager.getConnection(url,id,pwd);
			String sql ="INSERT INTO kordb_member VALUES(null,?,?,now(),?,?);";
			pstmt =conn.prepareStatement(sql);
					
			pstmt.setString(1,"김영희");
			pstmt.setString(2,"123456");
			pstmt.setString(3,"남자");
			pstmt.setString(4,"hello");
			
			int row = pstmt.executeUpdate();
			
			if(row>0) {
			System.out.println("등록되었습니다.");
			}else {
				System.out.println("등록실패");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
