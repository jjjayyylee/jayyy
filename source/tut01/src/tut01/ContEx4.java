package tut01;

import java.util.Scanner;

public class ContEx4 {

	public static void main(String[] args) {
		//grade0: Guest님 안녕하세요. g1은 Member님 안녕하세요.  g2는 Admin님 안녕하세요.
	
		int grade = 2;
		
		switch(grade) {
		case 1 : System.out.println("Guest님 안녕하세요.");
		break;
		
		case 2 : System.out.println("Member님 안녕하세요.");
		break;
		
		default :
		System.out.println("admin님 안녕하세요.");
		}
		
	
	
	System.out.println("-------------------------------------------------------------------------------");
	
	//'i' :입력, 's': 출력, "u": 수정, "d":삭제
	Scanner sc= new Scanner(System.in);
	System.out.print("입력(I/i), 출력(S/s), 수정(U/u), 삭제(D/d) > ");
	String str= sc.next();
	
	switch(str) {
	case "I" :
	case "i" :
		System.out.println("데이터베이스에 접속합니다.");
		System.out.println("INSERT INTO member VALUES()");
		System.out.println("회원정보 입력 완료!!");
		break;
		
	case "S":	
	case"s":
		System.out.println("데이터베이스에 접속합니다.");
		System.out.println("SQL 입력 명령어 : SELECT* FROM member");
		System.out.println("회원정보 조회 완료!!");
		break;
	
	case "U":	
	case"u":
		System.out.println("데이터베이스에 접속합니다.");
		System.out.println("UPDATE member SET");
		System.out.println("회원정보 수정 완료!!");
		break;
	
	case "D":
	case"d":
		System.out.println("데이터베이스에 접속합니다.");
		System.out.println("DELETE FROM member");
		System.out.println("회원정보 삭제 완료!!");
		break;
		
	default:
		System.out.println("잘못된 명령어 입니다.");
		System.out.println("프로그램은 종료합니다.");
		System.exit(0);
	
	}
	
	
	}

}
