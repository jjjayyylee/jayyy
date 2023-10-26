package tut01;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int money = 10000;
		int price = 3000;
		int stock = 1;		
		
		boolean run =true;
		
		while(run) {
			System.out.println("=========================================");
			System.out.println("스타벅스 커피 자동 판매기");
			System.out.println("=========================================");
			System.out.println("1.구매(p)| 2. 잔액(b) | 3. 종료(q)");
			System.out.println("메뉴선택 >>>");
			
		}		
		String menu= sc.next();
		
		switch (menu) {
		case "p" :
			System.out.println("구매 완료 되었습니다.");
			break;
		
		
			
		case "b" : 
			System.out.println("잔액확인");
			break;
			
		case "q":
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
			
		
		
 		default:
 			
 		System.out.println("오류가 있습니다./n 다시 실행해 주세요. ");
		

		
	}
	}

}
