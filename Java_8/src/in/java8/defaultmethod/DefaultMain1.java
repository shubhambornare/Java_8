package in.java8.defaultmethod;

public class DefaultMain1 implements DefaultInterface {
	
	@Override
	public void m1() {
		System.out.println("Default Child ");
	}
	
	public static void main(String[] args) {
		
		DefaultMain1 d = new DefaultMain1();
		d.m1();		
	}
}
