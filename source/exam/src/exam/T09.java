package exam;

import java.util.Scanner;

//9. 무작위 값을 배열에 저장 후 짝수만 출력하는 프로그램 (30)
public class T09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("랜덤수 >>");
		int num= sc.nextInt();
		
		System.out.println("랜덤수의 최대값>>");
		int max = sc.nextInt();
		
		int random[] = new int[num];
		
		System.out.println("--------------랜덤수 목록---------------");
		for(int i =0; i<random.length; i++) {
			random[i]=(int)(Math.random()*(max+1));
			System.out.println(random[i] +"");
		}
		System.out.println();
		
		System.out.println("------------짝수 목록 ----------------");
		for(int j=0; j<random.length; j++) {
			if(random[j]%2 ==0) {
				int even[] = random;
				System.out.println(even[j]+"");
			}
		}
}
}