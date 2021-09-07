package ArrayListDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseUsingListIterstor {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(78);
		list.add(41);
		list.add(34);
		list.add(13);
		list.add(78);
		list.add(27);
		ListIterator<Integer>itr=list.listIterator(list.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	
	}

}
