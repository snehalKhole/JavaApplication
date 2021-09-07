package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>
{
	int id;
	String name;
	int percent;
	

	public Student(int id, String name, int percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percent=" + percent + "]";
	}


	public static void main(String[] args) {
		ArrayList<Student>stud=new ArrayList<>();
		stud.add(new Student(4,"Snehal",90));
		stud.add(new Student(2,"Manu",80));
		stud.add(new Student(1,"komal",78));
		stud.add(new Student(3,"chaitali",95));
		
		Collections.sort(stud);
		for(Student s:stud)
		{
			System.out.println(s);
		}
	}


	@Override
	public int compareTo(Student o) {
		//logic for descending
//		if(o.id<this.id)
//			return -1;
//		else if(o.id>this.id)
//			return 1;
//		return 0;
		
		//logic for ascending
//		if(this.id<o.id)
//			return -1;
//		else if(this.id>o.id)
//			return 1;
//		return 0;
//		return this.id-o.id;
		return o.id-this.id;

	}

}
