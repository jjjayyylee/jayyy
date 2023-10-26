package list03;

import java.util.ArrayList;
import java.util.List;

public class memberDao {
	List<Member> list = null;
	
	public memberDao(){
		list = new ArrayList<>();
	}
	
	public void addMember(Member m) {
		 list.add(m);
	}
	
	public void showMember() {
		for(Member mem : list) {
			System.out.println(mem);
			System.err.println("--------------------------------------");
		}
	}
	
	public void deleteMember(int id) {
		//저장자료 -> memberID == id -> 배열.remove(배열번호)
		for(int i=0; i < list.size(); ++i) {
			if(list.get(i).getMemberID() ==id) {
				list.remove(i);
				System.out.println(id+ " 회원번호를 삭제 하였습니다.");
			}
		}
			System.out.println("");
	}
		
	public void findById() {
			
		}
	}

