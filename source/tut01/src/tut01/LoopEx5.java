package tut01;

import java.util.Scanner;

public class LoopEx5 {

	public static void main(String[] args) {
		
		boolean run=true;
		//무한루프-> sc.nex()만나면 입력대기(멈춤)
		
		Scanner sc= new Scanner(System.in);
	       

		while(run) {
			System.out.println("=========================================");
			System.out.println("1.더하기(q) | 2.종료(a제외)");
			System.out.println("=========================================");
			System.out.print("작업내용 입력 >");
			
			String choice = sc.next();
			System.out.println(choice);
			System.out.println("");	
	
			switch(choice) {
			case "a":
				System.out.print("첫 번째 정수를 입력");
				int num1 = sc.nextInt();
				
				System.out.print("두 번째 정수를 입력");
				int num2 = sc.nextInt();
				
				int result = num1+num2;
				
				System.out.println("결과를 출력합니다.");
				System.out.println("두 수의 합은 "+result+"입니다.");
				
				break;
				
				default :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
					
				
				
			}
		
		}
	}

}
