package exception00;

class UseridCheckException extends Exception{
	
	public UseridCheckException() {}
	
	public UseridCheckEXception(String message) {
		super(message);
	}
}

class UseridCheck extends UseridCheckException{
	void useridCheck(String uid) {
	if(uid.isEmpty()) {
		throw new UseridCheckException("아이디를 입력하세요.")
		
	}else if( uid.length()<8) {
		throw new UseridCheckException("아이디 길이가 짧습니다.\n8이상 ~ 12이하로 입력하세요")
	}else if(uid.length()<12) {
		throw new UseridCheckException("아이디 길이가 너무 깁니다.\n8이상 ~ 12이하로 입력하세요")
	}else {
		System.out.println(uid + "사용하셔도 되는 아이디 입니다.");
	}
}
public class UseridCheck {

	public static void main(String[] args) {
		
		UseridCheck uc =new UseridCheck();
		uc.ueridCheck("123456789");
	}

}