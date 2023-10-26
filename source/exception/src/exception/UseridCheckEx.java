package exception;

class UseridCheckException extends Exception{

	public UseridCheckException() {
		super();
	}

	public UseridCheckException(String message) {
		super(message);
	}
	
}

class UseridCheck extends UseridCheckException{
	void useridCheck(String uid) throws UseridCheckException {
		if(uid.isEmpty()) {
			throw new UseridCheckException("아이딜를 입력하세요.");
		}else if(uid.length()<8) {
			throw new UseridCheckException("아이디 길이가 짧습니다.\n8이상 ~ 12이하로 입력하세요");
		}else if(uid.length()>12) {
			throw new UseridCheckException("아이디 길이가 너무 깁니다.\n8이상 ~ 12이하로 입력하세요");
		}else {
			System.out.println(uid+ "는 사용하셔도 됩니다.");
					
		}
	}
}

public class UseridCheckEx {

	public static void main(String[] args) throws UseridCheckException {
		
		UseridCheck uc =new UseridCheck();
		uc.useridCheck("1234567891111");
	}
}
