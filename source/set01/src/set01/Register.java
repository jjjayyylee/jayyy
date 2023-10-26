package set01;

public class Register {
	private int id;
	private String userid;
	private String passwd;
	
	public Register(int id, String uesrid, String passwd) {
		this.id = id;
		this.userid = uesrid;
		this.passwd = passwd;
	}
	
	public int getId() {
		return id;
	}


	public void disp() {
		System.out.println("회원번호 : "+id+", 회원아이디 :"+userid+", 회원비밀번호 :"+passwd);
	}
	
}
