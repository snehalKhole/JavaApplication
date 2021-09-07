package Day1;

import java.util.Scanner;

public class LeapYrOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("year is leap");
		}
		else 
			System.out.println("year is not leap year");
		
	}

}
