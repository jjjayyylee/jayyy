package jdbcPrj04;

import java.sql.*;

class insertDao{
	void selectDB() {
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://127.0.0.1:3306/shop";
			String uid = "root";
			String pwd ="0000";
			
			conn = DriverManager.getConnection(url,uid,pwd);
			
			String sql ="select * from items order by item_name DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("상품번호 : " + rs.getInt(1)+"");
				System.out.print("상품명 : " + rs.getString(2));
				System.out.println("");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	void insertDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://127.0.0.1:3306/shop";
		String uid = "root";
		String pwd ="0000";
		
		conn = DriverManager.getConnection(url,uid,pwd);
		
		String sql = "INSERT INTO items Values(null,?,?,?,now());";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1,"LG모니터");
		pstmt.setInt(2,200000);
		pstmt.setInt(3,100);
		
		int row = pstmt.executeUpdate();
		if(row >0) {
			System.out.println(row);
			System.out.println("상품등록이 완료되었습니다.");
		}else {
			System.out.println("관리자에게 문의하세요");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class JDBCPrj04 {

	public static void main(String[] args) {
		insertDao dao = new insertDao();
		//dao.insertDB();
		dao.selectDB();

	}

}
