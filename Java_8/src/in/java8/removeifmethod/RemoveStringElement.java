package in.java8.removeifmethod;

import java.util.ArrayList;

public class RemoveStringElement {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ashish");
		list.add("Ravi");
		list.add("Sharad");
		list.add("Vijay");
		list.add("Shubham");
		list.add("Raj");
		
		list.removeIf(s->s.startsWith("S"));
		System.out.println(list);
		
	}

}
