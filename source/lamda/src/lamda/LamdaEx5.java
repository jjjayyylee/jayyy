package lamda;

interface MaxNum{
	int getMaxNum(int num1, int num2);
}

public class LamdaEx5 {

	public static void main(String[] args) {
		// 두개의 수중 큰수를  출력 하시오.
		//x>y -> return x
		//x<y -> return y
		
//		MaxNum m= (x,y)->{
//			
//			if(x>y)
//				return x;
//			
//			else
//				return y;
//		};
//		System.out.println(m.getMaxNum(2, 4));
		
//		MaxNum m = (a,b) -> {
//			return (a > b) ? a : b;
//		};
//		System.out.println(m.getMaxNum(4, 6));
		
	MaxNum m = (a,b) -> (a>b)? a:b;
		System.out.println(m.getMaxNum(100, 101));
	}

}
