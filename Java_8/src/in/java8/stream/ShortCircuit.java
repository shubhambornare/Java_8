package in.java8.stream;

import java.util.ArrayList;
import java.util.List;

import in.java8.Employee;

public class ShortCircuit {
	
	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shubham",1000.0));
		list.add(new Employee(3,"Akash",2000.0));
		list.add(new Employee(2,"Ashish",4000.0));
		list.add(new Employee(4,"Yash",3000.0));
		
		System.out.println(list.stream().allMatch(p->p.getEmpName().startsWith("A")));
		System.out.println("------");
		System.out.println(list.stream().noneMatch(p->p.getEmpName().startsWith("A")));
		System.out.println("------");
		System.out.println(list.stream().anyMatch(p->p.getEmpName().startsWith("A")));
		System.out.println("------");
		System.out.println(list.stream().findAny());
		System.out.println("------");
		System.out.println(list.stream().findFirst());
	}
}
