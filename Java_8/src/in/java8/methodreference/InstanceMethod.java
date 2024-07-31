package in.java8.methodreference;

public class InstanceMethod {
	
	public static void main(String[] args) {
		
		InstanceMethod i = new InstanceMethod();
		
		//using lambda
		Test t = (x,y)->{
			i.validate(x, y);
		};
		t.add(10, 20);
		
		//using method reference
		
		Test t1 = i :: validate;
		t1.add(10, 20);
	}
	
	public void validate(int x, int y) {
		System.out.println(x+y);
	}
}
