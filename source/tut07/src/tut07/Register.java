package tut07;

public class Register {
	//필드
	private String email;
	private String  pwd;
	private String uname;
	
	
	//생성자 : 파일이름과 동일하면 
	public Register() {	}
	
	public Register(String email, String pwd, String uname) {
		this.email = email;
		this.pwd = pwd;
		this.uname = uname;
	}	
	
	//getter, setter	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
 public String disp() {
	 return "이메일 : "+ getEmail() +",\t 비밀번호 :"+getPwd()+", 이름 :"+getUname();
 }
	
	
	
}
