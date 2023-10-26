package jdbcPrj03;

import java.sql.*;

class SelectDao{
	void selectDb() {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null; //while
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp","root","0000");
			
			
			String sql ="select * from member ORDER BY com_id DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //rs 객체배열
			
			System.out.println("======================사원목록 출력==================");
			while( rs.next()) { //한줄씩 값을 가져와서...
				//System.out.println(rs.getInt("com_id"));
				System.out.println("사번 :"+rs.getInt(1)+",이름 : "+rs.getString(2)+",입사일 : "+rs.getDate(3)+",퇴사일 : "+rs.getDate(4));
				System.out.println("--------------------------------------------");
			}
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("연결 실패");
			
		}
		
	}
}

public class JDBCPrj04Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectDao dao = new SelectDao();
		dao.selectDb();
	}

}
