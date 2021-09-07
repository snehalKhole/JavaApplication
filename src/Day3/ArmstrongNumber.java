package Day3;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int temp=0;
		int sum=0,a,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(temp>0)
		{
			a=temp%10;
			sum=sum+(a*a*a);
			temp=temp/10;
		}
		if(sum==n)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
		
		
	}

}
