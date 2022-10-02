package java8project;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	int eno;
	String Ename;
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", Ename=" + Ename + "]";
	}
	
}

public class java8Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(10,"ayush"));
		l.add(new Employee(15,"ay"));
		l.add(new Employee(11,"u"));
		l.add(new Employee(5,"ayh"));
		Collections.sort(l,(I1,I2)->(I1.eno>I2.eno)?-1:(I1.eno<I2.eno)?1:0);
		System.out.println(l);
		

	}

}
