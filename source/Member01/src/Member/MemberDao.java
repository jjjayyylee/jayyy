package Member;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	
	Map<String,Member> map = null;
	
	public MemberDao() {
		map = new HashMap<>();
	}
	
	public void putMember(String id, Member m) {
		map.put(id, m);
	}
	public boolean deleteMember(String uid) {
		//Map loop 사용 x
		//true,false
		if(map.containsKey(uid)) {
			map.remove(uid);
			return true;
		}
		return false;
		
		
		
	}
	public void showInfo() {
		map.forEach((key,value)-> {
			Member mem= map.get(key);
			mem.disp();
		});
}
}