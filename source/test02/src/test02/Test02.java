package test02;

public class Test02 {

	public static void main(String[] args) {
		// <작업 지시 사항>
//- 8, 3 , 1,  6, 2, 4, 5, 9 값을 배열에 입력하여 평균을 구하는 프로그램을 작성하시오.(40점)
//- 단, 평균은 메소드로 작성하여 평균 값을 구한 후 출력 하시오.
//- 평균 값은 소수점 2자리까지 출력하시오
		int[] num = new int[]{8, 3 , 1,  6, 2, 4, 5, 9};
		double sum=0, avg=0;
		
		for(int i=0;i<num.length;i++)
		{ sum+=num[i];
		       }
		double result=sum/(num.length);
		 
		 String resultS = String.format("%2f",result);
		 System.out.println("평균값: "+ resultS);
	}

}
