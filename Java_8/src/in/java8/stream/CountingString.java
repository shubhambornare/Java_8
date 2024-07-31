package in.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountingString {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Raj");
		list.add("Raj");
		list.add("Shubham");
		list.add("Shubham");
		list.add("Shubham");
		list.add("Amit");
		
		System.out.println(list.stream().collect(Collectors.groupingBy(p->p, Collectors.counting())));
		
	}

}
