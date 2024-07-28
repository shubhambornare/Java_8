package in.java8.functionalinterface;

public class RunnableMain {
	
	public static void main(String[] args) {
		
		Runnable r = ()->
			System.out.println("Hi");
			Thread t = new Thread(r);
			t.run();		
	}
}
