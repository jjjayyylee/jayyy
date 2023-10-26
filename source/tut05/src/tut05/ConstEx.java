package tut05;

class Const {
 public Const(String str) {
	 System.out.println(str);
 }
	
 public Const(String str,String tel) {
	  this(str);
	  System.out.println(tel);
 }
 
 public Const(String str,String tel,String addr) {
	     this(str,tel);	    
		 System.out.println(addr);
	 }
 
	public int add(int num1, int num2) {
	 
	 return num1 + num2;
 }
 public String close(String str) {
	 return str;
 }
}
public class ConstEx {
	public static void main(String[] args) {
	    //================코리아아이티 계산기 Ver1.0============ 생성자
		//정수 + 정수 = 정수메소드
		//프로그램 종료 -메소드
		
		Const cal= new Const("코리아아이티 계산기 Ver1.0");
		System.out.println(cal.add(100,200));
		System.out.println(cal.close("프로그램 종료"));
		
		
		System.out.println("-----------------------------------");
		//코리아아이티, 전화번호
		Const gwangju = new Const("코리아아이티 계산기 Ver1.0", "051-123-4567","광주");
	}

}
