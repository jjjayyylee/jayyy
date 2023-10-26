package tut06;

public class ArrEx {

	public static void main(String[] args) {
		//배열 + 반복문 (for - 배열번호, 향상된 for - 값만 출력)
		//정수 100개를 값을 저장하는 프로그램을 완성하시오.
		
		int [] value = new int[3];
		value[0]= 100;
		value[1]= 200;
		value[2]= 300;	
		//배열 0 ~ 2번까지 출력하시오
		//배열명[인덱스]
		//for
		
		//value[0]의 값은 0입니다.
		//1번 값은 100입니다.
		//2번 값은 200입니다.
		//3번 값은 300입니다.
		
		for(int i=0; i<3; ++i) {
		  //System.out.println(value[i]);
	      //System.out.println("value["+i+"]의 값은"+ value[i]+"입니다.");
			//System.out.println((i+1)+"번 값은 "+value[i]+"입니다.");
		
		  }
		

		
		System.out.println("----------------------------------------");
		//int[] num ={1,2,3,4,5};
		//초기값을 설정하면 배열 개수가 생성
		//학생 3명 점수를 초기값으로 설정 후
		//화면에 출력하시오
		//합계를 출력하시오
		//평균은 출력하시오
		int[]jumsu = {88,77,66,55,44,93};
		
		System.out.println("등록된 학생 수는 "+jumsu.length+"명 입니다.");
		System.out.println("=============  화면출력  ================");
		
		for(int i=0; i<jumsu.length; ++i) {
			System.out.println(jumsu[i]+ " ");
		}
		
		System.out.println("=============  합계출력  ================");
		//합계 : 누적(전역, static)
		
		int sum =0;
		for(int i=0; i<jumsu.length; ++i) {
			System.out.println(""+(i+1)+"번 점수는 "+jumsu[i]+"입니다.");
			sum= sum+jumsu[i];
		}
		System.out.println("합계는"+sum+"입니다.");
		
		System.out.println((double)sum/jumsu.length);
		double result =(double)sum/jumsu.length;
		
		//출력포맷 변경 소수점 2자리로 설정
		//평균은 70.5 입니다.
		System.out.println(String.format("평균은 %.2f, result입니다." ));
				
				
		
	}
}
