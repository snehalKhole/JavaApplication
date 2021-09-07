package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(78);
		list.add(41);
		list.add(34);
		list.add(13);
		list.add(78);
		list.add(27);
		
		System.out.println(list);
		
		//Using toArray() method
		Integer[] a=list.toArray(new Integer[list.size()]);
		
		//Using traditional method
		for(int i=0;i<list.size();i++)
		{
			a[i]=list.get(i);
		}
		System.out.println(Arrays.toString(a));
		
//		for(Integer i:list)
//		{
//			System.out.print(i+" ");
//		}
	}

}
