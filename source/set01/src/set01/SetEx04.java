package set01;

public class SetEx04 {

	public static void main(String[] args) {
		RegisterDao dao = new RegisterDao();
		dao.addRegister(new Register(101,"홍길동","1111"));
		dao.addRegister(new Register(102,"김철수","2222"));
		dao.addRegister(new Register(103,"이영희","3333"));
	}

}
