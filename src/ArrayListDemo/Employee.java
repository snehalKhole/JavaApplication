package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee implements Comparable<Employee> 
{
	String name;
	String designation;
	int age;

	public Employee(String name, String designation, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Employee:");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			System.out.println("Enter Emp name:");
			String name=sc.next();
			System.out.println("Enter Emp designation:");
			String desig=sc.next();
			System.out.println("Enter Emp age:");
			int age=sc.nextInt();
			emp.add(new Employee(name,desig,age));
			
		}
		Collections.sort(emp);
		for(Employee s:emp)
		{
			System.out.println(s);
		}
		
	}


	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}

