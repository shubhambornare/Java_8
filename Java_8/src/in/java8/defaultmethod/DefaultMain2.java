package in.java8.defaultmethod;

public class DefaultMain2 implements DefaultInterface {
	
	@Override
	public void m1() {
		DefaultInterface.super.m1();
	}
	
	public static void main(String[] args) {
		
		DefaultMain2 d = new DefaultMain2();
		d.m1();		
	}
}
