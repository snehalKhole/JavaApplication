package ArrayListDemo;

import java.util.ArrayList;

public class NonGenericArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(34);
		list.add("Snehal");
		list.add(new Integer(45));
		list.add('A');
		System.out.println(list);
		
	}

}
