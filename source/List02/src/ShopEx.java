
public class ShopEx {

	public static void main(String[] args) {
		
		
		// 홍길동만 쓸수 있는  List 배열 공간을 만들어
		Seller seller = new Seller(10001,"홍길동");
		
		seller.addItem("삼성 노트북",10000000,10);
		seller.addItem("무선마우스", 50000, 999);
	    seller.showMemberInfo();
				
				System.out.println();
				System.out.println("-----------------------------------")
				System.out.println();
				
			Seller seller2 = new Seller2(10002," 김철수 ");	
			seller.addItem("LG 노트북",10000000,10);
			seller.showMemberInfo();
	}

}
