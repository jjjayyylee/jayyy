package tut03;

import java.util.Scanner;

public class PracEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int balance =100000;
		
		boolean run= true;
		while (run) {
		System.out.println("----------------------------------");
		System.out.println("1. 예금 | 2. 출금 |3. 확인 | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택 >");
		int menu= sc.nextInt();
		
		
		switch(menu) {
		case 1 : 
			System.out.print("예금할 금액 > ");
			balance +=sc.nextInt();
			System.out.println("현재잔액"+balance);
	       
			break;
		case 2 :
			System.out.println("출금을 진행합니다. ");
		    System.out.print("출금할 금액 > ");
		    System.out.println(sc.next());
		    balance -=sc.nextInt();
		    System.out.println("현재잔액은 " +balance);
		
			break;
			
		case 3 : 
			System.out.println("잔고를 확인합니다. ");
			System.out.println("현재잔액은 " +balance+"입니다.");
			break;
			
		case 4 : 
			System.out.println("시스템을 종료합니다. ");
			System.exit(0);
			
			break;
			
			default:
				System.out.println("지원하지 않는 기능입니다.");
			
		}
		}
		
		
		
		
		
	

 
	}

}
