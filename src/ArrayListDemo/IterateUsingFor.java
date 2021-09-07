package ArrayListDemo;

import java.util.ArrayList;

public class IterateUsingFor {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("Samina");
		list.add("manu");
		list.add("sonali");
		list.add("monika");
		list.add("chaitali");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
