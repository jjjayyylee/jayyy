package tut07;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가입할 회원 수 >");
		int count =sc.nextInt();
		
		Register[] r = new Register[count]; //객체 개수
		System.out.print(r.length);
		
		
		// Scanner를 이용해서 배열 생성 : 3
		// 입력 Scanner
		//for
		for(int i =0; i<r.length; ++i);{
			
		
		System.out.print("이메일 > ");
		String email =sc.next();
		
		System.out.print("비밀번호 > ");
		String pwd =sc.next();
		
		System.out.print("사용자 > ");
		String uname =sc.next();
		
		r[0]= new Register(email,pwd,uname);
		System.out.println( "(i+1)+ 번째 회원이 등록 되었습니다.");
		}
		System.out.println("회원가입이 완료 되었습니다.");
		
	   System.out.println("");
	   System.out.println("====== "+r.length+"명 회원출력 =======");
	   
	   for(Register reg : r) {
		   System.out.println(reg.disp());
		   System.out.println("---------------------------");
	   }
	   
	}
	}


