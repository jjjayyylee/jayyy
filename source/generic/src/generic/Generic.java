package generic;

class Fruit3{
	void fruit3() {
		System.out.println("과일 입니다.");
	}
}

class Pencil3{
	void Pencil3() {
		System.out.println("연필 입니다.");
	}
}
class Box3<T>{
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
		
}
public class Generic {

	public static void main(String[] args) {
		
	Box3<Fruit3> box1 = new Box3<>();
	box1.setT(new Fruit3());
	
	Fruit3 f2 = box1.getT();
	System.out.println(f2);
	
	}

}
