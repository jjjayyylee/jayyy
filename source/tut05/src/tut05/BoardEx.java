package tut05;

import java.time.LocalDateTime;



class Board{
	private int num;
	private String subject;
	private String writer;
	private LocalDateTime regist = LocalDateTime.now();
	
	
	//getter setter
	//int num
	
	
	
	//출력 메소드
	@Override
	public String toString() {
		return "게시판 [번호 :  " + num + ", 게시물 제목  : " + subject + ", 작성자  : " + writer + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDateTime getRegist() {
		return regist;
	}


	
	
	
	
}

public class BoardEx {

	public static void main(String[] args) {
		// 번호 int, 제목 String, 작성자 String, 작성일 LocalDateTime
		Board b1 = new Board();
		b1.setNum(1);
		b1.setSubject("코리아아이티 게시판 테스트1");
		b1.setWriter("홍길동");
		System.out.println("");
		System.out.println("------------------------------------ 출력 --------------------------------------");
//		System.out.println(b1.getNum());
//		System.out.println(b1.getSubject());
//		System.out.println(b1.getWriter());
//		System.out.println(b1.getRegist());
	System.out.println(b1.toString());
	
	
	
	}

}
