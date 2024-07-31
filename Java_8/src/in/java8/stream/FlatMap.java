package in.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("Shubham");
		l1.add("Raj");
		
		List<String> l2 = new ArrayList<>();
		l2.add("Ajay");
		l2.add("Amar");
		
		List<List<String>> l3 = new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		
		System.out.println(l3.stream().flatMap(p->p.stream()).collect(Collectors.toList()));
		
	}
	

}
