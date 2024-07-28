package in.java8.lambda;

public class AdditionMain {
	
	public static void main(String[] args) {
		
		AdditionInterface i = (a,b)->{
			System.out.println(a+b);
		};
		i.add(10,20);
		
	}
}
