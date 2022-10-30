package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {

	class Employee
	{
		int salary,id;
		String name;
		public Employee(int salary, int id, String name) {
			// TODO Auto-generated constructor stub
			this.salary=salary;
			this.id=id;
			this.name=name;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee=new ArrayList<Employee>(); 
		employee.add(new ParallelStreams().new Employee(20000, 5, "Kendy"));
		employee.add(new ParallelStreams().new Employee(10000, 10, "Sony"));
		employee.add(new ParallelStreams().new Employee(50000, 2, "Mamba"));
		employee.add(new ParallelStreams().new Employee(90000, 6, "Bulb"));
		employee.add(new ParallelStreams().new Employee(60000, 9, "Doge"));

		
		//parallel stream
		employee.parallelStream().filter(emp->emp.salary>10000).forEach(emp->System.out.println(emp.name+" "+emp.id+" "+emp.salary));
		System.out.println();
		//
		employee.stream().filter(emp->emp.salary>10000).forEach(emp->System.out.println(emp.name+" "+emp.id+" "+emp.salary));
	
	}
	
}
