package tut04;

public class HelloEx2 {
	 //접근제한 리턴 메소드(){          //  이것만으로 화면출력 x
	   //return 값;
	//}
	public String title(String company) {
		return company;		
	}
	

	public static void main(String[] args) {
		// 부산 코리아아이티 아카데미
		// 서울 코리아아이티 아카데미
		// 광주 코리아아이티 아카데미
		HelloEx2 he= new HelloEx2();
		System.out.println(he.title("부산 아카데미"));
		System.out.println(he.title("서울 코리아아카데미"));
		System.out.println(he.title("광주 koerait"));

	}

}
