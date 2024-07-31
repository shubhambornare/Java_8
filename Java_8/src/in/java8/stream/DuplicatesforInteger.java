package in.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesforInteger {
	
public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(5);
	
		list.stream().distinct().forEach(p->System.out.println(p));
		System.out.println("--------------");
		System.out.println(list.stream().collect(Collectors.toSet()));
	}
}
