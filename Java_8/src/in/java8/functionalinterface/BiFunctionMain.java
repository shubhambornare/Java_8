package in.java8.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionMain {
	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer, String> f = (i,j)->{
			return "Hello Java";
		};		
		String s = f.apply(6,5);
		System.out.println(s);
	}

}
