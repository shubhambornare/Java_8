package in.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import in.java8.Employee;

public class SortingEmployeeBySalary {
	
public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();  
		list.add(new Employee(1,"Shubham",4000.0));
		list.add(new Employee(3,"Raj",2000.0));
		list.add(new Employee(2,"Ashish",1000.0));
		list.add(new Employee(4,"Yash",3000.0));
		
		System.out.println(list.stream().sorted((a,b)-> a.getEmpSalary()>b.getEmpSalary()?1:a.getEmpSalary()<b.getEmpSalary()?-1:0).collect(Collectors.toList()));
		System.out.println("---------------------");
		List<Employee> collect = list.stream().sorted((a,b)-> a.getEmpSalary()>b.getEmpSalary()?1:a.getEmpSalary()<b.getEmpSalary()?-1:0).collect(Collectors.toList());
		System.out.println(collect.get(0).getEmpSalary());
		System.out.println("---------------------");
		List<Employee> collect1 = list.stream().sorted((a,b)-> a.getEmpSalary()<b.getEmpSalary()?1:a.getEmpSalary()>b.getEmpSalary()?-1:0).collect(Collectors.toList());
		System.out.println(collect1.get(0).getEmpSalary());
		
	}

}
