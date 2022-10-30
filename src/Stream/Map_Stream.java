package Stream;

import java.util.Arrays;
import java.util.List;

public class Map_Stream {
	
	class Employee
	{
		int salary;
		String name;
		public Employee(int salary, String name) {
			// TODO Auto-generated constructor stub
			this.salary=salary;
			this.name=name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> vechile=Arrays.asList("car","truck","bus","bike");
		vechile.stream().map(motor->motor.toUpperCase()).forEach(m->System.out.print(m+" "));
		System.out.println();
		vechile.stream().map(m->m.length()).forEach(m->System.out.print(m+" "));
		System.out.println();
		List<Integer> number=Arrays.asList(2,4,7,5,8);
		number.stream().map(num->num*3).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		List<Employee> emp_detail=Arrays.asList(new Map_Stream(). new  Employee(10000, "Satyam"),new Map_Stream(). new Employee(50000, "Satish"), new Map_Stream(). new  Employee(20000, "Shayam"));
	
		
		emp_detail.stream().filter(emp->emp.salary>10000).map(employee->employee.name.toUpperCase()).forEach(emp->System.out.print(emp+" "));
		
	}

}
