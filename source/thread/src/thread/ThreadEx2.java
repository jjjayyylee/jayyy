package thread;

class NumCount1 extends Thread{
	public void run() {
		int[] intArr = {1,2,3,4,5};
		for(int i =0; i< intArr.length; ++i) {
			System.out.println(intArr[i]);
		}
		try {
			Thread.sleep(10);
		}catch(InterruptedException ie) {
			
		} 
	}
}

class HanCount1 extends Thread{
	public void run() {
		String [] strArr = {"하나","둘","셋","넷","다섯"};
		for(int i =0; i< strArr.length; ++i) {
			System.out.println(strArr[i]);
			
		}try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
			}	
	}
}
	
public class ThreadEx2 {

	public static void main(String[] args) {
		NumCount1 nc1 = new NumCount1();
		nc1.start();
		
		
		HanCount1 hc1= new HanCount1();
		hc1.start();
		
		
	}
}
