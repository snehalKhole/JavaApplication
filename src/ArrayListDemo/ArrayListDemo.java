package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list.size());
		list.add("snehal");
		list.add("chaitali");
		list.add("swapnil");
		list.add("Arti");
		list.add("A");
		list.add("B");
		
		System.out.println(list);
		System.out.println(list.size());
		list.add("A");
		list.remove("B");
		
		//using traditional for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//Using iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Using for each
		System.out.println("for each");
		for(String s:list)
		{
			System.out.println(s);
		}
//		list.clear();
	}

}
