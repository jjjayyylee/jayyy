package tut06;

class Users2{
	String userid;
	String passwd;
	int age;
	
	//생성자
	public Users2() {
		
	}

	// getter,setter
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	
}@Override
public String toString() {
	return "Users2 [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
}



public class UsersEx2 {

	public static void main(String[] args) {
		Users2[] u2 = new Users2[3];
		
		/*for(int i=0; i<u2.length; ++i) {
			u2[i] = new Users2();
			
			u2[i].setUserid("아이디" + i);
			u2[i].setPasswd("비밀번호"+ i);
			u2[i].setAge(i);
			
			System.out.println(i + "번째 회원정보를 출력합니다.");
			System.out.println(u2[i].getUserid()); 
			System.out.println(u2[i].getPasswd());  
			System.out.println(u2[i].getAge());
			System.out.println("---------------------------------------");
			System.out.println("");*/
		
		for(int i=0; i<u2.length; ++i) {
			u2[i] = new Users2();
			u2[i].setUserid("코리아" +i);
			u2[i].setPasswd("비번" +i);
			u2[i].setAge(i);
			
		}
		System.out.println(u2.length + "명의 회원정보가 저장되었습니다.");
		
		System.out.println("");
		System.out.println("회원정보를 출력합니다.");
		
		for(int i =0; i<u2.length; ++i) {
			Users2 member =u2[i];
			System.out.println(member.getUserid());
			System.out.println(member.getPasswd());
			System.out.println(member.getAge());
		}
	}

}
}
