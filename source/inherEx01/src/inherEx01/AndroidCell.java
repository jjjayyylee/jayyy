package inherEx01;

public class AndroidCell extends Cell {

	@Override
	void turnOn() {
		System.out.println("안드로이드 운영체제 시작합니다.");
	}

	@Override
	void turnOff() {
		System.out.println("안드로이드 운영체제 종료합니다.");
	}

}
