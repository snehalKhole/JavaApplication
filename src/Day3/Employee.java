package Day3;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private float salary;
	

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


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter salary:");
		float salary=sc.nextFloat();
		
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		
		System.out.println("id:"+e.getId()+"\n"+"name:"+e.getName()+"\n"+"salary:"+e.getSalary());
	}

}
