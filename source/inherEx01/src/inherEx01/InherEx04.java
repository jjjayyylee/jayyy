package inherEx01;

public class InherEx04 {

	public static void main(String[] args) {
		// 생성자를 이용해서 모델, 색상을 저장 후 출력
		Phone p = new Phone("KT","Black");
		p.turnOn();
		p.disp();
		p.turnOff();
		
		System.out.println("------------------------------");
		//Android.java
		//model, color.company -> 생성자
		
		Android ad = new Android("Gallaxy","Silver","SAMSUNG");
		ad.disp();
		

	}

}
