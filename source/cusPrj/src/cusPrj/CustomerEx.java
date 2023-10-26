package cusPrj;

import java.sql.SQLException;
import java.util.List;

public class CustomerEx {

	public static void main(String[] args) throws SQLException {
		CustomerDao dao =new CustomerDao();
		
		
		List<Customer> list = dao.getCustomers();
		if(list.isEmpty()) {
			System.out.println("등록된 고객이 없습니다.");
		}else {
			for(Customer c : list) {
				System.out.println(c.toString());
			}
		}
		
	}

}
