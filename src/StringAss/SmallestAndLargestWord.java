package StringAss;

import java.util.Scanner;

public class SmallestAndLargestWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		String ss[]=str.split("");
		int word=0;
		String largeWord="";
		for(int i=0;i<ss.length;i++)
		{
			word=ss[i].length();
			largeWord=ss[i];
		}
		System.out.println(largeWord);
	}

}