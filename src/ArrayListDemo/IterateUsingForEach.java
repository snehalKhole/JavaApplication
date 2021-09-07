package ArrayListDemo;

import java.util.ArrayList;

public class IterateUsingForEach {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("Samina");
		list.add("manu");
		list.add("sonali");
		list.add("monika");
		list.add("chaitali");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
