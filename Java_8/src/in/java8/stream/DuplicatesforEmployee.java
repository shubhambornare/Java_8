package in.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import in.java8.Employee;

public class DuplicatesforEmployee {
	
public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shubham",1000.0));
		list.add(new Employee(3,"Akash",2000.0));
		list.add(new Employee(2,"Ashish",4000.0));
		list.add(new Employee(4,"Yash",2000.0));
		list.add(new Employee(4,"Shubham",3000.0));
	
		//remove duplicates
		list.stream().distinct().forEach(p->System.out.println(p));
		System.out.println("-------------");
		System.out.println(list.stream().collect(Collectors.toSet()));
		System.out.println("-------------");
		//find duplicates
		list.stream().filter(f->list.indexOf(f) != list.lastIndexOf(f)).forEach(s->System.out.println(s));
		System.out.println("-------------");
		//find unique
		list.stream().filter(f->list.indexOf(f) == list.lastIndexOf(f)).forEach(s->System.out.println(s));
		
		
	}
}
