package tut01;

public class StringEx22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str= "korea it academy";
		System.out.println(str.length());
		
		System.out.println(str.replaceAll("it", "IT"));
		System.out.println("------------------------------");
		
	// 주민번호를 이용해서 1이면 남자,2면 여자로 화면에 표시하시오.
		String jumin="001231-2234567";
	
		//변수명. substring(사진인덱스, 찾을값의 인덱스+1)
//		System.out.println(jumin.length());
//		System.out.println(jumin.substring(7));
		System.out.println(jumin.substring(7, 8));
		int gender = Integer.parseInt(jumin.substring(7, 8));
		if (gender % 2==0)
			System.out.println("Female");
		else
			System.out.println("male");
		
		
		
		
		
			
	}

}
