package ArrayListDemo;

import java.util.ArrayList;

public class Replace2Element {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("Samina");
		list.add("manu");
		list.add("sonali");
		list.add("monika");
		list.add("chaitali");
		
		list.set(2, "rohini");
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
