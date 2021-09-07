package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmpUsingComparator {
	
	String name;
	String designation;
	int age;

	public EmpUsingComparator(String name, String designation, int age) {
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
		ArrayList<EmpUsingComparator>emp=new ArrayList<>();
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
			emp.add(new EmpUsingComparator(name,desig,age));
			
		}
		Collections.sort(emp,new ComparatorDemo1());
		for(EmpUsingComparator s:emp)
		{
			System.out.println(s);
		}
	}

}
class ComparatorDemo1 implements Comparator<EmpUsingComparator>
{

	@Override
	public int compare(EmpUsingComparator o1, EmpUsingComparator o2) {
		return o1.name.compareTo(o2.name);
	}
	
}