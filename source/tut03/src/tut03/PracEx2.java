package tut03;

import java.util.Scanner;

public class PracEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance =100000;
		
		boolean run = true;
		while(run) {
	    System.out.println("----------------------------------");
		System.out.println("1. 예금 | 2. 출금 |3. 확인 | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택 >  ");
		int menu = sc.nextInt();
	
		System.out.println("");
		System.err.println("");
		
		
		switch(menu) {
		case 1 :
			System.out.print("예금할 금액 입력 > ");
			balance+=sc.nextInt();
		    System.out.println("입금되었습니다.");
		    System.out.println("현재 잔액 : "+balance);
		    break;
		    
		case 2 :
			if(balance<1) {
				System.out.println("잔액이 부족합니다.");
				break;
			}else {	
			System.out.println("출금을 진행합니다.");
			System.out.println("현재 잔액 : "+balance);
			System.out.print("출금할 금액 > ");
			balance-=sc.nextInt();
			}
		case 3 :
			System.out.println("현재 잔고를 확인합니다.");
			System.out.println("잔고는 "+balance+"원 입니다.");
			break;
			
	
		case 4 :
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			
			default :
				System.out.println("잘못된 입력 값입니다.");
				break;
		}
		}
		
	}
		
		}
		
		



