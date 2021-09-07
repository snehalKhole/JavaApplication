package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stud {
	int id;
	String name;
	int percent;

	public Stud(int id, String name, int percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", percent=" + percent + "]";
	}

	public static void main(String[] args) {
		ArrayList<Stud>stud=new ArrayList<>();
		stud.add(new Stud(4,"Snehal",90));
		stud.add(new Stud(2,"Manu",80));
		stud.add(new Stud(1,"komal",78));
		stud.add(new Stud(3,"chaitali",95));
		
//		Collections.sort(stud,new ComparatorDemo());
		Collections.sort(stud,new MyDemo());
		for(Stud s:stud)
		{
			System.out.println(s);
		}
	}

}
class ComparatorDemo implements Comparator<Stud>
{

	@Override
	public int compare(Stud o1, Stud o2) {
		//logic for ascending
//		return o1.percent-o2.percent;
		
		//logic for descending
		return o2.percent-o1.percent;
		
	}
	


}

class MyDemo implements Comparator<Stud>
{

	@Override
	public int compare(Stud o1, Stud o2) {
		// TODO Auto-generated method stub
		return o1.percent-o2.percent;
	}
	
}