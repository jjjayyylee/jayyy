package lamda;

interface Hello{
	String greeting(String str);
}

public class LamdaEx3 {

	public static void main(String[] args) {
		Hello h = (a)->{
			return a;
				};	
			System.out.println(h.greeting("Hello, koreait"));
	}

}
