package test;

public class Test01 {

	public static void main(String[] args) {
		// 1~1000미만 자연수에서 3,5배수가 아닌수의 총합을 구하는 프로그램을 작성하시오.
		int sum =0;
		
		for(int i=1; i<1000; i++) {
			if((i%3!=0)&&(i%5!=0))
				sum=sum+=i;
		}
			System.out.println(+sum);
			
		}
	
		
	}


