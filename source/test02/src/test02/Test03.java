package test02;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 하이픈(-)을 기준으로 주민번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 주민등록번호(001234-1234567)을 이용하여 1,3이면 남자, 2,4면 여자가 출력되게 프로그램을 작성하시오.
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("주민등록번호 입력 >>");
			String jumin = sc.next();
			char str = jumin.charAt(7); 
			String gender = ((str%2 == 0) ||(str%4 == 0)) ? "여자" : "남자" ; 
			
	        
			System.out.println("성별은 " + gender + "입니다.");



	}

}
