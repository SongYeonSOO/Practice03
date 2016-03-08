package prob6;

public class Employee {

	private String name;
	private int salary;
	private String depart;
	public Employee() {
	}

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void getInformation() {
		// Same as C!
		System.out.printf( "이름: %s   연봉: %d\n", name, salary );
	}
}
