package cusPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	
	// 연결객체
	Connection conn = null;
	PreparedStatement pstmt =null;
	ResultSet rs =null;
	
	CustomerDao dao = null;
	
	Connection getConnection() {
	
		
		try {
			String url ="jdbc:mysql://localhost:3306/mydb";
			String id= "root";
			String pwd = "0000";
			
			//접속에 필요한 드라이버'
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	//입력
	void setCustomer() throws SQLException {
		PreparedStatement pstmt =null;
		
		 dao = new CustomerDao();
		dao.getConnection(); //db 연결완료...
	
		String sql = "INSERT INTO customers VALUES(?,?,?,?,now ());";
		pstmt = dao.getConnection().prepareStatement(sql);
		
		//db 저장하기 전에 setter 에 임시 저장
		Customer c= new Customer();
		c.setId(101);
		c.setEmail("mail@mail.com");
		c.setName("홍길동");
		c.setSalary(10000000);
		
		
		pstmt.setInt(1, c.getId());
		pstmt.setString(2, c.getEmail());
		pstmt.setString	(3, c.getName());
		pstmt.setInt(4, c.getSalary());
		
		int row = pstmt.executeUpdate();
		
		if(row>0) {
			System.out.println("고객등록이 완료 되었습니다.");
		}
	}
	
	//출력
	List<Customer> getCustomers() throws SQLException {
		//Collections 이용
		//빈줄, 빈칸 -> 값 삽입 -> 객체.add();
		List<Customer> list = new ArrayList<>();
		
		dao = new CustomerDao();
		conn = dao.getConnection();
		
		String sql ="SELECT* FROM customers ORDER BY id DESC";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			Customer cu = new Customer();
			
			
			cu.setId(rs.getInt(1));
			cu.setEmail(rs.getString(2));
			cu.setName(rs.getString(3));
			cu.setSalary(rs.getInt(4));
			cu.setRegdate(rs.getString(5));
			
			list.add(cu);
			
			
		}
		
		return list;
	}
}
