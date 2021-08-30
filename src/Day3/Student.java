package Day3;

public class Student {
	
		int id=1;
		String name="Snehal";
		
		void accept(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		void display()
		{
			System.out.println("id:"+id);
			System.out.println("name:"+name);
		}

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		s.accept(101, "manu");
		s.display();
		System.out.println(s);
		Student s1=new Student();
		System.out.println(s1);
	}

}
