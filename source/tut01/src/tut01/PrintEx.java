package tut01;

public class PrintEx {

	public static void main(String[] args) {
		// 정수5와 8의 합을 출력하시오.
		//변수선언, 초기화 = 선언과 초기화를 동시
		
//		int num1, num2; //선언
//		num1=5; //초기화
//		num2=8;
		
		//변수이름 첫글자는 소문자
		int num1 = 5;
		int num2 = 8;
		
		//결과값을 변수에 저장 후 출력
		
		int result=num1+ num2;
		
		System.out.println(result);
	    System.out.println(num1+num2);
	   System.out.println("");
	   System.out.println("");
	   System.out.println("");
	   //byte(1) -> int(4) -> float(4) ->double(8)
	   //0,1 => 1byte =8bit =>2*8 =>256
	   //byte = 음수(-128), 0 ,양수(+127)
	   
	  System.out.println("------------------------------");
	  
	  //10억 넘어가면 ~
	  long money = 10000000000L;
	  
	  double PI = 3.1425475678F;
	  System.out.println(PI);
	  
	  double POINT = 0.1;
			  
			  //char : 문자, '',2byte,ASCII,숫자로 형변환 가능 (타입캐스팅)
			  //boolean : true,false (따옴표 사용하면 x)
			  //if와 사용
			  char c= 'k';
			  System.out.println(c);
			  System.out.println((int)c);
			  System.out.println((char)107);
			  boolean b= false;
			  
			  //true 면 통과, false면 실패
			  //if 와 사용
			  // 문자열은 값이 같다는 equals() 외에는 같다는 ==
			  
			   if(b==false) 
				   System.out.println("실패");
			    else 
				   System.out.println("성공");
			   
			   System.out.println("----------------------------------");
			   
			   boolean run=true;
			   if(!run) 
				   System.out.println("실패");
			   else
					   System.out.println("성공");
			   
			   //(조건)? "참일떄":"거짓일때"
			 char grade =(!run)?  'A': 'F';
			   
				 
			 
	   
	
	
	}
	   
}
