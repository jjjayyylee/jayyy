package tut01;

import java.util.Scanner;

public class Cont3Ex {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		
		System.out.print("점수 입력(숫자:0~100점) >");
		int jumsu =sc.nextInt();
		
		
	String str= "";
		
	if(jumsu>=91 && jumsu<=100 ) 
			str="A등급";
		
	else if(jumsu>=81 && jumsu<=90 )
		
			str="B등급";
			
	else if(jumsu>=71 && jumsu<=80) 
			str="C등급";
			
	else 
    		str="F등급";
	}	
}
