package tut05;

import java.time.LocalDate;

public class Login3 {
	//필드	
		private String email;
		private String passwd;
		private LocalDate now = LocalDate.now();
		
	//생성자
		public Login3() {
		System.out.println("로그인 정보를 출력합니다.");
	}


	//getter, setter
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public LocalDate getNow() {
		return now;
	}







	@Override
	public String toString() {
		return "Login2 [email: " + email + ", passwd: " + passwd + ", now: " + now + "]";
	}


}
