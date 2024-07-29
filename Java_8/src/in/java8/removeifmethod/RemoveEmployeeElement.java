package in.java8.removeifmethod;

import java.util.ArrayList;
import java.util.List;

import in.java8.Employee;

public class RemoveEmployeeElement {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shubham",4000.0));
		list.add(new Employee(3,"Raj",2000.0));
		list.add(new Employee(2,"Ashish",1000.0));
		list.add(new Employee(4,"Yash",3000.0));
		
		list.removeIf(s->s.getEmpName().equalsIgnoreCase("ashish"));
		System.out.println(list);
		
	}

}
