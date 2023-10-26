package tut01;

public class StringEx3 {

	public static void main(String[] args) {
		String title ="korea it academy";
	    System.out.println(title.toUpperCase());
	    System.out.println("---------------------------------");
	    
	    String menus ="Home:company:contact:1:*:^^";
	    //System.out.println(menus.split(":"));
	    String[] s = menus.split(":");
//	    for(String result: s) {
//	    	System.out.println(result);
//	    }
//	    System.out.println(s[0]);
//	    System.out.println(s[1]);
//	    System.out.println(s[2]);
	    		
	    
	    		for(int i =0; i<s.length; ++i) {
	    			System.out.println(s[i]);
	    					
	    		}
	    		System.out.println(s.length);
	    		
	    		System.out.println("---------------------------------");
	    		//정수 생성 후 초기값은 100
	    		//출력 : 생성된 변수의 초기값은 100입니다.
	    		
	    		int num=100;
	    		System.out.println("초기값"+ num+ " 입니다.");
	    		
	    		
	    		System.out.printf("생성된 변수의 초기값은 %d 입니다.",num);
	    		String str = "부산";
	    		
	    		System.out.println();
	    		System.out.printf("내가 사는곳은 %s 입니다.",str);
	    
	}

}
