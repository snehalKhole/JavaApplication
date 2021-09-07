package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("Samina");
		list.add("manu");
		list.add("sonali");
		list.add("monika");
		list.add("chaitali");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		int c=Collections.frequency(list, "snehal");
		System.out.println("frequency:"+c);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
