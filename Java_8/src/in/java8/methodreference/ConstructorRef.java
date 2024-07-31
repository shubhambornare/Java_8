package in.java8.methodreference;

public class ConstructorRef {
	
public static void main(String[] args) {
		
		//using lambda
		Test t = (x, y)->{
			new ConstructorRef(x, y);
		};
		t.add(10, 20);
		
		Test t1 = ConstructorRef :: new;
		t1.add(10, 20);
	}
	
	 ConstructorRef(int x, int y) {
		System.out.println(x+y);
	}

}
