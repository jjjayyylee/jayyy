package staticPrj;

class Member{
	int price =10000;
	static double tax = 0.1;
	
	void method() {
		System.out.println("인스턴스(new) 메소드");
	}
	
	static void staticMethod() {
		System.out.println("Static 메소드");
	}
	
}

public class StaticEx {

	public static void main(String[] args) {
		//인스턴스
		Member m = new Member();
		System.out.println(m.price);
		
		//인스턴스x
		System.out.println(Member.tax);
		
		System.out.println("-------------------------------");
		
		m.method();
		Member.staticMethod();

	}

}
