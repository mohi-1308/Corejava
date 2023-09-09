package comparable;

import java.util.ArrayList;

class Employeee implements Comparable<Employeee>{
	private String name;
	private double salary;
	
	public Employeee (String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getsalary() {
		return salary;
	}
	
	public void setsalary() {
		this.salary=salary;
	}
	
	public class compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

	
}

public class SortingComparable {

	public static void main(String[] args) {
		List<Employeee> employees=new ArrayList<>(Array.asList)

	}

}
