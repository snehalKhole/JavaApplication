package ExceptionHandling;

import java.util.Scanner;
public class CustomeExceptionDemo {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num<0)
		{
			throw new MyException("exception");
		}
		else
		{
			System.out.println("Number:"+num);
		}
		}
		catch(MyException e)
		{
			System.out.println("Exception caught");
			System.out.println(e);
		}
		
	}

}
