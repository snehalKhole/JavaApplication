package Day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 num:");
		int a=sc.nextInt();
		byte b=sc.nextByte();
		float c=sc.nextFloat();
		float add=a+b+c;
		System.out.println("Addition:"+add);
		
		System.out.println("Enter name:");
		String n=sc.next();
		System.out.println("name:"+n);
		
		System.out.println("Enter height:");
		float h=sc.nextFloat();
		System.out.println("Height:"+h);
		
		System.out.println("Enter boolean value:");
		boolean bol=sc.nextBoolean();
		System.out.println("boolean value:"+bol);
		
		System.out.println("Enter mo no:");
		long mo=sc.nextLong();
		System.out.println("mobile no:"+mo);
		
		System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		
	}

}
