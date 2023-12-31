package set01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		// String -> 출력 -> 삭제 -> 출력
	    
		Set<String> set = new HashSet<>();
		set.add("U.S.A");
		set.add("Korea");
		set.add("Japan");
		
		System.out.println("------------------for2------------------");
		for(String str : set) {
			System.out.println(str);
		}
		
		//set.clear();
		
		System.out.println("-----------------while-----------------");
		
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}

}
