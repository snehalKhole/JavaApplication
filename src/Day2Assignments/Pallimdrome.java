package Day2Assignments;

import java.util.Scanner;

public class Pallimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,r,temp;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
//			System.out.println(sum);
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println(" Pallimdrome");
		else
			System.out.println("not Pallimdrome");
	}

}
