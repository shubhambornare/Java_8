package in.java8.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerMain {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer,String> c = (i,j)->{
			System.out.println("Hello Java");
		};
		c.accept(1,"Hi");
	}
}
