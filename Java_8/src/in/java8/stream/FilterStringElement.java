package in.java8.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterStringElement {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ashish");
		list.add("Ravi");
		list.add("Sharad");
		list.add("Vijay");
		list.add("Shubham");
		list.add("Raj");
		
		System.out.println(list.stream().filter(f->f.startsWith("S")).collect(Collectors.toList()));
				
	}
}
