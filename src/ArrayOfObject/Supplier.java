package ArrayOfObject;
import java.util.*;
public class Supplier {
	int supid;
	String supName;
	Item itemsupplied[];
	
	public String toString() {
		return "Supplier supid=" + supid + "\nsupName=" + supName+"\nSupplied Items"+Arrays.toString(itemsupplied) ;
	}


	public Supplier(int supid, String supName,Item[] items) {
		this.supid = supid;
		this.supName = supName;
		this.itemsupplied=items;
	}


	public static void main(String[] args) {
		Supplier s[];
		s=new Supplier[3];
		Item items[]=new Item[2];
		items[0]=new Item(1,"Soap");
		items[1]=new Item(2,"FaceWash");
	    s[0]=new Supplier(100,"abc",items);
		
		Item items1[]=new Item[3];
		items1[0]=new Item(1,"Vegitables");
		items1[1]=new Item(2,"Fruits");
		items1[2]=new Item(3,"GroceryItems");
		 s[1]=new Supplier(101,"xyz",items1);
		
		Item items2[]=new Item[3];
		items2[0]=new Item(1,"Bread");
		items2[1]=new Item(2,"Milk");
		items2[2]=new Item(3,"Eggs");
		 s[2]=new Supplier(102,"def",items2);
		
		System.out.println("Suppliers records are.......");
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		System.out.println("_________________________________");

		}
//		for(Supplier sup:s)
//		{
////			if(sup.supid==100)
////				System.out.println(Arrays.toString(sup.itemsupplied));
////		}
////		
//		for(Item i:sup.itemsupplied)
//		{
//			if(i.itemName.equals("Fruits"))
//				System.out.println("Supplier name is:"+sup.supName);
//			System.out.println(Arrays.toString(sup.itemsupplied));
//			System.out.println("___________________________________");
//		}
		}
	}
//}
