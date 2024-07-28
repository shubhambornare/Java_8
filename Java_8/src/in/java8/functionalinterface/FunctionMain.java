package in.java8.functionalinterface;

import java.util.function.Function;

public class FunctionMain {
	
	public static void main(String[] args) {
		
		Function<Integer, String> f = (i)->{
			return "Hello Java";
		};		
		String s = f.apply(6);
		System.out.println(s);
	}

}
