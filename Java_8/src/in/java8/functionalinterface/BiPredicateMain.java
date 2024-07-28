package in.java8.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateMain {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p = (i,j)->{
			return true;
		};
		boolean b = p.test(3,6);
		System.out.println(b);
	}
}
