package in.java8.functionalinterface;

import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = (i)->{
			return true;
		};
		boolean b = p.test(3);
		System.out.println(b);
	}
}
