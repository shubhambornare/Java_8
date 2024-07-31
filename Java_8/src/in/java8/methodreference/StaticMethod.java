package in.java8.methodreference;

public class StaticMethod {
	
public static void main(String[] args) {
		
		
		//using lambda
		Test t = (x,y)->{
			StaticMethod.validate(x, y);
		};
		t.add(10, 20);
		
		//using method reference
		
		Test t1 = StaticMethod :: validate;
		t1.add(10, 20);
	}
	
	public static void validate(int x, int y) {
		System.out.println(x+y);
	}

}
