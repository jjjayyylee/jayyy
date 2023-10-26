package tut01;

public class DoubleEx {

	public static void main(String[] args) {
//		double d = 1.0;
//		double d2 = 2.0;
		
		double d, d2;
		d = 1.23456;
		d2 = 2.23456;
		
		//쇼핑몰 -> 1.2 + 2.2 = 3.4
		
		//순수한 숫자를 제외하면 + 연산자는 앞뒤를 연결할때 사용
		
//		0012345-1234567 주민번호의 8번째 숫자를 이용하여 남자 여자를 표시하시오
//		단, %, if 사용해서 표시하시오
		//1이면 남자, 2면 여자로 표시
		int jumin = 2;
         if(jumin % 2==1 ){
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
         String result = (jumin % 2==1 ) ? "남자":"여자";
		System.out.println(result);
		
		
	
		
		

		
	}

}
