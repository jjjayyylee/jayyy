package exam;

//7. 영문자 출력, do~while로 프로그램 작성
public class T07 {

	public static void main(String[] args) {
		//for( char i ='a'; i<='z'; i++) {
			//System.out.println("영문 : "+ i);
		//}
		char i ='a';
		
		do {
			System.out.print(i++ +" ");
		}while(i<='z');
	}

}
