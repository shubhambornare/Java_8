package in.java8.functionalinterface;

import java.util.function.Supplier;

public class SupplierMain {
	
	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			return "Hello Java";
		};
		String string = s.get();
		System.out.println(string);
	}
}
