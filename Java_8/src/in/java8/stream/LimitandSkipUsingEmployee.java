package in.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import in.java8.Employee;

public class LimitandSkipUsingEmployee {
	
public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shubham",4000.0));
		list.add(new Employee(3,"Raj",2000.0));
		list.add(new Employee(2,"Ashish",1000.0));
		list.add(new Employee(4,"Yash",3000.0));
	
		System.out.println(list.stream().sorted((a,b)-> a.getEmpSalary()>b.getEmpSalary()?1:a.getEmpSalary()<b.getEmpSalary()?-1:0).limit(2).skip(1).collect(Collectors.toList()));
		System.out.println("---------------------");
		System.out.println(list.stream().sorted((a,b)-> a.getEmpSalary()<b.getEmpSalary()?1:a.getEmpSalary()>b.getEmpSalary()?-1:0).limit(2).skip(1).collect(Collectors.toList()));
	}
}
