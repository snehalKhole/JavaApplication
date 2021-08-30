package ArrayOfObject;

import java.util.Scanner;

public class Stud {
	int id;
	String name;
	Course[] cr;
	

	public Stud(int id, String name, Course[] cr) {
		super();
		this.id = id;
		this.name = name;
		this.cr = cr;
	}




	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", cr=" + cr + "]";
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stud s[]=new Stud[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter stud id,name:");
			int id=sc.nextInt();
			String name=sc.next();
			System.out.println("how many course you want to enter:");
			int size=sc.nextInt();
			
			Course c[]=new Course[size];
			for(int j=0;j<c.length;j++)
			{
				System.out.println("Enter course id and name:");
				int cid=sc.nextInt();
				String cname=sc.next();
				c[j]=new Course(cid,cname);
			}
			s[i]=new Stud(id,name,c);
			
			for(Stud st:s)
			{
				System.out.println(st);
			}
		}
		
	}

}
class Course
{
	int cid;
	String cname;
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}