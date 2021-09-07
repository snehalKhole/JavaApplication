package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator {
	int id;
	String name;
	int percent;
	

	public MyComparator(int id, String name, int percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}


	public MyComparator() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "MyComparator [id=" + id + ", name=" + name + ", percent=" + percent + "]";
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


	public int getPercent() {
		return percent;
	}


	public void setPercent(int percent) {
		this.percent = percent;
	}


	public static void main(String[] args) {
		ArrayList<MyComparator>list=new ArrayList<>();
		list.add(new MyComparator(3,"Snehal",89));
		list.add(new MyComparator(2,"Manu",89));
		list.add(new MyComparator(4,"Chaitali",89));
		list.add(new MyComparator(1,"Dipti",89));
		
		
		
		Collections.sort(list,new MyClass());
		for(MyComparator c:list)
		{
			System.out.println(c);
		}
		

	}

}
class MyClass implements Comparator<MyComparator>
{

	@Override
	public int compare(MyComparator o1, MyComparator o2) {
		
		return o1.id-o2.id;
	}
	}