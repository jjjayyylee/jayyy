package tut05;




public class CalEx {
	public boolean isCheck(int num) {
		boolean result = ( num%2!=0)? true : false;
	
	
	
	return result;
	}
	
	
	
	public static void main(String[] args) {
		//정수를 이용하여 홀수면 true,  짝수면 false를 출력하시오.
		Cal c= new Cal();
		System.out.println(c.isCheck(7));
	
	}

}
