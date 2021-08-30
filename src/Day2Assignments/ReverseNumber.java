package Day2Assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int lastDigit=1,n;
		int reverse=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		while(num>0)
		{
			int digit=num%10;
		reverse=reverse*10+digit;
		num=num/10;
		}
		System.out.println("Reverse:"+reverse);

	}

}
