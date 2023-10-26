package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx {

	public static void main(String[] args) throws IOException {
		/* 입출력
		 1. 1byte : 텍스트,파일,이미지
		 (1) OutputStream/InputStream
		 
		 2. char : 텍스트 전용 
		 
		  
		 */
		
		//파일생성
		String filename = "koreait.txt";
		File f = new File("c:\\temp\\"+filename); 
		
		//파일+글쓰기 : OutputStream = FileOutputStream
		
		OutputStream os = new FileOutputStream(f);
		os.write('K');
		os.write('o');
		os.write('r');
		os.write('e');
		os.write('a');
		os.write('i');
		os.write('t');
		
		os.flush();
		os.close();
		

		
		
		
		
		
		
		
	}

}
