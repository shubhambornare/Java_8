package in.java8.staticmethod;

public class StaticMain {
	
	public void m1() {
		System.out.println("Static Method Child");
	}
	
	public static void main(String[] args) {		
		StaticInterface.m1();	
	}

}
