package exam;

// 6. 영문자를 입력 받아 대문자로 변경하는 프로그램 (Scanner +...
import java.util.Scanner;

public class T06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대문자로 변환 할문자 >>");
		String s= sc.nextLine();
		System.out.println(s.toUpperCase()
				);
		

		
	}

}
