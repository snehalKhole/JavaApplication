package Day5;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<num/2;++i)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("Not prime");
		else
			System.out.println("Prime");

	}

}
