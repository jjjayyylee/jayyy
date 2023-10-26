package ioEx;

import java.io.File;

public class IOEx01 {

	public static void main(String[] args) {
		//파일이 존재하는지 확인
		//파일을 생성하였습니다. or 존재합니다.. =>exist() - boolean
		//io -> open -> close
		
	try {
		//	String filename = "c:\\temp\\koreait.txt";
		//File file = new File("c:"+File.separator+"temp"+File.separator+"koreait.txt");	
		
		String filename = "c:\\temp\\koreait.txt";
		File file = new File("filename");		
		
		if(!file.exists()) {
			boolean result =file.createNewFile();
			if(result)
				System.out.println("파일이 생성되었습니다.");
			
		}else {
			System.out.println("파일이 이미 존재합니다.");
		}
		
		System.out.println(file.getAbsolutePath());
		
		//작업(이클립스) 위치 출력
		System.out.println(System.getProperty("user.dir"));
		
		
	}catch(Exception e) { //최상위 예외 Exception
		e.printStackTrace();
		System.out.println("파일 생성에 오류가 있습니다.");
		
		
	}finally {
		
	}

}
}