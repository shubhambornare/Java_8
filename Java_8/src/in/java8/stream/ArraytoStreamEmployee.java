package in.java8.stream;

import java.util.Arrays;

import in.java8.Employee;

public class ArraytoStreamEmployee {
	
	public static void main(String[] args) {
		
		Employee[] arr = new Employee[6];
		arr[0] = new Employee(2,"Ramesh",1000.0);
		arr[1] = new Employee(1,"Shubham",2000.0);
		arr[2] = new Employee(3,"Ashish",4000.0);
		arr[3] = new Employee(6,"Raj",6000.0);
		arr[4] = new Employee(5,"Ram",3000.0);
		arr[5] = new Employee(4,"Sham",5000.0);
		
		Arrays.stream(arr).sorted((a,b)-> a.getEmpSalary()>b.getEmpSalary()?1:a.getEmpSalary()<b.getEmpSalary()?-1:0).forEach(r->System.out.println(r));
		 
	}

}
