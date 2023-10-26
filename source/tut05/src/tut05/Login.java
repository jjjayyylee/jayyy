package tut05;

public class Login {
	private String userid;
	private String passwd;
	private int age;
    

	
	public static void main(String[] args) {
		Login web = new Login();
		web.userid = "aaa";
		web.passwd = "1234";
		web.age =10;
		System.out.println("아이디는 "+ web.userid+ " 입니다.");
		System.out.println("아이디는 "+ web.passwd+ " 입니다.");
		System.out.println("아이디는 "+ web.age+ " 입니다.");
		System.out.println("===================================");
		
		Login grp = new Login();
		grp.userid = "bbb";
		grp.passwd = "7777";
		web.age =10;
		
		
		System.out.println("아이디 : "+grp.userid+" \t, 비밀번호 :"+grp.passwd+"\t, 나이 : "+grp.age+"");
}

}