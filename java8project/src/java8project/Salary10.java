package java8project;

import java.util.*;
import java.util.stream.Collectors;

class Employee2
{
	private int id;
	private String name;
	private long salary;
	private int age;
	public Employee2(int id, String name, long salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
}

public class Salary10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee2> emp=new ArrayList<Employee2>();
		emp.add(new Employee2(1,"radhe",1000,25));
		emp.add(new Employee2(2,"ram",10000,20));
		emp.add(new Employee2(3,"krishna",11000,32));
		emp.add(new Employee2(4,"radheshyam",10010,27));
		emp.add(new Employee2(5,"shyam",10012,26));
		List<Employee2> emp1=emp.stream().filter(e->e.getAge()>25).map(e->
		{
			e.setSalary(e.getSalary()*10);
			return e;
		}).collect(Collectors.toList());
		System.out.println(emp1);
		

	}

}
