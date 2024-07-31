package in.java8.stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import in.java8.Employee;

public class SummaryofEmployee {
	
public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shubham",4000.0));
		list.add(new Employee(3,"Raj",2000.0));
		list.add(new Employee(2,"Ashish",1000.0));
		list.add(new Employee(4,"Yash",3000.0));
	
		System.out.println(list.stream().collect(Collectors.summarizingDouble(p->p.getEmpSalary())));
		System.out.println("-----------------");
		DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(p->p.getEmpSalary()));
		System.out.println(collect);
		System.out.println("-----------------");
		System.out.println("Number of Records : " +list.stream().count());
	}
}
