package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentIterate {
	int id;
	String name;
	int percent;

	public StudentIterate(int id, String name, int percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "StudentIterate [id=" + id + ", name=" + name + ", percent=" + percent + "]";
	}

	public static void main(String[] args) {
		ArrayList<StudentIterate>s=new ArrayList<>();
		s.add(new StudentIterate(1,"Snehal",90));
		s.add(new StudentIterate(2,"Manu",80));
		s.add(new StudentIterate(3,"Chaitali",89));
		s.add(new StudentIterate(4,"Bharati",78));
		s.add(new StudentIterate(5,"Dipti",77));
		
		Iterator<StudentIterate>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
