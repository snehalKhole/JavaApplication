package Day1;

import java.util.Scanner;

public class NoIs3DigitOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		if(num>=100 && num<=999)
		{
			System.out.println("number is 3 digit number");
		}
		else 
			System.out.println("number is not three digit number");
		int sum=0;
		int fd=0,ld;
		
		ld=num%10;
		while(num>0)
		{
			fd=num%10;
			
			num=num/10;
		}
		sum=fd+ld;
		System.out.println("sum of first and last digit is:"+sum);
	}

}
