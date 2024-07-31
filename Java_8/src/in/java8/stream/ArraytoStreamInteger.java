package in.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraytoStreamInteger {
	
	public static void main(String[] args) {
		
		Integer[] a = {2,4,6,7,8,3,3,6,8};
		
		System.out.println(Arrays.stream(a).collect(Collectors.groupingBy(p->p, Collectors.counting())));
		System.out.println("------------------------");
		Map<Integer, Long> collect = Arrays.stream(a).collect(Collectors.groupingBy(p->p, Collectors.counting()));
		System.out.println(collect);
		
		System.out.println("------------------------");
		List<Integer> b = Arrays.asList(2,4,6,7,8,3,3,6,8);
		System.out.println(b.stream().collect(Collectors.groupingBy(p->p, Collectors.counting())));
		
		System.out.println("------------------------");
		System.out.println(Arrays.stream(a).sorted().distinct().collect(Collectors.toList()));
	}

}
