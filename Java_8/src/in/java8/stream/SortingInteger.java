package in.java8.stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingInteger {
	
	public static void main(String[] args) {
		
		Set<Integer> list = new HashSet<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(5);
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println("--------------------");
		System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
	}

}
