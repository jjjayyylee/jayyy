package tut03;

public class LoopBreakEx {

	public static void main(String[] args) {
		//break
		//0~10 까지 출력하시오.
		//단 조건 7까지만 출력하시오.
		for(int i=0; i<10; ++i) {
			if(i > 7) 
				break;
			
			System.out.print(i+" ");
		}
		System.out.println("----------------------------------");
		
		//1~20 까지 홀수만 출력하시오.
		
		for(int j=1; j<20; ++j){
			
			if( j %2 !=0) {
				continue;
			}
		System.out.print(j+" ");
		}
	}

}
