package tut05;

public class LoginEx3 {
	public static void main(String[] args) {
		//이메일 비번 로그인시간
				Login3 person = new Login3();
				
				person.setEmail("mail@mail.com");
				person.setPasswd("1234");
				
				System.out.println("-----------Getter 출력-----------");
				System.out.println(person.getEmail());
				System.out.println(person.getPasswd());
				System.out.println(person.getNow());
				
				
				System.out.println("-----------메소드 출력-----------");
				System.out.println(person.toString());
	}
}
