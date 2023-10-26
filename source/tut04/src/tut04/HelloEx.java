package tut04;

public class HelloEx {
	
	//매개변수는 있을 수도 있고, 없을수도
	//public(아무나) private(나만:캡슐화)
	
	/*
	 * 접근제한자 리턴타입 메소드명(매개변수) { 
	 * return 변수명; 
	 * }
	 * sysout(리턴타입->void), sysout(타입)
	 * 
	 */
	
	public void title(String str) {
		System.out.println( str+"koreait 아카데미");
		//부산 koreait 아카데미
		//서울 koreait 아카데미
		//광주 koreait 아카데미
	}
	public void info(String tel,String add) {	
		System.out.println("전화번호:"+tel);
		System.out.println("주소 : "+add);	
	}
	
	
	public static void main(String[] args) {
		
		//코리아아이티 아카데미
		//전화번호,주소
		//코리아아이티 아카데미
		
		HelloEx busan=new HelloEx();
		busan.title("부산");
		busan.info("051-123-4567", "부산광역시");
		
		busan.title("부산");
		System.out.println("-----------------------------------------------");
		
		 HelloEx seoul =new HelloEx();
		 seoul.title("서울");
		 seoul.info( "02-123-4567", "서울특별시");
			 seoul.title("서울");
		 
			
		 
		 System.out.println("---------------------------------------------");
		 
		 HelloEx gwangju =new HelloEx();
		 gwangju.title("광주");
		 gwangju.info( "063-123-4567", "광주광역시");
		 gwangju.title("광주");
		                  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
