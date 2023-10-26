package tut01;

public class CastEx {

	public static void main(String[] args) {
		//묵시적 형변환 = 업캐스팅(자동형변환) : 작은 => 큰 100 int i => float 
				
		//명시적 형변환= 다운 캐스팅 : 큰 -> 작  => float f2 => int
		float f2 =3.445f;
		int num = (int)f2;
		
		System.out.println(num);

	    System.out.println("--------------------------------");
            
	    
	    int cnt =3;
	    int sum = 100;
	    
	     double avg =0.0;
	    
	   avg = (double) sum/cnt;
	    System.out.println(avg);
	    
		

	}

}
