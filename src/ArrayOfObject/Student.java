package ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private long mono;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, long mono) {
		super();
		this.id = id;
		this.name = name;
		this.mono = mono;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mono=" + mono + "]";
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
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}


	public static void main(String[] args) {
		Student[] s=new Student[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Enter id,name,moNo");
		int id=sc.nextInt();
		String name=sc.next();
		long mono=sc.nextLong();
		s[i]=new Student(id,name,mono); 
		System.out.println(s[i]);
		System.out.println("_____________________________________________-");
		//Using getter setter
		s[i].setId(id);
		s[i].setName(name);
		s[i].setMono(mono);
		System.out.println("Id:"+s[i].getId()+"\n"+"Name:"+s[i].getName()+"\n"+"Mobile No:"+s[i].getMono());
		
		}
	}

}
