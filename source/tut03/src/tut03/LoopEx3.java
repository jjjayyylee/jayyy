package tut03;

public class LoopEx3 {

	public static void main(String[] args) {
		// 1 ~100가지 합을 구하시오
		//while
		//출력예시 : 1~100까지 합은 *** 입니다.
		
		int result =0;//합계가 저장될 변수
		
		int k =1;
		while(k<=100) {
			result += k;
			k++;
		}
		
		System.out.println("1~100 까지의 합은 " +result+" 입니다.");
	}

}
