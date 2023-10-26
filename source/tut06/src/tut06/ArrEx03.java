package tut06;

/*class Display{
	public void title(String str) {
		System.out.println("코리아아이티 아카데미 계산기");
	}
	
	public String close(String title) {// 프로그램 종료
		return "title";
	}

}
*/

public class ArrEx03 {

	public static void main(String[] args) {
		
		//int[] scores = new int [] {1,2,3,4,5};
		int[] scores = null;
		scores= new int [] {1,2,3,4,5};
		Cal c= new Cal();
		//보낼 때는 값(오른쪽), 받을때는 타입(왼쪽)
	
		Display d =new Display();
		
	

		d.title("컴퓨터 프로그램");
		System.out.printf("평균은 %.2f 입니다.",c.avg(scores));
		System.out.println("");
		System.out.println(d.close("시스템 종료"));
		
	}

}
