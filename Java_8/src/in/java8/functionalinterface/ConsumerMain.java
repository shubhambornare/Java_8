package in.java8.functionalinterface;

import java.util.function.Consumer;

public class ConsumerMain {
	
	public static void main(String[] args) {
		
		Consumer<Integer> c = (i)->{
			System.out.println("Hello Java");
		};
		c.accept(1);
	}
}
