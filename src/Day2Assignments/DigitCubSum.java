package Day2Assignments;

import java.util.Scanner;

public class DigitCubSum {

	public static void main(String[] args) {
		int sum=0;
		int result = 1;
		int sqr=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int res=num%10;
		result=res*res*res;
		int fd=0;
		int mid=0;
		mid=(num/10)%10;
		sqr=mid*mid;
		while(num>0)
		{
			
			
				fd=num%10;
				num=num/10;
			
		}
		sum=result+fd+sqr;
		System.out.println("sum :"+sum);
	}
		
	}


