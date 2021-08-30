package ArrayDemo;

import java.util.Scanner;


public class AverageUsingMethod {
	
//	int arr[]= {2,5,8,3,1,7,0,2,4};
	
	
		public static int average(int[] arr)
		{
			int sum=0;
			float avg;
			

			for(int i=0;i<arr.length;i++)
			{
				
				sum=sum+arr[i];
			}
			
			
			System.out.println("Sum is:"+sum);
			avg=(float)sum/arr.length;
			System.out.println("Average is:"+avg);
			return sum;

		}
		
		public static double average(double arr[])
		{
			
			double sum=0;
			float avg;
			

			for(int i=0;i<arr.length;i++)
			{
				
				sum=sum+arr[i];
			}
			
			
			System.out.println("Sum is:"+sum);
			avg=(float)sum/arr.length;
			System.out.println("Average is:"+avg);
			return sum;

			
		}
		

	public static void main(String[] args) {
		int arr[]= {2,5,8,3,1,7,0,2,4};
		average(arr);
		average(arr);
		
	}

}
