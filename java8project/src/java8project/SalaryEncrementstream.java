package java8project;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
class Employee1
{
	private int id;
	private String name;
	private long salary;
	public Employee1(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class SalaryEncrementstream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> e=Arrays.asList(
			new Employee1(1,"ayush",10000),
			new Employee1(2,"ayu",10000)
				);
		System.out.println(e);
		List<Employee1> emp=e.stream().filter(i->i.getId()>1).map(i->
		{
			i.setSalary(i.getSalary()*10/100+i.getSalary());
			return i;
		}).collect(Collectors.toList());
		System.out.print(emp);

	}

}
