package inherEx01;

//이름 정하고 -> 내용은 상황에 맞게 고쳐쓰기
//추상화,interface => 표준화




abstract class Computer{
	abstract void powerOn(); 
	abstract void powerOff();
	
}

class IBM extends Computer {

	@Override
	void powerOn() {
		System.out.println("IBM 컴퓨터 스타트...");
		
	}

	@Override
	void powerOff() {
		System.out.println("IBM 컴퓨터 종료...");
		
		
	}
	
}

public class AbsEx {

	public static void main(String[] args) {
	

	}

}
