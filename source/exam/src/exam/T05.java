package exam;
// 5. 3의배수 5의 배수 출력
public class T05 {

	public static void main(String[] args) {
		System.out.print("1~100 3의 배수이면서 5의 배수 출력 : ");
		for(int i=1; i<=100; i++) {
			if((i%3==0)&&(i%5==0)) {
				System.out.print(i+ " ");
			}
	}
	}

}
