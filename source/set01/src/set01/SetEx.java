package set01;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
	// HashSet 정수저장
	//HashSet 문자열 저장
	//삭제, 출력
	Set<Integer> set = new HashSet<>();
	set.add(100);
	set.add(200);
	set.add(300);
	//값을 배열 형태로..
	
	
	System.out.println(set.toString());
	System.out.println(set.size());
	
	System.out.println("-----------------------------------");
	
	HashSet<String> hm = new HashSet<>();
	hm.add("Seoul");
	hm.add("Busan");
	hm.add("Seoul");
	System.out.println(hm.toString());
	System.out.println(hm.size());
	
	hm.remove(0);
	hm.remove("Seoul");
	
	for(String str: hm) {
		System.out.println(str);
	}
	
	//검색 배열명.contains(검색어)
	Set<String> set2 = new HashSet<>();
	set2.add("Red");
	set2.add("Green");		
	set2.add("Blue");
	
	//System.out.println(set2.contains("Black"));
	//System.out.println(set2.contains("Red"));
	
	System.out.println("---------------Remove, RemoveAll----------------------");
	set2.remove("Green");
	System.out.println(set2.size());
	
	set2.removeAll(set2);
	
	
	
	}

}
