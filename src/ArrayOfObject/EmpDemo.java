package ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

public class EmpDemo {

	public static void main(String[] args) {
		
		Employee[] e=new Employee[5];
		e[0]=new Employee(1,"snehal",865534.364f);
		e[1]=new Employee(2,"komal",6655.364f);
		e[2]=new Employee(3,"chitali",86.364f);
		e[3]=new Employee(4,"arti",1200.364f);
		e[4]=new Employee(5,"rohini",345534.364f);
//		
//	Scanner sc=new Scanner(System.in);
//		for(int i=0;i<e.length;i++)
//		//{
//		System.out.println("Enter emp id:");
//		int id=sc.nextInt();
//		System.out.println("Enter emp name:");
//		String name=sc.next();
//		System.out.println("Enter emp salary:");
//		float salary=sc.nextFloat();
//		e[1]=new Employee(id,name,salary);
//		}
		for(Employee emp:e)
		{
			if(emp.salary>10000)
			{
				System.out.println(emp);
			}
		}
	}

}
