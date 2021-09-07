package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		Integer a[]= {23,56,89,54,23};
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
		Collections.addAll(list, a);
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			list.add(a[i]);
//		}
		
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		
	}

}
