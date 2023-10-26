package exam;

import java.util.Scanner;

public class Pass08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("점수입력 >>");
	int jumsu = sc.nextInt();
	
		if(jumsu>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
