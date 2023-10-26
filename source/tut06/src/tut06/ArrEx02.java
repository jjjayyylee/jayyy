package tut06;

import java.util.Arrays;

public class ArrEx02 {

	public static void main(String[] args) {
		// 타입[] 이름 =new 타입[]{1,2,3,4,5}
		
		//값을 출력
		
		//배열에 있는 값을 확인
		
		int[] arr = new int[] {1,2,3,4,5};
		
		boolean[] arr2 = new boolean[] {true,false};
		
		double[] arr3 = new double[] {0.0, 0.1, 0.2};
		
		String[] arr4 = new String[] {"Red", "Green","Blue"};
		
		
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(Arrays.toString(arr2));
		
		
		//정수는 100입니다.
		for(int i=0; i<arr.length; ++i) {
			System.out.println("정수는 "+arr[i]+" 입니다.");
			
		}
		
		System.out.println("향상된 for");
		for(int v : arr) {
			System.out.println("정수는"+v+" 입니다.");
		
		}
		
		System.out.println("----------------------------");
		
		for(boolean b : arr2) {
			System.out.println(b);
		}
		
		System.out.println("---------------------------");
		for(String s : arr4) {
			System.out.println(s);
		}
		
		
		
	}

}
