package Day1;

import java.util.Scanner;

public class SwappingDemo {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Before swapping value of a :");
		a=sc.nextInt();
		System.out.println("Before swapping value of b :");
		b=sc.nextInt();
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("after swapping value of a :"+a);
		 System.out.println("after swapping value of b :"+b);
	
	}

}
