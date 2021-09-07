package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListUsingIterator {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("Samina");
		list.add("manu");
		list.add("sonali");
		list.add("monika");
		list.add("chaitali");
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
