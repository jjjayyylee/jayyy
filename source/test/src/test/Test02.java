package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 출력화면 구성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A(a).입력 | Q(q).종료\n 선택>");
		String s= sc.next();
		
		System.out.println("");
		
		String str="A";
		String str2="Q";

		if(str == "A" || str =="a") {
			System.out.println("koreait");
			
		}else if(str2 == "Q" || str2 =="q"){
			System.out.println("프로그램종료");
			
		}else {
			System.out.println("잘못된 메뉴 선택입니다.");
		}
	}

}
