package tut02;

public class PrintEx {

	public static void main(String[] args) {
		// 정수 출력 : 10 진수, 8진수, 16진수로 출력 -> printf();
		          //decimal, O  ,  X
		int num =10;
		//출력값은 10입니다.
		System.out.printf("출력값은 %d 입니다.\n",num);
		System.out.println(String.format("출력값은 %d 입니다.", num));
		System.out.println("");
		
		//8진수 출력값은 10입니다.
		System.out.printf("8진수 출력값은 %o(8) 입니다\n",num);
		System.out.println(String.format("8진수 출력값은 %o(8) 입니다.",num));
		
		//16진수 출력값은 10 입니다.
		System.out.printf("16진수 출력값은 %x(16)입니다.\n",num);
		System.out.println(String.format("16진수 출력값은 %x(16)입니다.",num));
		
		double d =1.2345; //실수 ->f
		//실수값은 10입니다.
		System.out.printf("실수 값은 %.2f입니다.\n",d);
		System.out.println(String.format("실수 값은 %f 입니다.",d));
		
		String str ="Koreait";
		//부산 코리아아이티 아카데미 입니다.
		System.out.println(String.format("부산 %s 아카데미 입니다.",str));
		
		System.out.println("------------------------------------------");
		
		// 타입이 다른 연산 -> 형변환 (캐스팅)
		// 메모리 공간이 적은 값을 큰값에 넣으면 자동 형변환 - 묵시적 형변환 업캐스팅
		// 메모리 공간이 큰값을 작은 값에 넣으면 강제 형변환 - 명시적 형변환 다운캐스팅
		
		// 정수 + 실수 = 실수
		// 정수 + 실수 = 정수
		
		int num2= 5;
		double num3=3.5;
		
		double result = num2 + num3;
		System.out.println(result);
		
		int result2 = num2 + (int)num3;
		System.out.println(result2);
		
		
	}

}
