package ArrayOfObject;

public class Employee {
	int id;
	String name;
	float salary;
	

	public Employee(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public String toString() {
		return "\nEmployee id=" + id + "\nName=" + name + "\nSalary=" + salary;
	}




}
