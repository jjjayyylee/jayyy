package tut03;

public class LoopEx {

	public static void main(String[] args) {
		// 임의 정수값이 0인데 0과 대소를 비교할 때
		/*or(초기값; 조건; 증감값;) {
			출력코드()}*/
	 for (int i = 0; i<0; ++i) {
		 System.out.println(i);
	 }
System.out.println("-----------------------------------");
     /*초기값;
	 * while(조건) {
	 *  출력코드; 
	 *  증감값; }
	 */

			int i=0;
			while(i<0) {
				System.out.println(i);
				++i;
			}
			System.out.println("-------------------------------------");
			/*
			 * 초기값; 
			 * do {출력코드; 
			 * 증감값; }
			 * while(조건);
			 */
			
			int k=0;
			do {
				System.out.println("조건이 틀려도 출력됩니다.");
				k++;
			}while(k<0);
	}

}
