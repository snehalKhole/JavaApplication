package Day1;

import java.util.Scanner;

public class NegativePostiveOrZero {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		i=sc.nextInt();
		if(i>0)
			System.out.println(i+":Numer is positive ");
		else if(i<0)
		System.out.println(i+":Number is negative");
		else 
			System.out.println(i+":Number is zero");
	

	}

}
