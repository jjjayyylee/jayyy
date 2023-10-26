package tut03;

public class SwitchEx {

	public static void main(String[] args) {
		// 대소문자 값을 처리
		//char
		//A/a ->골드회원, B/b -> 실버회원, 그 외에는 Guest
		
		char grade ='b';
		//문자, 문자열, 정수 => 비교연산자x
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("골드회원 입니다.");
			break;
		
		case 'B' :
		case 'b' :
			System.out.println("실버회원 입니다.");
			break;
			
		default :
		System.out.println("Guest 입니다.");
		}
	
	
	}

}
