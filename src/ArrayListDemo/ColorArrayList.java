package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorArrayList {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("yellow");
		list.add("blue");
		list.add("orange");
		list.add("Green");
		list.add("white");
		list.add("black");
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
