package Member;

public class MemberEx {

	public static void main(String[] args) {
		
	
		MemberDao dao = new MemberDao();
		
		dao.putMember("u1",new Member("홍길동","1234"));
		dao.putMember("u2",new Member("김철수","0000"));		
		dao.putMember("u3",new Member("이영희","7777"));
		
		
		dao.showInfo();
		
		boolean result = dao.deleteMember("u1");
		if(result)
			System.out.println("삭제 되었습니다.");
		else
			System.out.println("존재하지 않는 key 입니다.");
		
		dao.showInfo();
		
	}
}
