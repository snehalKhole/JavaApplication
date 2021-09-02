package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		
		int arr[];
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array:");
			int size=sc.nextInt();
			int sum=0;
			arr=new int[size];
			System.out.println("Enter array elements:");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			System.out.println("Sum:"+sum);
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Error type is:"+e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Message:"+e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Message:"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception bloch");
		}

	}

}
