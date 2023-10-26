package jdbcPrj04;

import java.sql.*;

class ItemCrud{
	
	void selectItem() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt;
		ResultSet rs =null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://127.0.0.1:3306/shop";
		String uid = "root";
		String pwd ="0000";
		
		conn = DriverManager.getConnection(url,uid,pwd);
		String sql ="select * from items order by item_id desc";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {// 디비 -> 객체 -> 화면출력
			Items item = new Items(); // Items.java
			
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setItemPrice(rs.getInt(3));
			item.setItemStock(rs.getInt(4));
			item.setItemDate(rs.getString(5));
			
			System.out.println(item.toString());
		}
	}
	
	void insertItem() {
		Connection conn = null;
		PreparedStatement pstmt;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://127.0.0.1:3306/shop";
			String uid = "root";
			String pwd ="0000";
			
			conn = DriverManager.getConnection(url,uid,pwd);
			String sql= "insert into items values(null,?,?,?,now());";
			pstmt = conn.prepareStatement(sql);
			
		   Items item = new Items(); //임시값을 객체저장
		   item.setItemName("한돈");
		   item.setItemPrice(1000000);
		   item.setItemStock(10);
		   
		   pstmt.setString(1, item.getItemName()); //실제db저장
		   pstmt.setInt(2, item.getItemPrice());
		   pstmt.setInt(3,item.getItemStock());
		   int row = pstmt.executeUpdate();
		   
		   if(row>0) {
			   System.out.println(item.getItemName()+" 상품등록이 완료 되었습니다.");
		   }else {
			   System.out.println("상품등록에 실패 하였습니다.\n 확인하세요");
		   }
		   
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}



public class ItemsEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ItemCrud crud = new ItemCrud();
		crud.selectItem();

	}

}
