package testPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx {
private PreparedStatement pstmt;
public void selectDB() {
		
		ResultSet rs= null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/kordb";
			String id ="kordb";
			String pwd = "1234";
			
			
			Connection conn =DriverManager.getConnection(url,id,pwd);
			String sql ="select * from kordb_member;";
			pstmt =conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("아이디 : "+rs.getInt(1));
				System.out.println("이름 : "+rs.getString(2));
				System.out.println("비밀번호 : "+rs.getString(3));
				System.out.println("가입일 : "+rs.getString(4));
				System.out.println("성별 : "+rs.getString(5));
				System.out.println("자기소개 : "+rs.getString(6));
				
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
}
	public static void main(String[] args) {
		SelectEx sel = new SelectEx();
		sel.selectDB();

	}

}
