package tut01;

public class Logicex {

	public static void main(String[] args) {
		//&& : 조건 모두 = AND = 이면서, 이고
		//조건1을 만족하면서 조건2도 만족하는 결과를 출력하시오
		
		boolean val1= true;
		boolean val2= true;
		System.out.println(val1 && val2);
		
		//||: 조건 중 하나라도 =or 또는, 이거나
		// 조건1을 만족하거나 조건2도 만족하는 결과를 출력하시오
	int jumin=4;
	if(jumin %4 ==1 || jumin%4 == 3)
		System.out.println("남자");
	else 
		System.out.println("여자");
		
		
			

		
		
	}

}
