package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println("Square:"+num*num);
	}
		catch(InputMismatchException e)
		{
			System.out.println("wrong data");
		}
		
		
	}

}
