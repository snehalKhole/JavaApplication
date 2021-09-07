package Day2Assignments;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,product=1,sum=0;
		int ld;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		n=sc.nextInt();
	
		while(n>0)
		{
			ld=n%10;
			sum=sum+ld;
			product=product*ld;
			n=n/10;
		}
		
		
		if(sum==product)
			System.out.println("Given number is spy");
		else
			System.out.println("number is not spy");
	}

}
